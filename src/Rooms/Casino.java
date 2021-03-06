package Rooms;

import People.Person;

import java.util.Scanner;

public class Casino extends Room
{
    public Casino(int x, int y) {
        super(x, y);
    }

    /**
     * The player enters the Casino "room", this will be the interaction that follows in a Casino.
     * @param x the Person entering
     *
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You stumble upon a casino.");
        System.out.println("Guy in the front: Come on in!(Say 'Yes' to enter)");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        ans =ans.toLowerCase().trim();
        if(ans.equals("yes")){
            System.out.println("You went in and gambled...");
            int win = (int)(Math.random()*5+1);
            if(win == 1){
                System.out.println("You won 100 dollars!");
                x.getMoney(100);
                System.out.println("You now have: $" + x.getBalance());
            } else{
                System.out.println("You lost and lose 50 dollars.");
                x.loseMoney(50);
                System.out.println("You now have: $" + x.getBalance());
            }
        } else {
            System.out.println("You keep walking.");
        }
    }
    //show the Casino on the map
    public String toString() {
        String brack = "[C]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }

}