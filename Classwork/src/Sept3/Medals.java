package Sept3;

/**
 *
 * @author 
 */
public class Medals 
{
    public static void main(String[] args)
    {
        int[][] medals = {{1, 0, 1}, {1, 1, 0}, {0, 0, 1}, {1, 0, 0}, {0, 1, 1},
            {0, 1, 1}, {1, 1, 0}} ;
        
        String[] country = {"Canada", "China", "Germany", "Korea", "Japan", 
            "Russia", "United States"} ;
        
        int count = 0 ;
        int total = 0 ;
        for (int i = 0; i < medals.length; i++)
        {
            System.out.print(country[i]) ;
            for (int j = 0; j < medals[i].length; j++)
            {
                count += medals[i][j] ; 
                if (i < 6 && j == 0)
                {
                    System.out.print("\t\t" + medals[i][j]) ;
                }
                else
                {
                    System.out.print("\t" + medals[i][j]);
                }
            }
            System.out.print("\t" + count + "\n") ;

            total += count ;
            count = 0 ;
        }
        
        System.out.println("\nTotal Medals:\t" + total) ;
    }  
}
