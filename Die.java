import java.util.Random;
public class Die {

    private int sides;
    private int value;

    public Die (int numSides)
    {
        sides = numSides;
        roll();

    }

    /* This method generates a random value in the range 1 to 6  */

    public void roll()
    {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    public int getSides()
    {
        return sides;
    }

    //Returns value of dice roll

    public int getValue()
    {
        return value;
    }
} //end Die class
