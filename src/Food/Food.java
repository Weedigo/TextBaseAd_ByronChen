package Food;
import People.Person;
//Parent class of all the kinds of food, promises a eat method for the other classes to implement it.
public interface Food {
    void eat(Person x);
}
