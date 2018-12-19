package Food;
import People.Person;
//Implements what eating steak does.
public class Steak implements Food{
    public void eat(Person x){
        x.getHealth(4);
        x.loseMoney(200);
        System.out.println("Your health is now: " + x.checkHealth());
        System.out.println("Your wallet now has 200 dollars less: " + x.getBalance());
    }
}
