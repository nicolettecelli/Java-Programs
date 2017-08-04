package Oct13;

import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Practice 
{
    public static void main (String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter your name.");
        String age = JOptionPane.showInputDialog("Enter your age.");
        String major = JOptionPane.showInputDialog("Enter your major.");
        
        System.out.println(name + " is " + age + " years old, and is majoring "
                + "in " + major + ".");
        
        String future = JOptionPane.showInputDialog("Enter your future profession.");
        String year = JOptionPane.showInputDialog("Enter your expected "
                + "graduation year");
        
        System.out.println("By the year " + year + ", " + name + " will become "
                + "a " + future + ".");
    }
}
