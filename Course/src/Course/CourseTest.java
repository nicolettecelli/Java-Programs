package Course;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Using Comparable & Comparator
// Files:            Course.java, FloridaCourseNameComparator.java, 
//                   YearLevelComparator.java, CourseTest.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates arrays of courses and uses 
//                      Comparable and Comparator to sort the arrays.
///////////////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 4174075
 */
public class CourseTest 
{
    public static void main(String[] args)
    {
        createArray();
        displayMenu();
    }
    
    static ArrayList<Course> courses = new ArrayList<Course>();
    
    public static void createArray()
    {
        int another = 0;
        
        while (another == 0) // "Yes" option
        {
            String fiuCourseName = JOptionPane.showInputDialog("Enter the FIU "
                    + "course name.");
            
            String creditsString = JOptionPane.showInputDialog("Enter the "
                    + "amount of credits.");
            int credit = Integer.parseInt(creditsString);
            
            String FLCourseNames = JOptionPane.showInputDialog("Enter the "
                    + "Florida course name.");
            
            ArrayList<String> prerequisites = new ArrayList<String>();
            String prerequisite = JOptionPane.showInputDialog("Enter the "
                    + "pre-requisites for the course, separated by commas.");
            Scanner scan = new Scanner(prerequisite);
            while (scan.hasNext())
            {
                prerequisites.add(scan.next());
            }
            
            String yearString = JOptionPane.showInputDialog("Enter the year "
                    + "level of the course.");
            int year = Integer.parseInt(yearString);
            
            Course newCourse = new Course(fiuCourseName, credit, FLCourseNames, 
                    prerequisites, year);
            courses.add(newCourse);
            
            another = JOptionPane.showConfirmDialog(null, "Would you like to "
                    + "enter another course?");
        }
    }
    
    public static void displayMenu()
    {
        int choice = 0;
        
        while (choice != -1) // Not cancelled
        {
            String[] options = {"by FIU Course Name", "by Florida Course Name", 
                "by Year Level"};
            
            choice = JOptionPane.showOptionDialog(null, "Choose a sorting method.",
                    null, 0, JOptionPane.QUESTION_MESSAGE, null, options, null);
            
            if (choice == 0) // FIU Course Name
            {
                Collections.sort(courses);
                
                for (int i = 0; i < courses.size(); i++)
                { // prints each course in array
                    System.out.println(courses.get(i).toString() + "\n");
                }
            }
            else if (choice == 1) // Florida Course Name
            {
                FloridaCourseNameComparator fl = new FloridaCourseNameComparator();
                courses.sort(fl);
                
                for (int i = 0; i < courses.size(); i++)
                { // prints each course in array
                    System.out.println(courses.get(i).toString() + "\n");
                }
            }
            else if (choice == 2) // Year Level
            {
                YearLevelComparator y = new YearLevelComparator();
                courses.sort(y);
                
                for (int i = 0; i < courses.size(); i++)
                { // prints each course in array
                    System.out.println(courses.get(i).toString() + "\n");
                }
            }
        }
    }
}
