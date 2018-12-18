package Jobs;
import People.Person;

public class Jobs {
    public int pain;
    public int gain;
    public void hurt(Person x) {
        x.loseHealth(pain);
    }
    public void pay(Person x){
        x.getMoney(gain);
    }
}