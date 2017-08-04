/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lastdigitdistribution;
public class SquareSequence implements Sequence
{
   private int n;
   public int next()
   {
       
      n++;
      return n * n;
   }
}
