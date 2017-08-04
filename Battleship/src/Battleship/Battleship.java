package Battleship;
import java.util.Random;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Battleship - 2D Array
// Files:            Battleship.java, BattleshipGame.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Simulates a game of Battleship using
//                                          2D arrays
///////////////////////////////////////////////////////////////////////////////

/**
 * A class to create a Battleship game board.
 * @author 4174075  Group: null
 */
public class Battleship 
{
    boolean shipLocations[][] = new boolean[5][5] ;
    boolean guessLocations[][] = new boolean[5][5] ;
    int totalShipsSunk ;
    int totalMisses ;   

    /**
     * Starts a Battleship game by clearing a board and placing ships.
     */
    public Battleship()
    {
        clearShipLocations() ;
        initializeShipLocations() ;
    }   
    
    /**
     * Randomly places 4 ships on the 5x5 board.
     */
    // This is the section that 4174075 coded to match the pseudo code provided.
    /* Create a Random object, use a for loop to get a random position between 0 
     * and 4 for the rows and columns, use a while loop to ensure there's not
     * already a ship in that position, then set a ship in that position by
     * making shipLocations[row][column] true. The for loop loops 4 times 
     * because there are 4 ships.
     */
    public void initializeShipLocations()
    {   
        Random shipLocation = new Random() ;
        
        for (int i = 1; i <= 4; i++) // 4 ships
        {
            int row = shipLocation.nextInt(5 - 1) ; // 5 postions, between 0 and 4
            int column = shipLocation.nextInt(5 - 1) ;
            
            while (shipLocations[row][column]) 
            { // Ensures every ship will be placed in a different index
                 row = shipLocation.nextInt(5 - 1) ;
                 column = shipLocation.nextInt(5 - 1) ;                
            }
            
            shipLocations[row][column] = true ;
        }      
    }
    
    /**
     * Clears the game board.
     */
    public void clearShipLocations()
    { 
        for (int i = 0; i < shipLocations.length; i++)
        {
            for (int j = 0; j < shipLocations[i].length; j++)
            {
                shipLocations[i][j] = false ;
            }
        }
    } 
    
    /**
     * Determines whether the user sank a ship or missed.
     * @param row User's row guess
     * @param col User's column guess
     */
    public void processUserGuess(int row, int col)
    {
        guessLocations[row][col] = true ; 
        
        if (shipLocations[row][col]) // There is a ship at row,col
        {
            totalShipsSunk++ ;
        }
        else if (!shipLocations[row][col]) // There is not a ship at row,col
        {
            totalMisses++ ;
        }
    }
    
    /**
     * Determines whether the user won the game.
     * @return True if the user sank 4 ships, or false if the user sank less 
     * than 4 ships
     */
    public boolean userWon()
    {  
        return totalShipsSunk == 4 ;
    }
    
    /**
     * Displays a board with the randomized ship locations and a board with the
     * user's guesses.
     * @return User's guesses, original battleship locations, and a counter for
     * total hits and total misses
     */
    public String displayBattleshipGame()
    {        
        String header = "" ;
        String shipBoard = "" ;
        String userBoard = "" ;
        
        for (int i = 0; i < shipLocations.length; i++)
        {
            header += i + " " ;
            shipBoard += "\n" + i ;
            userBoard += "\n" + i ;
            
            for (int j = 0; j < shipLocations[i].length; j++)
            {
                if (shipLocations[i][j])
                {
                    shipBoard += " X" ;
                }
                else if (!shipLocations[i][j])
                {
                    shipBoard += " -" ;
                }
            }
            for (int k = 0; k < shipLocations[i].length; k++)
            {
                if (guessLocations[i][k])
                {
                    userBoard += " X" ;
                }
                else if (!guessLocations[i][k])
                {
                    userBoard += " -" ;
                }
            }
        }
        return "User Guesses:\n  " + header + userBoard + "\n\nBattleship "
                + "Locations:\n  " + header + shipBoard + "\nTotal hits: " + 
                totalShipsSunk + ",\tTotal Misses: " + totalMisses ;
    }   
}
