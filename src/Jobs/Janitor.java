package Jobs;

public class Janitor extends Jobs{
    public Janitor() {
        this.pain = 1;  //setting values
        this.gain= 150;
    }
    public void jobDesc(){
        System.out.println("You work a good schedule job, but the hours are really low and the constant smell of chlorine damages your health.");
    }
}
