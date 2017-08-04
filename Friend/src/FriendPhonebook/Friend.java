package FriendPhonebook ;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            ArrayList Review
// Files:            Friend.java, PhoneBookSimulation.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates an ArrayList of phonebook 
//                                         entries.
//
///////////////////////////////////////////////////////////////////////////////

/**
 * A class to create a Friend object.
 * @author 4174075
 */
public class Friend
{    
     private static int friendNumber = 0 ;
     private int friendIdNumber ;
     private String firstName ;
     private String lastName ;
     private String cellPhoneNumber ;

     /**
      * Creates a Friend object using a person's first name, last name, and 
      * cell phone number.
      * @param aFirstName A friend's first name
      * @param aLastName A friend's last name
      * @param aCellPhoneNumber A friend's cell phone number
      */
     public Friend (String aFirstName, String aLastName, String aCellPhoneNumber)
    {    firstName = aFirstName ;
         lastName = aLastName ;
         cellPhoneNumber = aCellPhoneNumber ;
         friendNumber++ ; // Friend number increments for each new friend
         friendIdNumber = friendNumber ;
    }
     /**
      * Get the friend's information as a String.
      * @return The friend's ID number, first name, last name, and cell phone 
      * number
      */
    public String toString()
    {   
         return friendIdNumber + " " + firstName + " " + lastName + " " + 
                cellPhoneNumber ;
    }
    // Add all the needed getters and setters...
    
    /**
     * Get the friend's ID number.
     * @return Friend ID number
     */
    public int getFriendIdNumber()
    {
        return friendIdNumber ;
    }
    /**
     * Get the friend's first name.
     * @return First name
     */
    public String getFirstName()
    {
        return firstName ;
    }
    /**
     * Get the friend's last name.
     * @return Last name
     */
    public String getLastName()
    {
        return lastName ;
    }
    /**
     * Get the friend's cell phone number.
     * @return Cell phone number
     */
    public String getCellPhoneNumber()
    {
        return cellPhoneNumber ;
    }
    
    /**
     * Change the friend's first name.
     * @param firstName New first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName ;
    }
    /**
     * Change the friend's last name.
     * @param lastName New last name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName ;
    }
    /**
     * Change the friend's cell phone number.
     * @param cellPhoneNumber New cell phone number
     */
    public void setCellPhoneNumber(String cellPhoneNumber)
    {
        this.cellPhoneNumber = cellPhoneNumber ;
    }
 }
