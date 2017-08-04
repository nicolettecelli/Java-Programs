package StaticDemo;

/**
   This program demonstrates the Countable class.
*/

public class StaticDemo2
{
       Countable object1;
       Countable object2;
       Countable object3;
   public static void main(String[] args)
   {
       StaticDemo2 aDemo = new StaticDemo2();
       
       //object1 = createObjects(object1, object2, object3);  
       aDemo.createObjects(); 
       aDemo.printObjects();
  }
   
   public  void createObjects()
   {
       // Create three instances of the 
      // Countable class.
      object1 = new Countable();
      System.out.println("count=" + object1.getInstanceCount());
      object2 = new Countable();
      System.out.println("count=" + object1.getInstanceCount());
      object3 = new Countable();
      System.out.println("count=" + object1.getInstanceCount());
     // return object1;
        
      
   }
   
   public  void printObjects()
   {
        int objectCount;

      // Get the number of instances from
      // the class's static field.
      objectCount = object1.getInstanceCount();
      System.out.println(objectCount + 
                    " instances of the class " +
                    "were created.");
       
   }   
}