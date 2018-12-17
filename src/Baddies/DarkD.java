package Baddies;
import People.Person;

public class DarkD {
    public int attack;
    public int health;
    public void attackM(Person x){
        x.removeHealth(attack);
    }
}
