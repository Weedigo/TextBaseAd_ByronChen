package Game;

import People.Person;
import Rooms.Restaurant;
import Rooms.Room;
import Rooms.Casino;
import Rooms.WorkPlace;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        System.out.println("Hello, please input a username:");
        Scanner sc = new Scanner(System.in);
        player1.getName();
        System.out.println("Welcome to the first establishment of the game of life.");
        System.out.println("In this part of the story, you are stranded in an unknown city, with no way back home.");
        System.out.println("There is a restaurant, a casino, and a job center in the city.");
        System.out.println("Using these landmarks, you can try to make $700 dollars without losing all your health to go back home.");
        System.out.println("However, you could also explore the city as long as you want, as long as you are alive.");
        System.out.println("You have $350 in your pocket and your health level is 5.");
        System.out.println("Good luck, and most of all, enjoy your experience in this city.");
        String size = "";
        int area = 0;
        while(!size.equals("nyc") && !size.equals("boston") && !size.equals("newark")){
            System.out.println("Chose your city: NYC, Boston, Newark ");
            size = sc.nextLine();
            size= size.toLowerCase().trim();
            if(size.equals("nyc")){
                area = 9;
                break;
            } else if(size.equals("boston")){
                area = 7;
                break;
            } else if(size.equals("newark")){
                area = 5;
                break;
            }
        }

        Room[][] building = new Room[area][area];

        //Fill the building with normal rooms
        for (int x = 0; x<building.length; x++)
        {
            for (int y = 0; y < building[x].length; y++)
            {
                building[x][y] = new Room(x,y);
            }
        }

        //Create a random winning room.
        int x = (int)(Math.random()*building.length);
        int y = (int)(Math.random()*building.length);
        building[x][y] = new Casino(x, y);

        int q = (int)(Math.random()*building.length);
        int w = (int)(Math.random()*building.length);
        building[q][w] = new WorkPlace(q, w);

        int e = (int)(Math.random()*building.length);
        int r = (int)(Math.random()*building.length);
        building[e][r] = new Restaurant(e, r);

        //Setup player 1 and the input scanner
        Person player1 = new Person("",0,0, 5, 350);
        building[0][0].enterRoom(player1);
        Board map = new Board(building);
        map.printBoard();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Which direction would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("You are at: " + player1.getxLoc() + " Street " + player1.getyLoc() + " Avenue");
                map.printBoard();
            }
            else {
                System.out.println("There is a city border.");
            }
            if(player1.checkHealth() <= 0){
                System.out.println("You die alone of malnutrition, never to be found by your family.");
                gameOff();
            }
            if(player1.getBalance() > 700 && player1.checkHealth() > 0){
                System.out.println("Congratulations, you have succeed in buying a ticket back home.");
                gameOff();
            }
        }
        in.close();
    }

    /**
     * Checks that the movement chosen is within the valid game map.
     * @param move the move chosen
     * @param p person moving
     * @param map the 2D array of rooms
     * @return
     */
    private static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom();
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom();
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom();
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0) {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom();
                    map[p.getxLoc()][p.getyLoc() - 1].enterRoom(p);
                    return true;
                }
                    return false;
            default:
                break;

        }
        return true;
    }
    private static void gameOff()
    {
        System.out.println("Thank you for playing the game.");
        System.out.println("Whether you have lost or succeed, it is important to cherish the experience.");
        System.out.println("At the end of the day, we are all dead- John Maynard Keynes");
        gameOn = false;
    }



}
