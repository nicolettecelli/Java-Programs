package Oct1;

import java.util.Comparator;

/**
 *
 * @author 
 */
public class Pet implements Comparable, Comparator
{
    private String breed;
    private String name;
    private int weight;
    
    public Pet(String thisBreed, String thisName, int thisWeight)
    {
        breed = thisBreed;
        name = thisName;
        weight = thisWeight;
    }
    
    public int compareTo(Object otherObject)
    {
        Pet other = (Pet)otherObject;
        
        if (weight > other.weight)
        {
            return 1;
        }
        else if (weight < other.weight)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public int compare(Object obj1, Object obj2)
    {
        return 0;
    }
}

