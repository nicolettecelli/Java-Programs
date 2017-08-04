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

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author 4174075
 */
public class SortTest 
{
    public static void main(String[] args)
    {
        int[] list = new int[10000];
        Random random = new Random();
    
        for(int i = 0; i < list.length; i++)
        {
            list[i] = random.nextInt(10000) + 1; // From 1 to 10,000
        }
        
        // Insertion Sort
        int[] list1 = Arrays.copyOf(list, 10000); // Copy of original array
        double before1 = System.currentTimeMillis();
        Sort.insertionSort(list1);
        double after1 = System.currentTimeMillis();
        
        System.out.println("Time taken using Insertion Sort: " + (after1 - 
                before1));
        
        // Selection Sort
        int[] list2 = Arrays.copyOf(list, 10000); // Copy of original array
        double before2 = System.currentTimeMillis();
        Sort.selectionSort(list2);
        double after2 = System.currentTimeMillis();
        
        System.out.println("Time taken using Selection Sort: " + (after2 - 
                before2));
        
        // Bubble Sort
        int[] list3 = Arrays.copyOf(list, 10000); // Copy of original array
        double before3 = System.currentTimeMillis();
        Sort.bubbleSort(list3);
        double after3 = System.currentTimeMillis();
        
        System.out.println("Time taken using Bubble Sort: " + (after3 - 
                before3));
    }
}
