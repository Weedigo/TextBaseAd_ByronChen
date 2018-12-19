package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    private String name;
    private int xLoc, yLoc;
    private int health;
    private int money;


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

    public Person (String name, int xLoc, int yLoc, int health, int money)
    {
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.health = health;
        this.money = money;
    }
//////////////////////////
    public void setName(){
        this.name = "Byron";
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
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