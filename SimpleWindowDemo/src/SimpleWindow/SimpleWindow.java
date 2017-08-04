/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleWindow;


import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for ActionListener Interface

/**
   The KiloConverterWindow class displays a JFrame that
   lets the user enter a distance in kilometers. When
   the Calculate button is clicked, a dialog box is
   displayed with the distance converted to miles.
*/

public class SimpleWindow extends JFrame
{
   private JPanel panel;             // To reference a panel
   private JLabel messageLabel;      // To reference a label
   private JTextField kiloTextField; // To reference a text field
   private JButton calcButton;       // To reference a button
   private final int WINDOW_WIDTH = 800;  // Window width
   private final int WINDOW_HEIGHT = 800; // Window height

   /**
      Constructor
   */

   public SimpleWindow()
   {
      // Set the window title.
      setTitle("Simple Window");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     

      // Display the window.
      setVisible(true);
   }

   
  
   /**
      The main method creates an instance of the
      KiloConverterWindow class, which displays
      its window on the screen.
   */

   public static void main(String[] args)
   {
      new SimpleWindow();
   }
}
