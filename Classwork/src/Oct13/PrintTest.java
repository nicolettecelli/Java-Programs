package Oct13;

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class PrintTest 
{
    public static void main (String[] args) throws IOException
    {
        PrintWriter output = new PrintWriter("story.txt");
        
        String name = JOptionPane.showInputDialog("Enter your name.");
        String age = JOptionPane.showInputDialog("Enter your age.");
        String major = JOptionPane.showInputDialog("Enter your major.");
        
        output.println(name + " is " + age + " years old, and is majoring "
                + "in " + major + ".");
        
        String future = JOptionPane.showInputDialog("Enter your future profession.");
        String year = JOptionPane.showInputDialog("Enter your expected "
                + "graduation year");
        
        output.println("By the year " + year + ", " + name + " will become "
                + "a " + future + ".");
        
        output.close();
    }
}
