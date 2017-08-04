package FriendPhonebook ;

import java.util.ArrayList;
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
 * 
 * @author 4174075
 */
public class PhoneBookSimulation 
{
    public static void main(String args[])
    {   // ArrayList
        ArrayList<Friend> myFriends = new ArrayList<Friend>() ;
        
        Friend Glenda = new Friend ("Glenda", "Gonzalez", "(305) 555 4505") ;
        Friend Jennie = new Friend ("Jennie", "Pham", "(305) 665 2389") ;
        Friend Michael = new Friend ("Michael", "Wills", "(305) 987 3455") ;
        Friend Kadina = new Friend ("Kadina", "Pazcastillo", "(305) 222 3813") ;
        Friend Stephan = new Friend ("Stephan", "Mouhanna", "(305) 774 3432") ;
        
        myFriends.add(Glenda) ;
        myFriends.add(Jennie) ;
        myFriends.add(Michael) ;
        myFriends.add(Kadina) ;
        myFriends.add(Stephan) ;
        
        Glenda.setCellPhoneNumber("(305) 222 2121") ;

        myFriends.remove(4) ;
        
        System.out.println(myFriends.toString()) ;
        
        // Array
        Friend[] myFriend = {Glenda, Jennie, Michael, Kadina, Stephan} ;
        
        Glenda.setCellPhoneNumber("(305) 555 5555") ;
        
        myFriend[4] = null ;
        
        String current = "" ;
        
        for (int i = 0; i < myFriend.length; i++)
        {
            if (i == myFriend.length - 1)
            {
                current = current + myFriend[i] ;
            }
            else
            {
                current = current + myFriend[i] + ", " ;
            }
        }
        
        System.out.println("[" + current + "]") ;
    }
}
