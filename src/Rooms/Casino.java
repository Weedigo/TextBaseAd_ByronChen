package Rooms;

import Game.Runner;
import People.Person;

import java.util.Scanner;

public class Casino extends Room
{
    public Casino(int x, int y) {
        super(x, y);
    }

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
                System.out.println("You won 200 dollars!");
                x.getMoney(200);
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
    public String toString() {
        String brack = "";
        brack = "[C]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }

}