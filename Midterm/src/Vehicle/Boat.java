package Vehicle;

/**
 * A class to create a Boat.
 * @author 4174075
 */
public class Boat extends Vehicle
{
    private String type;
    
    /**
     * Creates a Boat object.
     * @param n Name of the boat
     * @param mS Max speed of the boat
     * @param c Color of the boat
     * @param m Model of the boat
     * @param type Type of boat, ie: sailboat
     */
    public Boat(String n, int mS, String c, String m, String type)
    {
        super(n, mS, c, m);
        this.type = type;
    }
    
    /**
     * States how a boat moves.
     * @return Method of movement as a string
     */
    public String move()
    {
        return "\nThis vehicle moves in the ocean.";
    }
    
    /**
     * Returns the values of a Boat as a string.
     * @return Boat parameters
     */
    public String toString()
    {
        return super.toString() + "\nType of boat: " + type ;
    }
}
