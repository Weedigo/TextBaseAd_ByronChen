package Game;

import Rooms.Room;
import People.Person;

public class Board {
    private Room[][] Board;
    public Board(Room [][] Board)
    {
        this.Board= Board;
    }
        public void fill ()
        {
            String play = "";
            for(int i = 0; i < Board.length; i++)
            {
                for(int j = 0; j < Board[i].length; j++)
                {
                    play += Board[i][j];
                    System.out.println(play);
                }
            }
        }
        public void printBoard()
        {
            String blocks ="";
            for(int i=0; i< this.Board.length; i++)
            {
                for(int j =0; j<Board[i].length; j++)
                {
                    blocks += Board[i][j].toString();
                }
            System.out.println(blocks);
                blocks= "";
        }

    }

}
