package Jobs;
import People.Person;
//abstract parent class of the jobs
public abstract class Jobs {
    public int pain;  //initializing fields
    public int gain;
    public void hurt(Person x) {
        x.loseHealth(pain);
    } //diminishes player health
    public void pay(Person x){
        x.getMoney(gain);
    } //pays player
    public abstract void jobDesc(); //abstract method describing each job
}