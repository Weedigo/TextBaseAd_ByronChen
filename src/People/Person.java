package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    int health;
    int money;


    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Person (String firstName, String familyName, int xLoc, int yLoc, int health, int money)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.health = health;
        this.money = money;
    }
//////////////////////////
    public int getBalance(){
        return money;
    }

    public void loseMoney(int lose) {
        this.money = money - lose;
    }

    public void getMoney(int gain) {
        this.money = money + gain;
    }

    public int checkHealth(){
        return health;
    }

    public void loseHealth(int pain) {
        this.health = health - pain;
    }

    public void getHealth(int soothe) {
        this.health = health + soothe;
    }
}