package Rooms;
import Jobs.Construction;
import Jobs.Delivery;
import Jobs.Janitor;
import Jobs.Jobs;
import People.Person;


import java.util.Scanner;

public class WorkPlace extends Room
{
    private Jobs Construction;
    private Jobs Delivery;
    private Jobs Janitor;
    public WorkPlace(int x, int y) {
        super(x, y);
        this.Construction = new Construction();
        this.Delivery = new Delivery();
        this.Janitor = new Janitor();
    }

    /**
     * The user enters the Workplace. Here they can choose jobs. Each with their own affect.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You got offered a variety of jobs: construction, delivery, and janitor. Choose one.");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        ans =ans.toLowerCase();
        if(ans.equals("construction")){
            Construction.jobDesc();
            Construction.hurt(x);
            Construction.pay(x);
            System.out.println("Your balance is now: $" + x.getBalance());
            System.out.println("You're health rating is " + x.checkHealth());
        }
        else if(ans.equals("delivery")){
            Delivery.jobDesc();
            Delivery.pay(x);
            System.out.println("Your balance is now: $" + x.getBalance());
            System.out.println("You're health rating is still " + x.checkHealth());
        }
        else if(ans.equals("janitor")){
            Janitor.jobDesc();
            Janitor.hurt(x);
            Janitor.pay(x);
            System.out.println("Your balance is now: $" + x.getBalance());
            System.out.println("You're health rating is " + x.checkHealth());
        } else {
            System.out.println("You stay unemployed, your balance is still $" + x.getBalance());
        }
    }
    //show the WorkPlace on the map
    public String toString() {
        String brack = "[W]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }
}
