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

import java.util.ArrayList;

/**
 * A class to create an Album object.
 * @author 4174075
 */
public class Album implements Comparable
{
    private String artist;
    private String album;
    private ArrayList<Track> tracks;
    
    /**
     * Creates an Album consisting of an artist, album name, and list of tracks.
     * @param artist The name of the artist who wrote the album
     * @param album The album title
     * @param tracks An ArrayList of Track objects representing tracks in the album
     */
    public Album(String artist, String album, ArrayList<Track> tracks)
    {
        this.artist = artist;
        this.album = album;
        this.tracks = tracks;
    }
    
    /**
     * Get the artist name.
     * @return The name of the artist who wrote the album
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Get the album name.
     * @return The album title
     */
    public String getAlbum()
    {
        return album;
    }
    
    /**
     * Get the tracks.
     * @return An ArrayList of of Tracks in the album
     */
    public ArrayList<Track> getTracks()
    {
        return tracks;
    }

    /**
     * Compares two albums to each other alphabetically.
     * @param t The album this is being compared to
     * @return 0 if they are equal, 1 if this comes before t, or -1 if this comes after t
     */
    @Override
    public int compareTo(Object t) 
    {
        Album a = (Album)t;
        return this.album.toLowerCase().compareTo(a.album.toLowerCase());
    }    
    
    /**
     * Get the Album information as a String.
     * @return Artist, album title, and list of tracks
     */
    public String toString()
    {
        return "\n\n" + artist + "\n" + album + "\n" + tracks.toString();
    }
}
