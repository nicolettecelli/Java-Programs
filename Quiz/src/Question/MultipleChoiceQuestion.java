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

import java.util.ArrayList;

/**
 * A class to create a question with multiple choices.
 * @author 4174075
 */
public class MultipleChoiceQuestion extends Question
{
    private ArrayList<String> choices ;
    
    /**
     * Creates a blank multiple choice question.
     */
    public MultipleChoiceQuestion()
    {
        choices = new ArrayList<String>() ;
    }
    
    /**
     * Creates possible answer choices for the question.
     * @param choice The text of a possible answer
     * @param correct Indicates whether the choice is correct or not
     */
    public void addChoice(String choice, boolean correct)
    {
        choices.add(choice) ;
        
        if (correct)
        {
            String choiceString = "" + choices.size() ;
            setAnswer(choiceString) ;
        }
    }
    
    /**
     * Checks how many points a correct answer will be given.
     * @param userResponse The user's answer
     * @return The amount of points
     */
    public double checkQuestion(String userResponse)
    {
        double points = 0 ;
        
        if (super.checkAnswer(userResponse))
        {
            points += 1 ; // 1 point if the user answers correctly
        }
        
        return points ;
    }
    
    /**
     * Displays the question text and all the possible answer choices.
     */
    @Override
    public void display()
    {
        super.display() ;
        
        System.out.println("(Enter the number of the correct answer.)") ;
        for (int i = 0; i < choices.size(); i++)
        {
            int choiceNumber = i + 1 ;
            System.out.println(choiceNumber + ": " + choices.get(i)) ;
        }
    }
}
