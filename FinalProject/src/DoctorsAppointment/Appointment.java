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
 * A class to create an Appointment.
 * @author 4174075
 */
public class Appointment 
{
    private String firstName;
    private String lastName;
    private String date;
    private int time;
    
    /**
     * Constructs an appointment.
     * @param firstName First name of patient
     * @param lastName Last name of patient
     * @param date Date of appointment (YYYY MM DD)
     * @param time Time of appointment in military (HHMM)
     */
    public Appointment(String firstName, String lastName, String date, int time)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.time = time;
    }
    
    /**
     * Gets the first name of the patient.
     * @return First name
     */
    public String getFirst()
    {
        return firstName;
    }
    
    /**
     * Gets the last name of the patient.
     * @return Last name
     */
    public String getLast()
    {
        return lastName;
    }
    
    /**
     * Gets the date of the appointment.
     * @return Date (YYYY MM DD)
     */
    public String getDate()
    {
        return date;
    }
    
    /**
     * Gets the time of the appointment.
     * @return Time in military (HHMM)
     */
    public int getTime()
    {
        return time;
    }
    
    /**
     * Returns the information of the Appointment.
     * @return Last name, first name, date, and time of the appointment as a string.
     */
    public String toString()
    {
        return "\nName: " + lastName + ", " + firstName + "\nDate: " + date + "\nTime: " + time + "\n";
    }
}
