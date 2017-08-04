/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lastdigitdistribution;
public class RandomSequence implements Sequence
{
   public int next()
   {
      return (int) (Integer.MAX_VALUE * Math.random());
   }
}
