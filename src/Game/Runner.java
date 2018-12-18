package Game;

import People.Person;
import Rooms.Room;
import Rooms.Casino;
import Rooms.WorkPlace;

import java.util.Scanner;

public class Runner {


    private static boolean gameOn = true;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Chose your city size: large, medium, or small.");
        String size = "";
        int area = 0;
        while(!size.equals("large") || !size.equals("small")){
            size = sc.nextLine();
            size= size.toLowerCase().trim();
            if(size.equals("large")){
                area = 7;
                break;
            } else if(size.equals("small")){
                area = 3;
                break;
            } else{
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

        //Setup player 1 and the input scanner
        Person player1 = new Person("FirstName", "FamilyName", 0,0, 5, 350);
        building[0][0].enterRoom(player1);
        Board map = new Board(building);
        map.printBoard();
        Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, building))
            {
                System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
                map.printBoard();
            }
            else {
                System.out.println("Please choose a valid move.");
            }
            if(player1.checkHealth() == 0){
                System.out.println("You died");
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
    public static boolean validMove(String move, Person p, Room[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
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
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
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
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }



}
