package FileProcessing;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            File Processing & Exception Handling Program
// Files:            DataReader.java, BadDataException.java, DataTest.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Reads data from a text file and catches 
//                      IOException, FileNotFoundException, and BadDataException
///////////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * A class to read data from a text file.
 * @author 4174075
 */
public class DataReader 
{
    private double[] data;
    
    /**
     * Reads a data file.
     * @param fileName Name of file with data
     * @return An array of given data values
     * @throws IOException 
     * @throws FileNotFoundException 
     */
    public double[] readFile(String fileName) throws IOException, FileNotFoundException
    {
        File input = new File(fileName);
        Scanner in = new Scanner(input);
        
        try
        {   
            readData(in);
            return data;
        }
        finally
        {
            in.close();
        }
    }
    
    /**
     * Checks all the data in the file.
     * @param in Scanner that scans the file
     * @throws BadDataException 
     */
    private void readData(Scanner in) throws BadDataException
    {
        if (!in.hasNext()) // Empty file
        {
            throw new BadDataException("File is empty.");
        }
        if (!in.hasNextInt()) // No int describing amount of values in file
        {
            throw new BadDataException("Length required before data.");
        }
        
        int values = in.nextInt();
        data = new double[values];
        
        for (int i = 0; i < values; i++)
        {
            readValue(in, i);
        }
        
        if (in.hasNext()) // If there are more values than length depicts
        {
            throw new BadDataException("End of file expected.");
        }
    }
    
    /**
     * Creates an array with the data in the file.
     * @param in Scanner that scans the file
     * @param i Position of value to be read
     * @throws BadDataException 
     */
    private void readValue(Scanner in, int i) throws BadDataException
    {
        if (!in.hasNextDouble()) // Data not entered as doubles
        {
            throw new BadDataException("Data value should be entered as doubles.");
        }
        // Populates array with data values
        data[i] = in.nextDouble();
    }
    
    /**
     * Determines the lowest value in the data file.
     * @param array Array created from data file
     * @return The lowest value
     */
    public double lowestValue(double[] array)
    {
        double least = 1000000000.0;
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < least)
            {
                least = array[i];
            }
        }
        
        return least;
    }
    
    /**
     * Determines the highest value in the data file.
     * @param array Array created from data file
     * @return The highest value
     */
    public double highestValue(double[] array)
    {
        double max = 0.0;
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        
        return max;
    }
    
    /**
     * Calculates the sum of all the data values in a file.
     * @param array Array created from the data file
     * @return Sum of data values
     */
    public double sum(double[] array)
    {
        double sum = 0.0;
        
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        
        return sum;
    }
    
    /**
     * Calculates the average of all the data values in a file.
     * @param array Array created from the data file
     * @return The average value of the data
     */
    public double average(double[] array)
    {
        double sum = sum(array);
        double average = sum / (array.length);
        
        return average;
    }
}
