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

import java.util.Comparator;

/**
 * A Comparator for Album objects that compares artist names.
 * @author 4174075
 */
public class ArtistComparator implements Comparator<Album>
{
    /**
     * Compares two artists to each other alphabetically.
     * @param a The first album to compare
     * @param b The second album to compare
     * @return 0 if the artists are the same, 1 if a comes before b, or -1 if a comes after b
     */
    @Override
    public int compare(Album a, Album b) 
    {
        return a.getArtist().compareTo(b.getArtist());
    }
}
