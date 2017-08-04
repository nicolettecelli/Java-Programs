/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;
import java.util.Scanner;
import java.util.*;
import java.io.*;
/**
 *
 * @author cristy
 */
public class NeedsExceptionHandling {

    static Scanner userInput = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException, InvalidAgeException, IOException
    {
       
        divideByZero(7);
        
        System.out.print("How old are you?");
        int age = checkValidAge();
        
        if (age != 0)
        {
            System.out.println("You are " + age + " years old");
        }
        
             
        getAFile("somestuff.txt");
        
        
    }
    
    public static void divideByZero(int a) throws ArithmeticException
    {
           //The following throws an error because you can't divide by 0
           // An exception in thread "main" called java.lang.ArithmeticException
           try
           {
               System.out.println(a / 0);
           }
           catch (ArithmeticException e)
           {
               System.out.println("You cannot divide by zero!");
              // System.out.println(e.getMessage());
              // System.out.println(e.toString());
               e.printStackTrace();
           }
    }
    
    
    public static int checkValidAge() throws InputMismatchException, InvalidAgeException
    {
        int th = 0;
        try
        {
            int input = userInput.nextInt();
            if (input < 0 || input > 130)
            {
                throw new InvalidAgeException("Age must be between 1 and 129.");
            }

                 th =userInput.nextInt();  // user should type an int
        }
        catch (InputMismatchException e)
        {
            userInput.next();
            System.out.println("That is not a whole number."); 
            th= 0;
        } 
        catch (InvalidAgeException e)
        {
            userInput.next();
            System.out.println("Age must be between 1 and 129.");
            th= 0;
        }
        return th;
    }

    
    /*  If you prefer to throw an exception to the calling method, you use throw:
    
    */
    public static class InvalidAgeException extends Exception
    {
        public InvalidAgeException()
        {
            
        }
        public InvalidAgeException(String message)
        {
            super(message);
        }
    }
    
    public static void getAFile(String fileName) throws IOException, FileNotFoundException
    {
        //put code here to read a file whose name is passed as a parameter.
        int go = 0;
        FileInputStream file;
        while (go == 0)
        {
        try
        {
            file = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("The file was not found.");
        }
        catch (IOException e)
        {
            System.out.println("An IO error occured.");
        }
        catch (Exception e)
        {
            System.out.println("An error occured.");
        }
        finally
        {
            go = 1;
            System.out.println("");
        }
        
        }
    
    }
    
    
    
    
    
}
    

    
        
        
        
        
        
        
   
    

