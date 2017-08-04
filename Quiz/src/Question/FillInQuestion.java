package Question;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Quiz
// Files:            Question.java, MultipleChoiceQuestion.java, 
//                   MultipleAnswersQuestion.java, FillInQuestion.java, 
//                   Quiz.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates a superclass and subclasses 
//             of question types to use in a quiz driver.
///////////////////////////////////////////////////////////////////////////////

/**
 * A class to create a fill-in-the-blank question.
 * @author 4174075
 */
public class FillInQuestion extends Question
{
    /**
     * Creates a blank fill-in-the-blank question.
     */
    public FillInQuestion() 
    {
        
    }
    
    /**
     * Checks how many points a correct answer will be given.
     * @param userInput The user's answer
     * @return The amount of points
     */
    public double checkQuestion(String userInput)
    {
        double points = 0 ;
        
        if (super.checkAnswer(userInput))
        {
            points += 1 ;
        }
        
        return points ;
    }
}
