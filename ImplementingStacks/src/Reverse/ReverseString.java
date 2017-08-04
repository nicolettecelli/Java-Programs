package Reverse;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Implementing Stacks
// Files:            LinkedListStack.java, ReverseString.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Reads a text file and reverses its 
//                                         contents using stacks.
///////////////////////////////////////////////////////////////////////////////

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 * @author 4174075
 */
public class ReverseString 
{
    public static void main (String[] args) throws FileNotFoundException
    {
        String fileName = JOptionPane.showInputDialog("Enter the name of a file.");
        File input = new File(fileName);
        
        while (!input.exists()) // Handles FileNotFoundException
        {
            fileName = JOptionPane.showInputDialog("The file does not exist.\nEnter the name of a file.");
            input = new File(fileName);
        }
        
        Scanner in = new Scanner(input);
        LinkedListStack stack = new LinkedListStack();
        
        while (in.hasNext()) // File is not empty, or have not reached end of file
        {            
            String word = in.next();
            
            if (!(word.equals(word.toLowerCase()))) // First word should be capitalized
            {
                word = word.toLowerCase(); 
                stack.push(word + "."); 
                // Changes to lowercase and adds a period because it will be at the end of the sentence
            }
            else if (word.contains(".")) // Last word of sentence
            {
                word = StringUtils.capitalize(word); // Capitalizes first letter
                stack.push(word.replace(".", "")); // Gets rid of period

                while (!stack.empty())
                {
                    System.out.print(stack.pop() + " ");
                }
            }
            else // any word that isn't the first or last word
            {
                stack.push(word); 
            }
        }
            
        in.close();
    }
}
