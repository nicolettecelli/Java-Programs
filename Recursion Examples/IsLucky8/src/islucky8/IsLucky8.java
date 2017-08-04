/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islucky8;

/**
 *
 * @author cristy
 */
public class IsLucky8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("The number 12345678 is Lucky? " + isLucky8(12345678));
        
        System.out.println("The number 12345679 is Lucky? " + isLucky8(12345679));
    }
    
    public static boolean isLucky8(int n)
    {
        if (n % 10 == 8)
            return true;
        else if (n < 10)
            return false;
        else
            return isLucky8(n/10);
    }
    
}
