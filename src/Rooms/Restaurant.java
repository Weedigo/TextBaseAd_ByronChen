package Rooms;

import People.Person;
import Food.Food;
import Food.Pasta;
import Food.Pizza;
import Food.Steak;

import java.util.Scanner;

public class Restaurant extends Room
{
    Food Steak;
    Food Pasta;
    Food Pizza;
    public Bar(int x, int y) {
        super(x, y);
    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public String toString() {
        String brack = "";
        brack = "[B]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }

}
