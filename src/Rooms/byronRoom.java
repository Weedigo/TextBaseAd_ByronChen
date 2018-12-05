package Rooms;

import Game.Runner;
import People.Person;

public class byronRoom extends Room
{

    public byronRoom(int w, int e) {
        super(w, e);

    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the winning room! Ten points for Gryffindor.");
        Runner.gameOff();
    }


}