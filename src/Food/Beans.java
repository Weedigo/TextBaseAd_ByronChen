package Food;
import People.Person;
//Implements what eating beans does.
public class Beans implements Food{
    public void eat(Person x){
        x.getHealth(2);
        x.loseMoney(100);
        System.out.println("Zooooooop, you let out a massive fart.");
        System.out.println("Your health is now: " + x.checkHealth());
        System.out.println("You wallet now has 100 dollars less: " + x.getBalance());
    }
}