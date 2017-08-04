package Oct27;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Loop 
{
    public static void main (String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a number.");
        int num = Integer.parseInt(input);
        
        int result = 1;
        
        // Loop:
        for (int i = num; i > 0; i--)
        {
            result = result * i;
        }
        System.out.println("Using a loop, the factorial of " + num + " is " 
                + result + ".");
        
        // Recursive:
        int recResult = factorial(num);
        System.out.println("Using recursion, the factorial of " + num + " is "
                + result + ".");
    }
    
    public static int factorial(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else 
        {
            return (n * factorial(n-1));
        }
    }
}
