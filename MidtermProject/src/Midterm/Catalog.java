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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 4174075
 */
public class Catalog 
{
    public static void main (String[] args) throws FileNotFoundException, IOException
    {
//---------------- Populating the catalog array: ---------------------------------------
        
        String fileName = JOptionPane.showInputDialog("Enter the name of a file.");
        File input = new File(fileName);
        
        while (!input.exists()) // handles FileNotFoundException
        {
            fileName = JOptionPane.showInputDialog("Enter catalog.txt for the input file.");
            input = new File(fileName);
        }
        Scanner in = new Scanner(input);
        
        try
        {        
            ArrayList<Album> catalog = new ArrayList<Album>();
            ArrayList<Track> tracks = new ArrayList<Track>();
        
            String next = in.next();

            while (in.hasNext()) // not empty
            {   
                if (next.equals(next.toLowerCase())) // artist 
                {
                    tracks = new ArrayList<Track>();
                
                    String artist = next;
                    String album = in.next();
                
                    next = in.next();
                    while (!(next.equals(next.toLowerCase())) || next.matches("[0-9]+")) 
                    {   // tracks are capitalized or consist of only numbers
                        tracks.add(new Track(next));
                        if (in.hasNext())
                        {
                            next = in.next();
                        }
                        else
                        {
                            next = "end";
                        }
                    }
                    
                    Collections.sort(tracks);
                    catalog.add(new Album(artist, album, tracks));
                }
            }                   
            // Sorted by album name:
            Collections.sort(catalog);
            System.out.println("Sorted by album name:" + catalog.toString());
        
            // Sorted by artist name:
            ArtistComparator compare = new ArtistComparator();
            ArrayList<Album> artistSort = new ArrayList<Album>(catalog);
            artistSort.sort(compare);
            System.out.println("\n\n*****************************************************************************************\n" 
                    + "Sorted by artist name:" + artistSort.toString());
        
//------------------------ Menu options: -------------------------------------------------------
            int choice = 0;
  
            while (choice != 3 && choice != -1) // Not canceled
            {
                String[] options = {"Search by Album Title", "Search by Artist", 
                    "Add Album to Catalog", "Quit"};
            
                choice = JOptionPane.showOptionDialog(null, "Choose one of the following options.",
                        null, 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
            
                if (choice == 0) // by album title
                {
                    Collections.sort(catalog);
                
                    ArrayList<String> albumNames = new ArrayList<String>(); // pull album names as Strings
                    for (int i = 0; i < catalog.size(); i++)
                    {
                        albumNames.add(catalog.get(i).getAlbum());
                    }
                
                    String albumChoice = JOptionPane.showInputDialog("Enter the album title.");
                    int position = Collections.binarySearch(albumNames, albumChoice);
                    System.out.println("\n" + catalog.get(position).toString());                
                }
                else if (choice == 1) // by artist
                {
                    artistSort.sort(compare);
                
                    ArrayList<String> artistNames = new ArrayList<String>(); // pull artist names as Strings
                    for (int i = 0; i < artistSort.size(); i++)
                    {
                        artistNames.add(artistSort.get(i).getArtist());
                    }
                
                    String artistChoice = JOptionPane.showInputDialog("Enter the artist name.");
                    int position = Collections.binarySearch(artistNames, artistChoice);
                
                    ArrayList<Album> artistSearch = new ArrayList<Album>(); // ArrayList of all albums by artist
                    artistSearch.add(artistSort.get(position));
                                
                    for (int i = position - 1; i >= 0; i--) // checks to the left of position for same artist
                    {
                        if (artistNames.get(i).equals(artistNames.get(position)))
                        {
                            artistSearch.add(artistSort.get(i));
                        }
                    }
                    for (int i = position + 1; i < artistNames.size(); i++) // checks to the right of position for the same artist
                    {
                        if (artistNames.get(i).equals(artistNames.get(position)))
                        {
                            artistSearch.add(artistSort.get(i));
                        }
                    }
                
                    Collections.sort(artistSearch); // sort ArrayList with all artist's albums by album
                    System.out.println("\n" + artistSearch.toString());
                }
                else if (choice == 2) // add album
                {
                    String userAlbum = JOptionPane.showInputDialog("Enter the "
                            + "artist, album, and tracks separated by spaces. \nIf "
                            + "there is more than one word in a track, artist, or "
                            + "album name, they must be separated by underscores.");
                
                    Scanner user = new Scanner(userAlbum);
                    String enteredArtist = user.next();
                    String enteredAlbum = user.next();
                    ArrayList<Track> enteredTracks = new ArrayList<Track>();
                
                    while (user.hasNext())
                    {
                        enteredTracks.add(new Track(user.next()));
                    }
                
                    Album newAlbum = new Album(enteredArtist, enteredAlbum, enteredTracks);
                    // Add & sort new album to Catalog
                    catalog.add(newAlbum);
                    Collections.sort(catalog);
                    
                    // Write new album info into the text file
                    FileWriter fw = new FileWriter(fileName, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println("\n" + userAlbum);
                
                    pw.close();
                    user.close();
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.getMessage();
        }
        catch(IOException e)
        {
            e.getMessage();
        }
        catch (Exception e)
        {
            e.getMessage();
        }
        finally
        {
            in.close();
        }
    }
    
}
