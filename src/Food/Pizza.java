package Food;
import People.Person;
//Implements what eating pizza does.
public class Pizza implements Food{
    public void eat(Person x){
        x.getHealth(3);
        x.loseMoney(50);
        System.out.println("Your health is now: " + x.checkHealth());
        System.out.println("Your wallet now has 50 dollars less" + x.getBalance());
    }
}
