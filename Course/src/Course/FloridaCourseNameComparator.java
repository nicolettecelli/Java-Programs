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

import java.util.Comparator;

/**
 * A class that compares Florida Course Names.
 * @author 4174075 
 */
public class FloridaCourseNameComparator implements Comparator<Course>
{
    /**
     * Compares one course's Florida course name to another's.
     * @param a One course being compared
     * @param b Another course being compared to
     * @return 1 if a's course name comes after b's, -1 if a's course name
     * comes before b's, or 0 if they are the same
     */
    @Override
    public int compare(Course a, Course b) 
    {
        return a.getFloridaCourseName().compareTo(b.getFloridaCourseName());
    }
}
