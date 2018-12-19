package Jobs;

public class Construction extends Jobs{
    public Construction() {
        this.pain = 2;  //setting values
        this.gain= 200;
    }
    public void jobDesc() {
        System.out.println("You do construction and your health diminishes by a lot from hard labor.");
    }
}