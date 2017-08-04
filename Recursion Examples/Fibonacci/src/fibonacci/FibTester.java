package fibonacci;

public class FibTester
{
   public static void main(String [] args)
   {
     /* FastFibComputer fibber = new FastFibComputer();

      System.out.println(fibber.fib(2));
      System.out.println("Expected: 1");

      System.out.println(fibber.fib(10));
      System.out.println("Expected: 55");
     */
       
       RegularFibonacci fib = new RegularFibonacci();
       System.out.println("Fibonacci of 3 is " + fib.calcFibonacci(3));
       System.out.println("Fibonacci of 1 is " + fib.calcFibonacci(1));
       System.out.println("Fibonacci of 10 is " + fib.calcFibonacci(10));
       System.out.println("Fibonacci of 50 is " + fib.calcFibonacci(50));
       
   }
}
