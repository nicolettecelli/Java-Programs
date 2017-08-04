package Queue;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Implementing Queues
// Files:            LinkedListQueue.java, QueueTest.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Uses a Linked List Queue to print sets
//                                         of names in first in, first out order
///////////////////////////////////////////////////////////////////////////////

import java.util.NoSuchElementException;

/**
 * A class to create a Queue object.
 * @author 4174075
 */
public class LinkedListQueue 
{
    /**
     * A class to create a Node.
     */
    class Node
    {
        public Object data;
        public Node next;
    }
    
    private Node first;
    private Node last;
    
    /**
     * Constructs an empty Queue.
     */
    public LinkedListQueue()
    {
        first = null;
        last = null;
    }
    
    /**
     * Stores data into the queue.
     * @param element An object to be added to the stack
     */
    public void enqueue(Object element)
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
    public Object dequeue()
    {
        if (last == null || first == null) // Empty queue
        {
            throw new NoSuchElementException();
        }
        
        Object element = first.data; // First in, first out
        
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
}
