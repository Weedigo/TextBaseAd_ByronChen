package Rooms;

import People.Person;

public class Room {
    Person occupant;
    int xLoc,yLoc;

    public Room(int x, int y)
    {
        xLoc = x;
        yLoc = y;
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    public void enterRoom(Person x)
    {
        System.out.println("You walk to another block...");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    /**
     * Removes the player from the room.
     */
    public void leaveRoom()
    {
        occupant = null;
    }

    public String toString() {
        String brack = "";
        brack = brack + "[ ]";
        if (occupant != null) {
            return "[x}";
        }
        return brack;
    }

}