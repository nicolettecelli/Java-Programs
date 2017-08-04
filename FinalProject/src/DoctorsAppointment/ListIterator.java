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

/**
 * An interface to outline a List Iterator.
 * @author 4174075
 */
public interface ListIterator 
{
    /**
    * Moves the iterator to the next position.
    * @return The appointment in the next position
    */
    public Appointment next();
    
    /**
    * Determines whether there is another Appointment in the next position.
    * @return True if there is another appointment, false otherwise
    */
    public boolean hasNext();
    
    /**
    * Removes the Appointment in the current position.
    */
    public void remove();
    
    /**
    * Adds an Appointment and moves to the next position.
    * @param element Appointment to be added
    */
    public void add(Appointment element);
    
    /**
    * Sets the data in the current position to this Appointment.
    * @param element Appointment to be set to the current position
    */
    public void set(Appointment element);
    
    /**
    * Searches the list for a certain appointment.
    * @param element Appointment used to search
    * @return Null if it was not found, or the position's data if it was found
    */
    public Appointment find(Appointment element);
    
    /**
    * Replaces an old appointment with a new one.
    * @param oldApp Old appointment to be replaced
    * @param newApp New appointment that replaces the old one
    * @return True if the new appointment was made, false if it is to be added to a waiting queue
    */
    public boolean replaceAppointment(Appointment oldApp, Appointment newApp);
    
    /**
    * Creates an appointment.
    * @param element Appointment to be added to the list
    * @return True if it was added, false if it is to be added to a waiting list
    */
    public boolean makeAppointment(Appointment element);
    
    /**
    * Determines if the appointment has a valid time.
    * @param element Appointment to be validated
    * @return True if the time is valid, false otherwise
    */
    public boolean validateAppointment(Appointment element);
    
    /**
    * Removes an appointment.
    * @param element Appointment to be removed
    */
    public void removeAppointment(Appointment element);
}
