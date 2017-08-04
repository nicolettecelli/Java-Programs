package Nov5;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author 
 */
public class ReservationDemo 
{
    public static void main (String[] args)
    {
        Reservation one = new Reservation("Diana", 1300, 3);
        Reservation two = new Reservation("Harry", 2000, 2);
        Reservation three = new Reservation("Tom", 1900, 4);
        
        LinkedList<Reservation> list = new LinkedList<Reservation>();
        list.addLast(one);
        list.addLast(two);
        list.addLast(three);
        
        
        ListIterator<Reservation> iterator = list.listIterator();
        
        int i = 0;
        while(i < list.size())
        {
            System.out.println(iterator.next().toString());
            i++;
        }
        if (!iterator.hasPrevious())
        {
            iterator.add(new Reservation("Juliet", 1500, 1));
            iterator.add(new Reservation("Nina", 1200, 2));
        }
        System.out.println(iterator.previous().toString());
    }
}
