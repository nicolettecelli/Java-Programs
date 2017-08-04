package Vehicle;

/**
 * A class to create a Car
 * @author 4174075
 */
public class Car extends Vehicle
{
    private int wheels;

    /**
     * Creates a Car object.
     * @param n Name of the car
     * @param mS Max speed of the car
     * @param c Color of the car
     * @param m Model of the car
     * @param wheels Number of wheels the car has
     */
    public Car(String n, int mS, String c, String m, int wheels) 
    {
        super(n, mS, c, m);
        this.wheels = wheels;
    }
    
    /**
     * States how a car moves.
     * @return Method of movement as a string
     */
    public String move()
    {
        return "\nThis vehicle moves on land.";
    }
    
    /**
     * Returns the values of a Car as a string.
     * @return Car parameters
     */
    public String toString()
    {
        return super.toString() + "\nNumber of wheels: " + wheels ;
    }
}
