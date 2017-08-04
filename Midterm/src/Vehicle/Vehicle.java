package Vehicle;

/**
 * A class to create a vehicle.
 * @author 4174075
 */
public abstract class Vehicle implements Movable
{
    private String name;
    private int maxSpeed;
    private String color;
    private String model;
    
    /**
     * Creates a Vehicle object.
     * @param n Name of vehicle
     * @param mS Max speed of vehicle
     * @param c Color of vehicle
     * @param m Model of vehicle
     */
    public Vehicle(String n, int mS, String c, String m)
    {
        name = n;
        maxSpeed = mS;
        color = c;
        model = m;
    }
    
    /**
     * Returns the values of a Vehicle as a string.
     * @return Vehicle parameters
     */
    public String toString()
    {
        return "\nName: " + name + "\nMax Speed: " + maxSpeed + "\nColor: " 
                + color + "\nModel: " + model ;
    }
}
