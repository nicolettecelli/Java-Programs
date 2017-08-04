/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentdemo;
import java.util.ArrayList;
/**
 *
 * @author Owner
 */
public class K12Student extends Student implements StudentCalculations, Comparable  {
    
    private int yearInK12School;
    private double rank;
    private static int k12StudentCount;
   
    
    public K12Student(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades, int aYearInK12School)
    {
        super (anId, aFirstName, aMiddleName, aLastName, aListOfGrades);
        yearInK12School = aYearInK12School;
        k12StudentCount++;
        
    }    
    
    public void setYearInK12School(int aYearInK12School)
    {
        yearInK12School = aYearInK12School;
    }
    
    public int getYearInK12School()
    {
        return yearInK12School;
    }
    
    public void setRank(double aRank)
    {
        rank = aRank;
    }
    
    public double getRank()
    {
        return rank;
    }
    
    public static int getK12StudentCount()
    {
        return k12StudentCount;
    }
    
    @Override
    public double calculateGPA()
    {
       double totalGrades = 0;
       double avgGrades;
       ArrayList<Double> myGrades = getGrades();
       
       for (int i = 0; i< getGrades().size(); i++ )
       {
         // totalGrades += myGrades.get(i);
         totalGrades += myGrades.get(i); 
       }
       avgGrades = totalGrades / getGrades().size();
       
       if (avgGrades >= .90)
       {
           setRank(.10);
       }
       else if (avgGrades >= .80)
       {
           setRank(.20);
       }
       else if (avgGrades >= .70)
       {
           setRank(.30);
       }
       else if (avgGrades >= .60)
       {
           setRank(.40);
       }
       else if (avgGrades >= .50)
       {
           setRank(.50);
       }
       else if (avgGrades >= .40)
       {
           setRank(.60);
       }
       else if (avgGrades >= .30)
       {
           setRank(.70);
       }
       else if (avgGrades >= .20)
       {
           setRank(.80);
       }
       else if (avgGrades >= .10)
       {
           setRank(.90);
       }
       else
       {
           setRank(1.00);
       }
       
       return Math.round(avgGrades);
    }
        
  @Override
    public String toString()
    {
        return super.toString() + " " + getRank();
    }  
    
    @Override
    public int calculateYearsLeft()
    {
        return 12 - yearInK12School;
    }
    
    public int compareTo(Object aStudent)
    {
        return getId().compareTo(((Student)aStudent).getId());
        
        // if (getId() > ((Student) aStudent).getId())
        //     return 1;
        // else if (getId() < ((Student) aStudent).getId())
        //     return -1;
        // else
        //     return 0;
        
        
    }
}

