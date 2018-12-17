package Rooms;

import Game.Runner;
import People.Person;
import Baddies.SADA;
import Baddies.DarkD;

import java.util.Scanner;

public class WinningRoom extends Room
{
    DarkD SADA;
    public WinningRoom(int x, int y) {
        super(x, y);
        this.SADA = new SADA();

    }

    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Monster appears.");
        Scanner choice = new Scanner(System.in);
        SADA.attackM(x);
        // after the boss fight players get exp
        x.earnExp(2);
        System.out.println("Your health: " + x.getHealth());
    }


}