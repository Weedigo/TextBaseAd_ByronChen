package Rooms;

import People.Person;
import Food.Food;
import Food.Beans;
import Food.Pizza;
import Food.Steak;

import java.util.Scanner;

public class Restaurant extends Room
{
    private Food Steak;
    private Food Beans;
    private Food Pizza;
    public Restaurant(int x, int y) {
        super(x, y);
        this.Steak = new Steak();
        this.Pizza = new Pizza();
        this.Beans = new Beans();
    }

    /**
     * The player enters the restaurant, here is the interaction that is different from a normal room.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You see a restaurant.");
        System.out.println("Would you like to go in?(Yes/No)");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        ans = ans.toLowerCase();
        if(ans.equals("yes")){
            System.out.println("You walk in the bar.");
            System.out.println("Server: Hello, what would you like to order?");
            System.out.println("It was your first time here, you stare at the menu.");
            System.out.println("Food: Pizza($50), Beans($100), and Steak($200)");
            String order = sc.nextLine();
            order = order.toLowerCase();
            if(order.equals("pizza")){
                System.out.println("The pizza was pretty good, but not much nutrients.");
                Pizza.eat(x);
            }
            if(order.equals("beans")){
                System.out.println("Beans was pretty filling. It has fiber and protein.");
                Beans.eat(x);
            }
            if(order.equals("steak")){
                System.out.println("The steak was darn good. You had a great meal.");
                Steak.eat(x);
            } if(!order.equals("steak") && !order.equals("beans") && !order.equals("pizza")){
                System.out.println("You said something unintelligible, your autism kicks in and you left the restaurant.");
            }
        }
        if(ans.equals("no")){
            System.out.println("You walk away. The server by the window looks disappointed.");
        }

    }
    //show the Restaurant on the map
    public String toString() {
        String brack = "[R]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }

}
