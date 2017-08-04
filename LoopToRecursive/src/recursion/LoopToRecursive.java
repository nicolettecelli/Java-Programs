package recursion;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Sum of Arrays Recursively
// Files:            LoopToRecursive.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Recursively calculates the sum of 
//                                         values in an array.
///////////////////////////////////////////////////////////////////////////////

/**
 *
 * @author 4174075
 */
public class LoopToRecursive 
{
    public static void main (String[] args)
    {   // test
        int sum = 0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        Sum a = new Sum();
        System.out.println("Sum: " + a.sum(numbers, 0, numbers.length));

    }
    
    /**
     * A class to measure the sum of values in an Array.
     */
    public static class Sum
    {
        int sum = 0;
    
        /**
         * Calculates the sum of an array.
         * @param array Array of ints
         * @param start Index of starting value
         * @param finish Array length or (index of last value + 1)
         * @return Sum of values in the array
         */
        public int sum(int[] array, int start, int finish)
        {
            if (start == finish) // Looped through entire array
            {
                return sum;
            }
            else
            {	
                sum = array[start] + sum(array, start+1, finish); // Recursively adds values
                return sum;
            }
        }
    }
}
