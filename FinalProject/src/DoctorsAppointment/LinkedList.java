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

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * A class to create a LinkedList of Appointments.
 * @author 4174075
 */
public class LinkedList 
{
    /**
     * A class to create a Node.
     */
    class Node
    {
        public Appointment data;
        public Node next;
    }
    
    private Node first;
    
    /**
     * Instantiates an empty LinkedList.
     */
    public LinkedList()
    {
        first = null;
    }
    
    /**
     * Get the first appointment in the list.
     * @return Appointment located in the first Node
     */
    public Appointment getFirst()
    {
        if (first == null) //empty
        {
            throw new NoSuchElementException();
        }
        
        return first.data;
    }
    
    /**
     * Removes the first appointment in the list.
     * @return The appointment located in the first Node
     */
    public Appointment removeFirst()
    {
        if (first == null) //empty
        {
            throw new NoSuchElementException();
        }
 
        Appointment element = first.data;
        first = first.next;
        return element;
    }
    
    /**
     * Adds an appointment to the beginning of the list.
     * @param element Appointment to add
     */
    public void addFirst(Appointment element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }  
    
    /**
     * Creates a List Iterator.
     * @return Empty iterator
     */
    public ListIterator listIterator()

    {
        return new LinkedListIterator();
    }
////////////////////////////////////////////////////////////////////////////////   
    
    /**
     * A class to create a List Iterator.
     */
    class LinkedListIterator implements ListIterator
    {
        private Node position;
        private Node previous;
        private boolean isAfterNext;
        
        /**
         * Creates an empty iterator.
         */
        public LinkedListIterator()
        {
            position = null;
            previous = null;
            isAfterNext = false;
        }
        
        /**
         * Moves the iterator to the next position.
         * @return The appointment in the next position
         */
        public Appointment next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            }
            
            previous = position;
            isAfterNext = true;
            
            if (position == null)
            {
                position = first;
            }
            else
            {
                position = position.next;
            }
            
            return position.data;
        }
        
        /**
         * Determines whether there is another Appointment in the next position.
         * @return True if there is another appointment, false otherwise
         */
        public boolean hasNext()
        {
            if (position == null)
            {
                return first != null;
            }
            else
            {
                return position.next != null;
            }
        }
        
        /**
         * Adds an Appointment and moves to the next position.
         * @param element Appointment to be added
         */
        public void add(Appointment element)
        {
            if (position == null)
            {
                addFirst(element);
                position = first;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }
            
            isAfterNext = false;
        }
        
        /**
         * Removes the Appointment in the current position.
         */
        public void remove()
        {
            if (!isAfterNext)
            {
                throw new IllegalStateException();
            }
            
            if (position == first)
            {
                removeFirst();
            }
            else
            {
                previous.next = position.next;
            }
            
            position = previous;
            isAfterNext = false;
        }
        
        /**
         * Sets the data in the current position to this Appointment.
         * @param element Appointment to be set to the current position
         */
        public void set(Appointment element)
        {
            if (!isAfterNext)
            {
                throw new IllegalStateException();
            }
            
            position.data = element;
        }
        
        /**
         * Searches the list for a certain appointment.
         * @param element Appointment used to search
         * @return Null if it was not found, or the position's data if it was found
         */
        public Appointment find(Appointment element)
        {
            position = null;
            
            while (hasNext())
            {
                next();
                if (position.data == element)
                {
                    return position.data;
                }
            }
            
            return null;
        }
        
        /**
         * Replaces an old appointment with a new one.
         * @param oldApp Old appointment to be replaced
         * @param newApp New appointment that replaces the old one
         * @return True if the new appointment was made, false if it is to be added to a waiting queue
         */
        public boolean replaceAppointment(Appointment oldApp, Appointment newApp)
        {
            find(oldApp);
            remove();
            
            return makeAppointment(newApp);
        }
        
        /**
         * Creates an appointment.
         * @param element Appointment to be added to the list
         * @return True if it was added, false if it is to be added to a waiting list
         */
        public boolean makeAppointment(Appointment element)
        {
            int thisTime = element.getTime();
            
            Scanner in = new Scanner(element.getDate());
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            
            position = null;
            while (hasNext())
            {
                next();
                Scanner scanner = new Scanner(position.data.getDate());
                int inYear = scanner.nextInt();
                int inMonth = scanner.nextInt();
                int inDay = scanner.nextInt();
                
                if (inYear >= year)
                {
                    if (inMonth >= month)
                    {
                        if (inDay >= day)
                        {
                            if (position.data.getTime() > thisTime)
                            {
                                position = previous;
                                add(element);
                                return true;
                            }
                            else if (position.data.getTime() == thisTime)
                            {
                                return false;
                            }
                        }
                    }
                }
            }
            add(element); // first
            
            return true;
        }
        
        /**
         * Determines if the appointment has a valid time.
         * @param element Appointment to be validated
         * @return True if the time is valid, false otherwise
         */
        public boolean validateAppointment(Appointment element)
        {
             int t = element.getTime();
             
             if (t == 900 || t == 1000 || t == 1100 || t == 1300 || t == 1400 || t == 1500)
             {
                 return true;
             }
             else
             {
                 return false;
             }
        }
        
        /**
         * Removes an appointment.
         * @param element Appointment to be removed
         */
        public void removeAppointment(Appointment element)
        {
            find(element);
            remove();
        }
        
        /**
         * Returns the information for every appointment.
         * @return Data of every node in the list as a String
         */
        public String toString()
        {
            position = null;
            String s = "";
            
            while (hasNext())
            {
                next();
                s += position.data.toString();
            }
            
            return s;
        }
    }
////////////////////////////////////////////////////////////////////////////////    
    
    /**
     * A class to create a Queue.
     */
    class Queue
    {
        private Node first;
        private Node last;
    
        /**
        * Constructs an empty Queue.
        */
        public Queue()
        {
            first = null;
            last = null;
        }
        
        /**
         * Get the first Appointment in the Queue.
         * @return Data in the first node
         */
        public Appointment getFirst()
        {
            return first.data;
        }
    
        /**
        * Stores data into the queue.
        * @param element An appointment to be added to the stack
        */
        public void enqueue(Appointment element)
        {
            Node newNode = new Node();
            newNode.data = element;
        
            if (last == null) // Empty queue
            {
                first = newNode; 
                last = newNode; // First and last node are the same
            }
            else
            {
                last.next = newNode;
                last = newNode; // Adds to the end of the queues
            }
        }
    
        /**
        * Removes and displays the data in the current position.
        * @return The data contained in the current Node
        */
        public Appointment dequeue()
        {
            if (last == null || first == null) // Empty queue
            {
                throw new NoSuchElementException();
            }
        
            Appointment element = first.data; // First in, first out
        
            if (first == last) // One element left in queue
            {
                first = null;
                last = null; // Empties the queue
            }
            else
            {
                first = first.next;
            }
        
            return element;
        }
    
        /**
        * Determines if the queue is empty.
        * @return True if it is empty, or false otherwise
        */
        public boolean empty()
        {
            return first == null;
        }
        
        /**
         * Returns every appointment in the queue.
         * @return Data in every node of the queue as a String
         */
        public String toString()
        {
            String waitinglist = "";
            while (!empty())
            {
                waitinglist += dequeue().toString();
            }
            
            return waitinglist;
        }
    }
}