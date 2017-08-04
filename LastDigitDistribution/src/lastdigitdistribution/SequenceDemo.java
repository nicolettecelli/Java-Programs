/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lastdigitdistribution;
public class SequenceDemo
{
   public static void main(String[] args)
   {
      LastDigitDistribution dist1 = new LastDigitDistribution();
      dist1.process(new SquareSequence(), 1000);
      dist1.display();

      System.out.println();

      LastDigitDistribution dist2 = new LastDigitDistribution();
      dist2.process(new RandomSequence(), 1000);
      dist2.display();
      
      
   }
}

/*public class SequenceDemo
   public static void main(String[] args)
   {
      PrimeSequence primes = new PrimeSequence();

      for (int i = 0; i < 100; i++)
      {
         System.out.println(primes.next());
      }
   }
}
 
 */
