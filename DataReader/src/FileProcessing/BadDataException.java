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

/**
 * A class to report bad input data.
 * @author 4174075
 */
public class BadDataException extends IOException
{
    
    /**
     * Reports bad input data.
     */
    public BadDataException()
    {
        super();
    }
    
    /**
     * Reports bad input data.
     * @param message Message to be shown
     */
    public BadDataException(String message)
    {
        super(message);
    }
}
