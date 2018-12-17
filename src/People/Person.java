package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    int health;
    int exp;
    int level;


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

    public Person (String firstName, String familyName, int xLoc, int yLoc, int health, int level)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.health = health;
        this.level = level;
    }
//////////////////////////
    public int getHealth(){
        return health;
    }

    public void removeHealth(int damage) {
        this.health -= damage;
    }
    public void earnExp(int earned) {
        exp = exp + earned;
        System.out.println("You got exp nice " + exp);
    }
    public int getExp() {
        return exp;
    }
    public void levelUp() {
        level = level + 1;
        System.out.println("Level up! " + level);
    }
}