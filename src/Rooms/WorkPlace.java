package Rooms;

import Game.Runner;
import Jobs.Construction;
import Jobs.Delivery;
import Jobs.Janitor;
import Jobs.Jobs;
import People.Person;


import java.util.Scanner;

public class WorkPlace extends Room
{
    Jobs Construction;
    Jobs Delivery;
    Jobs Janitor;
    public WorkPlace(int x, int y) {
        super(x, y);
        this.Construction = new Construction();
        this.Delivery = new Delivery();
        this.Janitor = new Janitor();
    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You got offered a variety of jobs: construction, delivery, and janitor. Choose one.");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        ans.toLowerCase().trim();
        if(ans.equals("construction")){
            System.out.println("You do construction and your health diminishes by a lot from hard labor.");
            Construction.hurt(x);
            Construction.pay(x);
            System.out.println("Your balance is now: $" + x.getBalance());
            System.out.println("You're health rating is " + x.checkHealth());
        }
        else if(ans.equals("delivery")){
            System.out.println("You delivery food in the comfort of your car.");
            System.out.println("Even thought you make less due to the cost of car and gas, you are happy.");
            Delivery.pay(x);
            System.out.println("Your balance is now: $" + x.getBalance());
            System.out.println("You're health rating is still " + x.checkHealth());
        }
        else if(ans.equals("janitor")){
            System.out.println("You work a good schedule job, but the hours are really low and the constant smell of chlorine damages your health.");
            Janitor.hurt(x);
            Janitor.pay(x);
            System.out.println("Your balance is now: $" + x.getBalance());
            System.out.println("You're health rating is " + x.checkHealth());
        } else {
            System.out.println("You stay unemployed, your balance is still $" + x.getBalance());
        }
    }
}
