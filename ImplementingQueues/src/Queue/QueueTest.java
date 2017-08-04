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

/**
 * 
 * @author 4174075
 */
public class QueueTest 
{
    public static void main (String[] args)
    {
        LinkedListQueue queue = new LinkedListQueue();
        
        queue.enqueue("Mary");
        queue.enqueue("John");
        queue.enqueue("Diane");
        
        while (!queue.empty()) // Iterates the entire queue
        {
            System.out.println(queue.dequeue());
        }
        
        queue.enqueue("Tom");
        queue.enqueue("Jerry");
        
        while (!queue.empty())
        {
            System.out.println(queue.dequeue());
        }
    }
}
