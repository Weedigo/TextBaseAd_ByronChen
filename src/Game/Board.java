package Game;

import Rooms.Room;
import People.Person;

public class Board {
    private Room[][] map;
    public Board(Room [][] Board)
    {
        this.map= Board;
    }

        public void printBoard()
        {
            String blocks ="";
            for(int i=0; i< this.map.length; i++)
            {
                for(int j =0; j<map[i].length; j++)
                {
                    blocks += map[i][j].toString();
                }
            System.out.println(blocks);
                blocks= "";
        }

    }

}
