package Vehicle;

import java.util.ArrayList;

/**
 *
 * @author 4174075
 */
public class VehicleDriver 
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        
        Vehicle one = new Car("Volkswagen", 160, "Blue", "Jetta", 4);
        Vehicle two = new Boat("Ebb & Flow", 120, "White", "Wayfarer", "Catamaran");
        Vehicle three = new Car("Ford", 140, "Silver", "Explorer", 4);
        Vehicle four = new Plane("Commercial", 300, "White", "Flyer's Mark", "American Airlines");
        Vehicle five = new Car("Ferrari", 190, "Red", "California", 4);
        
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        list.add(five);
        
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("\n" + list.get(i).toString() + list.get(i).move());
        }
    }
}
