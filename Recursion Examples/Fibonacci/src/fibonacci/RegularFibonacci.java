/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author cristy
 */
public class RegularFibonacci {
    
    public int calcFibonacci(int i)
    {
        if (i <= 2)
            return 1;
        else
            return calcFibonacci(i - 1) + calcFibonacci(i - 2);
    }
    
}
