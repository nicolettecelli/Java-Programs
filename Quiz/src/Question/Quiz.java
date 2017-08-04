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
import java.util.Scanner;

/**
 *
 * @author 4174075
 */
public class Quiz 
{
    static ArrayList<Question> quiz = new ArrayList<Question>() ;
    
    public static void main(String args[])
    {
        Quiz.createQuestions() ;   
        Quiz.displayAndCheckQuestions() ;
        Quiz.summarizeResults() ;
    }
    
    /**
     * Creates the questions for the quiz.
     */
    public static void createQuestions()
    {
        MultipleChoiceQuestion one = new MultipleChoiceQuestion() ;
        one.setText("Which state is not located on the Mexican-American "
                + "border?") ;
        one.addChoice("Texas", false) ;
        one.addChoice("New Mexico", false) ;
        one.addChoice("Louisiana", true) ;
        one.addChoice("Arizona", false) ;
        
        MultipleChoiceQuestion two = new MultipleChoiceQuestion() ;
        two.setText("The koala bear is native to what country?") ;
        two.addChoice("Brazil", false) ;
        two.addChoice("Australia", true) ;
        two.addChoice("Russia", false) ;
        two.addChoice("India", false) ;
        
        MultipleChoiceQuestion three = new MultipleChoiceQuestion() ;
        three.setText("What is the abbreviation of deoxyribonucleic acid?") ;
        three.addChoice("DA", false) ;
        three.addChoice("RNA", false) ;
        three.addChoice("DNA", true) ;
        three.addChoice("DRNA", false) ;
        
        MultipleAnswersQuestion four = new MultipleAnswersQuestion() ;
        four.setText("Which of the following countries are located in Europe?");
        four.addChoice("Serbia", true) ;
        four.addChoice("Morocco", false) ;
        four.addChoice("Turkey", true) ;
        four.addChoice("Egypt", false) ;
        
        MultipleAnswersQuestion five = new MultipleAnswersQuestion() ;
        five.setText("Which of the following animals are native to Florida?") ;
        five.addChoice("Otters", true) ;
        five.addChoice("Black bears", true) ;
        five.addChoice("Turkeys", true) ;
        five.addChoice("Crocodiles", true) ;
        
        MultipleAnswersQuestion six = new MultipleAnswersQuestion() ;
        six.setText("Which of the following scientists are German?") ;
        six.addChoice("Nikola Tesla", false) ;
        six.addChoice("Niels Henrik David Bohr", false) ;
        six.addChoice("Albert Einstein", true) ;
        six.addChoice("Max Planck", true) ;
        
        FillInQuestion seven = new FillInQuestion() ;
        seven.setText("_____ is the capital of Italy.") ;
        seven.setAnswer("Rome") ;
        
        FillInQuestion eight = new FillInQuestion() ;
        eight.setText("_____ painted The Last Supper in the 15th century.") ;
        eight.setAnswer("Leonardo da Vinci") ;
        
        FillInQuestion nine = new FillInQuestion() ;
        nine.setText("An octopus has _____ arms.") ;
        nine.setAnswer("Eight") ;
        
        FillInQuestion ten = new FillInQuestion() ;
        ten.setText("The first president of the United States was _____.") ;
        ten.setAnswer("George Washington") ;
        
        quiz.add(one) ;
        quiz.add(two) ;
        quiz.add(three) ;
        quiz.add(four) ;
        quiz.add(five) ;
        quiz.add(six) ;
        quiz.add(seven) ;
        quiz.add(eight) ;
        quiz.add(nine) ;
        quiz.add(ten) ;  
    }
    
    static int numberCorrect = 0 ; 
    static double pointsEarned = 0 ;
    
    /**
     * Displays the questions and choices and determines whether the user's answer is correct.
     */
    public static void displayAndCheckQuestions()
    {
        Scanner in = new Scanner(System.in) ;
        
        for (int i = 0; i < quiz.size(); i++)
        {
            Question q = quiz.get(i) ;
            q.display() ;        
            System.out.println("Your answer: ") ;
        
            String input = in.nextLine() ;
        
            if (q.checkAnswer(input))
            {
                numberCorrect++ ;
                System.out.println("Correct\n") ;
            }
            else
            {
                System.out.println("Wrong\n") ;
            }
            
            pointsEarned += q.checkQuestion(input) ;
        }
    }
    
    /**
     * Displays how many questions the user answered correctly and how many
     * points were earned.
     */
    public static void summarizeResults()
    {
        System.out.println("You answered " + numberCorrect + " questions "
                + "out of 10 correctly. You received " + pointsEarned 
                + " out of 10 points.") ;
    }
}
