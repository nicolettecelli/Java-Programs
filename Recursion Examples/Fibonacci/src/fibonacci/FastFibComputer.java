package fibonacci;
import java.util.ArrayList;

/**
   This program computes Fibonacci numbers, remembering
   existing values.
*/ 

public class FastFibComputer
{
   private ArrayList<Long> knownValues;

   public FastFibComputer()
   {
      knownValues = new ArrayList<Long>();
      knownValues.add(null);
      knownValues.add(new Long(1));
      knownValues.add(new Long(1));
   }
 
   /**
      Computes a Fibonacci number.
      @param n an integer
      @return the nth Fibonacci number
   */
   public long fib(int n)
   {  
      if (n < knownValues.size() && knownValues.get(n) != null)
      {
         return knownValues.get(n);
      }
      long r = fib(n - 1) + fib(n - 2);
      while (knownValues.size() <= n) { knownValues.add(null); }
      knownValues.set(n, r);     
      return r;
   }
}
