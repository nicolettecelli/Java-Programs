/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studentdemo;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Owner
 */
public class StudentDemo {

    Student myStudents[] = new Student[5];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        StudentDemo myDemo = new StudentDemo();
        myDemo.createStudents();
        myDemo.computeGPA();
        myDemo.summarizeTotals();
        
    }
    
    public void createStudents()
    {
        ArrayList<Double> johnnysGrades = new ArrayList<>();
        johnnysGrades.add(87.5);
        johnnysGrades.add(95.3);
        johnnysGrades.add(78.5);
        Student johnny = new K12Student("1234567", "Johnny", "Mike", "Smith", johnnysGrades, 4);
        myStudents[0] = johnny;
        
        ArrayList<Double> marysGrades = new ArrayList<>();
        marysGrades.add(97.5);
        marysGrades.add(95.3);
        marysGrades.add(98.5);
        Student mary = new K12Student("1234568", "Mary", "Mae", "Jones", marysGrades, 12);
        myStudents[1] = mary;
        
        ArrayList<Double> juansGrades = new ArrayList<>();
        juansGrades.add(87.5);
        juansGrades.add(85.3);
        juansGrades.add(88.5);
        Student juan = new CollegeStudent("1234569", "Juan", "Carlos", "Molina", juansGrades, 4);
        myStudents[2] = juan;
        
        ArrayList<Double> aliciasGrades = new ArrayList<>();
        aliciasGrades.add(40.5);
        aliciasGrades.add(35.3);
        aliciasGrades.add(50.5);
        Student alicia = new CollegeStudent("1234588", "Alicia", "Maria", "Rodriguez", aliciasGrades, 3);
        myStudents[3] = alicia;
        
         ArrayList<Double> jamalsGrades = new ArrayList<>();
        jamalsGrades.add(97.5);
        jamalsGrades.add(95.3);
        jamalsGrades.add(98.5);
        Student jamal = new CollegeStudent("1234438", "Jamal", "Marcus", "Wilson", jamalsGrades, 2);
        myStudents[4] = jamal;
    }
    
    
    public void computeGPA()
    {
       for (Student studs: myStudents) 
       {
           studs.calculateGPA();
           System.out.println(studs);           
       }
    }
    
    public void summarizeTotals()
    {
        System.out.println("The total number of college students is: "+ CollegeStudent.getCollegeStudentCount());
        System.out.println("The total number of K12 students is: " + K12Student.getK12StudentCount());
        Arrays.sort(myStudents);
        
        for (int i = 0; i < myStudents.length; i++)
        {
            System.out.println(myStudents[i]);
        }
        
    }
}
        
        
        
   
