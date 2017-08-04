package DoctorsAppointment;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Doctor's Appointments
// Files:            LinkedList.java, Appointment.java, ListIterator.java
//                   DrAppointmentsTest.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates an appointment list using  
//                      LinkedList and Queues with a menu with multiple options
///////////////////////////////////////////////////////////////////////////////

import DoctorsAppointment.LinkedList.LinkedListIterator;
import DoctorsAppointment.LinkedList.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author 4174075
 */
public class DrAppointmentsTest 
{
    public static void main (String[] args)
    {
        LinkedList list = new LinkedList();
        Queue waiting = list.new Queue();
        boolean wait = false;
        ListIterator pointer = list.listIterator();
        
///////////////////// Part 1 ///////////////////////////////////////////////////
        Appointment one = new Appointment("John", "Smith", "2015 12 12", 1500);
        pointer.makeAppointment(one);
        
        Appointment two = new Appointment("Mary", "Jones", "2015 12 13", 1400);
        pointer.makeAppointment(two);
        
        Appointment three = new Appointment("Jim", "Hernandez", "2015 12 13", 1300);
        pointer.makeAppointment(three);
        
        Appointment four = new Appointment("Mary", "Jones", "2015 12 13", 1100);
        pointer.replaceAppointment(two, four);
        
        Appointment five = new Appointment("Ron", "Stevens", "2015 12 12", 1000);
        pointer.makeAppointment(five);
        
        pointer.removeAppointment(one);
        
        Appointment six = new Appointment("Nick", "Hernandez", "2016 1 3", 900);
        pointer.makeAppointment(six);
        
        Appointment seven = new Appointment("Joe", "Kline", "2016 1 3", 900);
        wait = pointer.makeAppointment(seven);
        if (!wait)
        {
            waiting.enqueue(seven);
        }
        
        Appointment eight = new Appointment("Maria", "Garcia", "2015 12 21", 1100);
        pointer.makeAppointment(eight);
        
        Appointment nine = new Appointment("Jose", "Gonzalez", "2015 12 21", 1100);
        wait = pointer.makeAppointment(nine);
        if (!wait)
        {
            waiting.enqueue(nine);
        }
        
        Appointment ten = new Appointment("Luis", "Leeds", "2015 12 5", 1700);
        if (pointer.validateAppointment(ten))
        {
            pointer.makeAppointment(ten);
        }
        else
        {
            System.out.println("Invalid time for appointment: " + ten.toString());
        }
        
        System.out.println("\n\nAppointments:\n\n" + pointer.toString());
        
        System.out.println("\n\nWaiting List:\n\n" + waiting.toString());
        
 ////////////////////////////////// Part 2 /////////////////////////////////////  
        int choice = 0;
        
        while (choice != -1) // Not cancelled
        {
            String[] options = {"Make an Appointment", "Change an Appointment", 
                "Cancel an Appointment", "Look up an Appointment", 
                "Process an Appointment from the Waiting List", "Print Appointment List and Waiting List"};
            
            choice = JOptionPane.showOptionDialog(null, "Choose an option.",
                    null, 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
            
            if (choice == 0) // Make Appointment
            {
                String inputFirstName = JOptionPane.showInputDialog("Enter the patient's first name.");
                String inputLastName = JOptionPane.showInputDialog("Enter the patient's last name.");
                String inputDate = JOptionPane.showInputDialog("Enter the desired date. (YYYY MM DD)");
                String inputTimeS = JOptionPane.showInputDialog("Enter the desired time in military time. (HHMM)");
                int inputTime = Integer.parseInt(inputTimeS);
                
                Appointment patient = new Appointment(inputFirstName, inputLastName, inputDate, inputTime);
                
                if (pointer.validateAppointment(patient))
                {
                    wait = pointer.makeAppointment(patient);
                    
                    if (!wait)
                    {
                        waiting.enqueue(patient);
                        JOptionPane.showMessageDialog(null, "Your appointment has been added to the waiting list. "
                                + "When this spot is available, your appointment will be added.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your appointment has been scheduled.");
                    }                    
                }
            }
            else if (choice == 1) // Change Appointment
            {
                String inputFirstName = JOptionPane.showInputDialog("Enter the patient's first name.");
                String inputLastName = JOptionPane.showInputDialog("Enter the patient's last name.");
                String oldDate = JOptionPane.showInputDialog("Enter the old date. (YYYY MM DD)");
                String oldTimeS = JOptionPane.showInputDialog("Enter the old time in military time. (HHMM)");
                int oldTime = Integer.parseInt(oldTimeS);
                String newDate = JOptionPane.showInputDialog("Enter the new date. (YYYY MM DD)");
                String newTimeS = JOptionPane.showInputDialog("Enter the new time in military time. (HHMM)");
                int newTime = Integer.parseInt(newTimeS);
                
                Appointment oldApp = new Appointment(inputFirstName, inputLastName, oldDate, oldTime);
                Appointment newApp = new Appointment(inputFirstName, inputLastName, newDate, newTime);
                
                if (pointer.validateAppointment(newApp))
                {
                    if (pointer.find(oldApp) == null)
                    {
                        JOptionPane.showMessageDialog(null, "The old appointment was not found.");
                    }
                    
                    wait = pointer.replaceAppointment(oldApp, newApp);
                    
                    if (!wait)
                    {
                        waiting.enqueue(newApp);
                        JOptionPane.showMessageDialog(null, "Your appointment has been added to the waiting list. "
                                + "When this spot is available, your appointment will be added.");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Your appointment has been scheduled.");
                    }
                }            
            }
            else if (choice == 2) // Cancel Appointment
            {
                String inputFirstName = JOptionPane.showInputDialog("Enter the patient's first name.");
                String inputLastName = JOptionPane.showInputDialog("Enter the patient's last name.");
                String oldDate = JOptionPane.showInputDialog("Enter the appointment date. (YYYY MM DD)");
                String oldTimeS = JOptionPane.showInputDialog("Enter the appointment time in military time. (HHMM)");
                int oldTime = Integer.parseInt(oldTimeS);
                
                Appointment patient = new Appointment(inputFirstName, inputLastName, oldDate, oldTime);
                
                if (pointer.find(patient) == null)
                {
                    JOptionPane.showMessageDialog(null, "The old appointment was not found.");
                }
                else
                {
                    pointer.removeAppointment(patient);
                    JOptionPane.showMessageDialog(null, "The appointment has been cancelled.");
                }
            }
            else if (choice == 3) // Look up an appointment
            {
                String inputFirstName = JOptionPane.showInputDialog("Enter the patient's first name.");
                String inputLastName = JOptionPane.showInputDialog("Enter the patient's last name.");
                String inputDate = JOptionPane.showInputDialog("Enter the appointment date. (YYYY MM DD)");
                String inputTimeS = JOptionPane.showInputDialog("Enter the appointment time in military time. (HHMM)");
                int inputTime = Integer.parseInt(inputTimeS);
                
                Appointment patient = new Appointment(inputFirstName, inputLastName, inputDate, inputTime);
                Appointment found = pointer.find(patient);
                
                if (found != null)
                {
                    JOptionPane.showMessageDialog(null, "The appointment has been found: " + found.toString());
                }
            }
            else if (choice == 4) // Proccess waiting list
            {
                Appointment current = null;
                
                while (current != waiting.getFirst())
                {
                    current = waiting.dequeue();
                    boolean success = pointer.makeAppointment(current);
                    
                    if (success)
                    {
                        JOptionPane.showMessageDialog(null, "The appointment has been added "
                                + "to the appointment list: " + current.toString());
                    }
                    else
                    {
                        waiting.enqueue(current);
                    }
                }
            }
            else if (choice == 5) // Print lists
            {
                System.out.println("\n\nAppointments:\n\n" + pointer.toString());
                System.out.println("\n\nWaiting List:\n\n" + waiting.toString());
            }
        }
    }
}
