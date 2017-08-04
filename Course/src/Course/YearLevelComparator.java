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
 * A class to compare Year Levels.
 * @author 4174075
 */
public class YearLevelComparator implements Comparator<Course>
{

    /**
     * Compares one course's year level to another's.
     * @param a One course being compared
     * @param b Another course being compared to
     * @return 1 if a's year level is greater than b's, -1 if a's year level is
     * less than b's, or 0 if they are the same
     */
    @Override
    public int compare(Course a, Course b) 
    {
        if (a.getYearLevel() > b.getYearLevel())
        {
            return 1;
        }
        else if (a.getYearLevel() < b.getYearLevel())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}
