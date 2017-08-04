package Nov12;

import java.util.NoSuchElementException;

/**
 *
 * @author 4174075
 */
public class LinkedListStack 
{
    class Node
    {
        public Object data;
        public Node next;
    }
    private Node first;
    
    public LinkedListStack()
    {
        first = null;
    }
    
    public void push(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }
    
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
    
    public boolean empty()
    {
        return first == null;
    }
}
