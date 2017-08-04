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
 * A class to create a multiple choice question with more than one answer.
 * @author 4174075
 */
public class MultipleAnswersQuestion extends MultipleChoiceQuestion
{
    private double questions ;
    private ArrayList<String> choices1 ;
    private ArrayList<String> correctAnswers ;
    
    /**
     * Creates a blank multiple answer question.
     */
    public MultipleAnswersQuestion()
    {
        MultipleChoiceQuestion multipleAnswers = new MultipleChoiceQuestion();
        questions = 0 ;
        choices1 = new ArrayList<String>() ;
        correctAnswers = new ArrayList<String>() ;
    }
    
    /**
     * Creates possible answer choices for the question.
     * @param choice1 The text of a possible answer
     * @param correct1 Indicates whether the choice is correct or not
     */
    public void addChoice(String choice1, boolean correct1)
    {
        super.addChoice(choice1, correct1) ;
        
        choices1.add(choice1) ;
        if (correct1)
        {
            String choiceString1 = "" + choices1.size() ;
            correctAnswers.add(choiceString1) ; // Used to compare to user input
            questions += 1 ; // Number of correct answers
        }  
    }
    
    /**
     * Checks how many points a correct answer will be given.
     * @param userAnswers An array list of the user's answers
     * @return The amount of points
     */
    public double checkQuestion(ArrayList<String> userAnswers)
    {
        double points = 0 ;
        double partialCorrect = 1 / questions ; // 1 divided by the amount of correct answers
        
        for (int i = 0; i < userAnswers.size(); i++)
        {
            for (int j = 0; j < correctAnswers.size(); j++)
            {
                if (userAnswers.get(i).equals(correctAnswers.get(j)))
                {
                    points += partialCorrect ;
                }
            }
            
            if (points == 1 && userAnswers.size() > correctAnswers.size())
            {
                points -= partialCorrect ;
            }
        }
        
        return points ;
    }
    
    /**
     * Displays the question text and all possible answer choices.
     */
    public void display()
    {
        super.display() ;
        
        System.out.println("(Enter the numbers of ALL correct answers "
                + "with no spaces. Multiple answers are possible.)") ;
    }
}
