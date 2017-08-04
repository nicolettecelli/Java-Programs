/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listdemo;

/**
 *
 * @author mtsguest
 */
public class PhoneBook implements Comparable<PhoneBook> {
    
    String firstName;
    String lastName;
    String cellPhone;
    String email;
    
    public PhoneBook(String aFirstName, String aLastName, String aCellPhone, String anEmail)
    {
        firstName = aFirstName;
        lastName = aLastName;
        cellPhone = aCellPhone;
        email = anEmail;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " " + cellPhone + " " + email;
                
    }
    
    public int compareTo(PhoneBook other)
    {
        if (lastName.compareTo(other.lastName) > 0 )
            return 1;
        else if (lastName.compareTo(other.lastName) < 0)
            return -1;
        else 
            return (firstName.compareTo(other.firstName));
            
            
    }
    {
        
    }
    
}
