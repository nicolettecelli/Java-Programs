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
public class CollegeStudent extends Student implements StudentCalculations, Comparable {
    
     
    private int yearInCollege;
    private String levelOfDistinction;
    private static int collegeStudentCount;
   
    
    public CollegeStudent(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades, int aYearInCollege)
    {
        super (anId, aFirstName, aMiddleName, aLastName, aListOfGrades);
        yearInCollege = aYearInCollege;
        levelOfDistinction = "None";
        collegeStudentCount++;
        
    }    
    
    public void setYearInCollege(int aYearInCollege)
    {
        yearInCollege = aYearInCollege;
    }
    
    public int getYearInCollege()
    {
        return yearInCollege;
    }
    
    public void setLevelOfDistinction(String aLevelOfDistinction)
    {
        levelOfDistinction = aLevelOfDistinction;
    }
    
    public String getLevelOfDistinction()
    {
        return levelOfDistinction;
    }
    
    public static int getCollegeStudentCount()
    {
        return collegeStudentCount;
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
       //System.out.println("Total Grades College = " + totalGrades);
      // System.out.println("Total Number of Grades = " + myGrades.size());
       
       avgGrades = (totalGrades / (getGrades().size()));
       avgGrades = avgGrades / 100;
       //System.out.println("Average = " + avgGrades);
       
       if (avgGrades >= .98)
       {
           setLevelOfDistinction("summa cum laude");
       }
       else if (avgGrades >= .95)
       {
           setLevelOfDistinction("magna cum laude");
       }
       else if (avgGrades >= .90)
       {
           setLevelOfDistinction("cum laude");
       }
      
       
       return Math.round(avgGrades);
    }
        
    @Override
    public String toString()
    {
        return super.toString() + " " + getLevelOfDistinction();
    }      
    
   
   public int calculateYearsLeft()
    {
        return 4- yearInCollege;
        
    }
   
   public int compareTo(Object aStudent)
    {
        return getId().compareTo(((Student)aStudent).getId());
    }
}

    

