/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;


/**
 *
 * @author cristy
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("The factorial of 3! = " + fact(3));
        System.out.println("The factorial of 4! = " + fact(4));
        System.out.println("The factorial of 5! = " + fact(5));
        
    }
    
    public static int fact(int n)
    {
        if (n <= 1)
            return 1;
        else if (n > 20)
            throw new RuntimeException("Too large to compute factorial recursively - Overflow will result");
        else
            return fact(n - 1) * n;
    }
}
