package Reverse;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Implementing Stacks
// Files:            LinkedListStack.java, ReverseString.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Reads a text file and reverses its 
//                                         contents using stacks.
///////////////////////////////////////////////////////////////////////////////

import java.util.NoSuchElementException;

/**
 * A class to create a Stack object.
 * @author 4174075
 */
public class LinkedListStack 
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
    
    /**
     * Constructs an empty Stack.
     */
    public LinkedListStack()
    {
        first = null;
    }
    
    /**
     * Stores data in the stack.
     * @param element An object to store in the stack
     */
    public void push(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first; // pushes the first node back
        first = newNode;
    }
    
    /**
     * Displays the data in the current position in the stack.
     * @return The data contained in the current node
     */
    public Object pop()
    {
        if (first == null) 
        {
            throw new NoSuchElementException();
        }
        
        Object element = first.data;
        first = first.next;
        return element;
    }
    
    /**
     * Determines if the stack is empty.
     * @return True if it is empty, false otherwise
     */
    public boolean empty()
    {
        return first == null;
    }
}
