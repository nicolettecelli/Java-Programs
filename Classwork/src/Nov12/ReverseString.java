package Nov12;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 4174075
 */
public class ReverseString 
{
    public static void main (String[] args)
    {
        String input = JOptionPane.showInputDialog("Enter a string.");
        
        Scanner in = new Scanner(input);
        LinkedListStack stack = new LinkedListStack();
        
        while (in.hasNext())
        {            
            String word = in.next();
            
            if (!(word.equals(word.toLowerCase())))
            {
                word = word.toLowerCase();
                stack.push(word + ".");
            }
            else if (word.contains("."))
            {
                word = StringUtils.capitalize(word);
                stack.push(word.replace(".", ""));

                while (!stack.empty())
                {
                    System.out.print(stack.pop() + " ");
                }
            }
            else
            {
                stack.push(word); 
            }
        }
            
        in.close();
    }
}
