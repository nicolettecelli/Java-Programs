package Battleship;
import java.util.Scanner;
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
 *
 * @author 4174075  Group: null
 */
public class BattleshipGame 
{
    public static void main(String args[])
    {
        String play = "Y" ;
        int playCount = 0 ;
        // Loops the game if the user wants to continue playing
        while (play.equalsIgnoreCase("Y")) 
        {
            playCount++ ;
            System.out.println("\nWelcome to the game of Battleship.\nYou have "
                    + "5 guesses to find 5 ship locations. Good luck!") ;
            
            Battleship myGame = new Battleship() ;
            int userRowGuess, userColGuess ;
            Scanner keyboard = new Scanner(System.in) ;
            
            System.out.println("\nGame #" + playCount) ;
            int guessCount = 0 ;
            
            for (int userGuess = 0; userGuess < 5; userGuess++)
            {
                guessCount++ ;
                
                System.out.print("\nGuess #" + guessCount + "\nEnter the row "
                        + "index: ") ;
                userRowGuess = keyboard.nextInt() ;
                
                System.out.print("Enter the column index: ") ;
                userColGuess = keyboard.nextInt() ;
                
                myGame.processUserGuess(userRowGuess, userColGuess) ;       
            }
        
            if (myGame.userWon())
            {
                System.out.println("\nCongratulations! You won the game of "
                        + "Battleship!\n") ;
            }
            else
            {
                System.out.println("\nBetter luck next time.\n") ;
            }
        
            System.out.println(myGame.displayBattleshipGame()) ;
            
            System.out.println("\nPlay again? (y/n)") ;
            play = keyboard.next() ;
        }
        // User stops playing
        System.out.println("\nThanks for playing!") ;  
    }  
}
