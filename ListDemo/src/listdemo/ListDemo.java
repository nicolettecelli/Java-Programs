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

import java.util.LinkedList;
import java.util.ListIterator;
/**
 *
 * @author mtsguest
 */
public class ListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean alreadyAdded = false;
        LinkedList<PhoneBook> myPhoneList = new LinkedList<PhoneBook>();
        
       
        myPhoneList.add(new PhoneBook("Mary", "Jones", "(786)111-222-3333", "MJones@att.net"));
        myPhoneList.add(new PhoneBook("Paul", "Garcia", "(786)190-312-3783", "PGarcia@att.net"));
        myPhoneList.add(new PhoneBook("Jorge", "Smith", "(786)145-221-3887", "JSmith@att.net"));
        
        PhoneBook candidate = new PhoneBook("Tarry", "Yates", "(305)552-1212", "TYates@bellsouth.net");
        System.out.println("_____________________________Going Forward_____________________");
        ListIterator<PhoneBook> iterator = myPhoneList.listIterator();
        while (iterator.hasNext() && alreadyAdded == false)
        {
            
            PhoneBook aPhoneEntry = iterator.next();
            System.out.println(aPhoneEntry); 
            
            
           // System.out.println("COmpareTo Value is " + (aReservation.compareTo(candidate)));
            if (aPhoneEntry.compareTo(candidate) > 0 )
            {
                iterator.previous();
                iterator.add(candidate);
                alreadyAdded = true;
                System.out.println("Tarry Yates was added in the middle.");
            }
           
        }
        
        if (!alreadyAdded)
        {
           iterator.add(candidate); 
        }
        
      
        System.out.println("++++++Going Backwards+++++++++++++++++++++++ ");
         while (iterator.hasPrevious())
        {
            PhoneBook aPhoneEntry = iterator.previous();
            System.out.println(aPhoneEntry); 
        }
        
        
    }
    
}