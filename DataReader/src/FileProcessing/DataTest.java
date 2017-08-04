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

import java.io.IOException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 4174075
 */
public class DataTest 
{
    public static void main (String[] args) throws IOException
    {   
        // Five test cases:
        // 1) File with valid data, using file data.txt
        // 2) File with bad data, using file baddata.txt
        // 3) File with no integer before doubles, using file noint.txt
        // 4) Empty file, using emptydata.txt
        // 5) File name that does not exist
        
        String input = JOptionPane.showInputDialog("Enter the name of a file.");
    
        DataReader reader = new DataReader();
        double[] result = reader.readFile(input);
        System.out.println(Arrays.toString(result) + "\nLowest Value: " 
                + reader.lowestValue(result) + "\nHighest Value: " 
                + reader.highestValue(result) + "\nSum: " + reader.sum(result) 
                + "\nAverage: " + reader.average(result));
    }
    
}
