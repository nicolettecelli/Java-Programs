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
 * A class to create a Question.
 * @author 4174075
 */
public abstract class Question
{
    private String text ;
    private String answer ;
    
    /**
     * Creates a blank Question.
     */
    public Question()
    {
        text = "" ;
        answer = "" ;
    }
    
    /**
     * Creates the question text.
     * @param questionText The text of the question
     */
    public void setText(String questionText)
    {
        text = questionText ;
    }
    
    /**
     * Creates the question answer.
     * @param correctResponse The correct answer for the question
     */
    public void setAnswer(String correctResponse)
    {
        answer += correctResponse ;
    }
    
    /**
     * Checks whether the user's answer is right or wrong.
     * @param response The user's answer
     * @return True if the user's answer matches the set answer, or false if
     * it does not match
     */
    public boolean checkAnswer(String response)
    {
        return response.equalsIgnoreCase(answer) ;
    }
    
    /**
     * Checks how many points a correct answer will be given.
     * @param response The user's answer
     * @return The amount of points
     */
    abstract double checkQuestion(String response) ;
    
    /**
     * Displays the question text.
     */
    public void display()
    {
        System.out.println(text) ;
    }
    
}
