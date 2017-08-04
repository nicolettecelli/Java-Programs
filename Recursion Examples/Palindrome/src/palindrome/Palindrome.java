/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author cristy
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("The phrase racecar is a Palindrome? " + isPalindrome("racecar"));
        
        System.out.println("The phrase Iowa is a Palindrome? " + isPalindrome("Iowa"));
        // TODO code application logic here
    }
    
    public static boolean isPalindrome(String sentence)
    {
        if (sentence.length() <=1)
            return true;
        else if (sentence.substring(0, 1).toLowerCase(). equals (sentence.substring(sentence.length() -1).toLowerCase()))
            return isPalindrome(sentence.substring(1, sentence.length() -1));
        else 
            return false;
    }
    
}
