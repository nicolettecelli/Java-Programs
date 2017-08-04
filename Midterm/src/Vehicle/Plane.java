package Vehicle;

/**
 * A class to create a Plane.
 * @author 4174075
 */
public class Plane extends Vehicle
{
    private String airline;
    
    /**
     * Creates a Plane object.
     * @param n Name of the plane
     * @param mS Max speed of the plane
     * @param c Color of the plane
     * @param m Model of the plane
     * @param airline Airline that owns the plane
     */
    public Plane(String n, int mS, String c, String m, String airline)
    {
        super(n, mS, c, m);
        this.airline = airline;
    }
    
    /**
     * States how a plane moves.
     * @return Method of movement as a string
     */
    public String move()
    {
        return "\nThis vehicle moves through the sky.";
    }
    
    /**
     * Returns the values of a Plane as a string.
     * @return Plane parameters
     */
    public String toString()
    {
        return super.toString() + "\nAirline: " + airline ;
    }
}
