package sort;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Apply a Sorting Algorithm to an Array of Randomly 
//                   Generated Ints
// Files:            Sort.java, SortTest.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates an array of 10,000 ints and 
//                      tests the amount of time taken to sort it using 
//                      insertion, selection, and bubble sorting methods.                       
///////////////////////////////////////////////////////////////////////////////

/**
 * A class to sort arrays.
 * @author 4174075
 */
public class Sort 
{
    /**
     * Sorts an array using the Insertion Sort method.
     * @param num an array of ints
     */
    public static void insertionSort(int[] num)
    {
        int j;      // Number of items sorted so far
        int key;    // The item to be inserted
        int i;        

        for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
        {
            key = num[j];
            for (i = j - 1; (i >= 0) && (num[i] < key); i--)   // Smaller values are moving up
            {
                num[i + 1] = num[i];
            }
            num[i + 1] = key;    // Put the key in its proper location
        }
    }
    
    /**
     * Sorts an array using the Selection Sort method.
     * @param num an array of ints
     */
    public static void selectionSort(int[] num)
    {
        int i, j, first, temp; 
        
        for (i = num.length - 1; i > 0; i--)  
        {
            first = 0;   // Initialize to subscript of first element
            for (j = 1; j <= i; j++)   // Locate smallest element between positions 1 and i
            {
                if (num[j] < num[first])         
                 first = j;
            }
            temp = num[first];   // Swap smallest found with element in position i
            num[first] = num[i];
            num[i] = temp; 
        }           
    }
    
    /**
     * Sorts an array using the Bubble Sort method.
     * @param num an array of ints
     */
    public static void bubbleSort(int[] num)
    {
        int j;
        boolean flag = true;   // Set flag to true to begin first pass
        int temp;              // Holding variable

        while (flag)
        {
            flag = false;    // Set flag to false awaiting a possible swap
            for (j = 0; j < num.length - 1; j++)
            {
                if (num[j] < num[j + 1])   // Change to > for ascending sort
                {
                    temp = num[j];         // Swap elements
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;           // Shows a swap occurred  
                } 
            } 
        } 
    }
}
