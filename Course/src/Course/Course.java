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

/**
 * A class to create a Course.
 * @author 4174075
 */
public class Course implements Comparable
{
    private String FIUCourseName;
    private int credits;
    private String FloridaCourseName;
    ArrayList<String> preRequisites;
    private int yearLevel;
    
    /**
     * Creates a Course object.
     * @param FIUCourseName The FIU course name
     * @param credits The amount of credits
     * @param FloridaCourseName The Florida course name
     * @param preRequisites The pre-requisites required to take the course
     * @param yearLevel The year level of the course
     */
    public Course(String FIUCourseName, int credits, String FloridaCourseName, 
            ArrayList<String> preRequisites, int yearLevel)
    {
        this.FIUCourseName = FIUCourseName;
        this.credits = credits;
        this.FloridaCourseName = FloridaCourseName;
        this.preRequisites = preRequisites;
        this.yearLevel = yearLevel;
    }
    
    /**
     * Gets the FIU course name.
     * @return FIU course name
     */
    public String getFIUCourseName()
    {
        return FIUCourseName;
    }
    
    /**
     * Gets the course's amount of credits.
     * @return The amount of credits
     */
    public int getCredits()
    {
        return credits;
    }
    
    /**
     * Gets the Florida course name.
     * @return Florida course name
     */
    public String getFloridaCourseName()
    {
        return FloridaCourseName;
    }
    
    /**
     * Gets the year level of the course.
     * @return Year level
     */
    public int getYearLevel()
    {
        return yearLevel;
    }
    
    /**
     * Compares one course's FIU course name to another's.
     * @param that The course this course is being compared to
     * @return 1 if this course name comes after that, -1 if this course name 
     * comes before that, or 0 if this course name is the same as that course name
     */
    @Override
    public int compareTo(Object that) 
    {
        Course a = (Course)that;
        return this.FIUCourseName.compareTo(a.FIUCourseName);
    }
    
    /**
     * Returns the course information as a string.
     * @return FIU course name, credits, Florida course name, pre-requisites,
     * and year level as a string
     */
    @Override
    public String toString()
    {
        String req = "";
        for (int i = 0; i < preRequisites.size(); i++) // Iterates prerequisite array
        {
            req += preRequisites.get(i) + " ";
        }
        
        return "FIU Course Name: " + FIUCourseName + "\nCredits: " + credits + 
                "\nFlorida Course Name: " + FloridaCourseName + 
                "\nPre-requisites: " + req + "\nYear Level: " + yearLevel ;
    }
}
