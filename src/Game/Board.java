package Game;

import Rooms.Room;

public class Board {
    private Room[][] map;
    public Board(Room [][] Board)
    {
        this.map= Board;
    }
//prints out the board
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
