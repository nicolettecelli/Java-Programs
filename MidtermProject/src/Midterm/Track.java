package Midterm;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Two-Thirds Term Project
// Files:            Album.java, Track.java, ArtistComparator.java, Catalog.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Reads a text file, populates it into 
//                                         an ArrayList, sorts it 3 ways, and 
//                                         writes to a file using user input
///////////////////////////////////////////////////////////////////////////////

/**
 * A class to create a Track object.
 * @author 4174075
 */
public class Track implements Comparable
{
    private String name;
    
    /**
     * Creates a Track.
     * @param name Title of the track
     */
    public Track(String name)
    {
        this.name = name;
    }
    
    /**
     * Get the track.
     * @return Name of the track
     */
    public String getTrack()
    {
        return name;
    }

    /**
     * Compares two Tracks to each other alphabetically.
     * @param t The track this is being compared to
     * @return 0 if they are equal, 1 if this comes before t, or -1 if this comes after t
     */
    @Override
    public int compareTo(Object t) 
    {
        Track a = (Track)t;
        // ignores parentheses
        int result = this.name.replace("(", "").compareTo(a.name.replace("(", ""));
        return result;
    }
    
    /**
     * Get the Track information as a String.
     * @return The name of the track
     */
    public String toString()
    {
        return name;
    }
}
