package studentdemo;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public abstract class  Student  {
    
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private ArrayList<Double> grades;
    
    public Student(String anId, String aFirstName, String aMiddleName, String aLastName, ArrayList<Double> aListOfGrades)
    {
        id = anId;
        firstName = aFirstName;
        middleName = aMiddleName;
        lastName = aLastName;
        grades = aListOfGrades;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getMiddleName()
    {
        return middleName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public ArrayList getGrades()
    {
        return grades;
    }
    
    public void setId(String anId)
    {
        id = anId;
    }
    
    public void setFirstName(String aFirstName)
    {
        firstName = aFirstName;
    }
    
    public void setMiddleName(String aMiddleName)
    {
        middleName = aMiddleName;
    }
    
    public void setLastName(String aLastName)
    {
        lastName = aLastName;
    }
    
    public void setGrades(ArrayList aListOfGrades)
    {
        grades = aListOfGrades;
    }
    
    public String toString()
    {
        return id + " " + firstName + " " + middleName + " "+ lastName + " ";
    }
    public abstract double calculateGPA();
   
    
   // public int calculateYearsLeft()
    //{
    //    return 12;
   // }
    }
