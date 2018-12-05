package Game;

import Rooms.Room;
import People.Person;

public class Board {
    private Room[][] map;
    private int length;
    private int width;

    public Board(int length, int width) {
        this.map= new Room[length][width];
    }

    public Room[][] getBoard() {
        return this.map;
    }

    public void printBoard()
    {
        String blocks ="";
        for(int i=0; i< this.map.length; i++) {
            blocks="";
            for(int j =0; j<map[i].length; j++) {
                blocks = blocks + this.map[i][j].toString();
            }
            System.out.println(blocks);
        }
    }
}
