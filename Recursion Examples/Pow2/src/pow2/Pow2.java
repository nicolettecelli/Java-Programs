/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pow2;

/**
 *
 * @author cristy
 */
public class Pow2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test Power of 2 recursive method:
        int answer = pow2(4);
        System.out.println(answer);
        
        
        // TODO code application logic here
    }
    
    public static int pow2(int n)
    {
        if (n <= 0)
            return 1;
        else
            return 2 * pow2(n-1);
    }
    
}
