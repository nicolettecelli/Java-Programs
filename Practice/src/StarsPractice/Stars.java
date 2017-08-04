package StarsPractice ;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Nested Loops Review
// Files:            Stars.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates several star designs using 
//                                         nested loops.
//
///////////////////////////////////////////////////////////////////////////////

/**
 * 
 * @author 4174075
 */
public class Stars 
{
    public static void main(String[] args)
    {
        // Star Design 1
        //
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*") ;
            }
            
            System.out.println("") ;
        }
        
        System.out.println("") ;
        
        // Star Design 2
        //
        // *****
        //  ****
        //   ***
        //    **
        //     *
        for (int i = 1; i <= 5; i++)
        {
            int j = i ;
            
            while (j > 1)
            {
                System.out.print(" ") ;
                j-- ;
            }
            
            for (int k = 5; k >= i; k--)
            {
                System.out.print("*") ;
            }
            
            System.out.println("") ;
        }
        
        System.out.println("") ;
        
        // Star Design 3
        //
        //    *     
        //   ***    
        //  *****   
        // *******
        for (int i = 1; i <= 4; i++)
        {
            int j = i ;
            
            while (j < 4)
            {
                System.out.print(" ") ;
                j++ ;
            }
            
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*") ;
            }
            
            for (int l = 1; l < i; l++)
            {
                System.out.print("*") ;
            }
            
            System.out.println("") ;
        }
        
        System.out.println("") ;
        
        // Star Design 4
        //
        // *   *    
        //  * *     
        //   *
        //  * *
        // *   *
        for (int i = 1; i <=5; i++)
        {
            if (i == 3)
            {
                System.out.print("  *") ;
            }
            else if (i == 1 || i == 5)
            {
                System.out.print("*   *") ;
            }
            else
            {
                System.out.print(" * *") ;
            }
            
            System.out.println("") ;
        }
    }
    
}
