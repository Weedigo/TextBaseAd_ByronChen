package Jobs;

public class Delivery extends Jobs{
    public Delivery() {
        this.pain = 0;  //setting values
        this.gain= 100;
    }
    public void jobDesc() {
        System.out.println("You delivery food in the comfort of your car.");
        System.out.println("Even though you make less due to the cost of car and gas, you are happy.");
    }
}
