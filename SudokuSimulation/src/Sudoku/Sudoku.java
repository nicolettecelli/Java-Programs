package Sudoku;
///////////////////////////////////////////////////////////////////////////////                  
// Title:            Universal Sudoku Puzzle
// Files:            Sudoku.java, SudokuSimulation.java
// Semester:         COP3337 Fall 2015
//
// Author:           4174075
// Lecturer's Name:  Maria Charters
//
// Description of Program’s Functionality: Creates a Sudoku puzzle and checks if
//                                         it is valid
///////////////////////////////////////////////////////////////////////////////

/**
 * A class to create and validate a Sudoku puzzle.
 * @author 4174075
 */
public class Sudoku {

    /**
     * Creates a Sudoku puzzle based on user input.
     * @param s String of numbers to input into the puzzle's rows
     * @return Sudoku array based on the inputted string
     */
    public String[][] makeSudoku(String s) {
        int SIZE = 9;
        int k = 0;
        String[][] x = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                x[i][j] = s.substring(k, k + 1);
                k++;
            }
        }
        return x;
    }

    /**
     * Formats the Sudoku array for printing.
     * @param x Previously created Sudoku array based on the inputted string
     * @return A formatted string of the Sudoku puzzle
     */
    public String getPrintableSudoku(String[][] x) {
        int SIZE = 9;
        String temp = "";
        for (int i = 0; i < SIZE; i++) {
            if ((i == 3) || (i == 6)) {
                temp = temp + "=================\n";
            }
            for (int j = 0; j < SIZE; j++) {
                if ((j == 3) || (j == 6)) {
                    temp = temp + " || ";
                }
                temp = temp + x[i][j];
            }
            temp = temp + "\n";
        }
        return temp;
    }

    /**
     * Determines whether a Sudoku puzzle is valid.
     * @param x Previously created Sudoku array based on the inputted string
     * @return True if the puzzle's rows are Latin, columns are Latin, and 
     * subsquares are valid, or false otherwise
     */
    public boolean isValidSudoku(String[][] x) {
        return rowsAreLatin(x) && colsAreLatin(x) && goodSubsquares(x);
    }

    /**
     * Determines whether every row has one of each number from 1 to 9.
     * @param x Previously created Sudoku array based on the inputted string
     * @return True if every row is Latin, or false otherwise
     */
    public boolean rowsAreLatin(String[][] x) {
        boolean test = true;
        for (int i = 0; i < x.length; i++) {
            test = test && rowIsLatin(x,i);
        }
        return test;
    }

    /**
     * Determines whether a single row has one of each number from 1 to 9.
     * @param x Previously created Sudoku array based on the inputted string
     * @param i Row index number 
     * @return True if the row is Latin, or false otherwise
     */
    public boolean rowIsLatin(String[][] x, int i) {
        boolean test = true ;
        boolean[] found = new boolean[9] ;
        
            for (int j = 0; j < x.length; j++)
            {
                found[Integer.parseInt(x[i][j]) - 1] = true ;
            }
            for (int j = 0; j < x[i].length; j++)
            {
                if (!found[j])
                {
                    return false ;
                }
            }   
        return true ;
    }

    /**
     * Determines whether every column has one of each number from 1 to 9.
     * @param x Previously created Sudoku array based on the inputted string
     * @return True if every column is Latin, or false otherwise
     */
    public boolean colsAreLatin(String[][] x) {
        boolean test = true ;
        
        for (int j = 0; j < x.length; j++) 
        {
            test = test && colIsLatin(x, j) ;
        }
        return test ;
    }

    /**
     * Determines whether a single column has one of each number from 1 to 9.
     * @param x Previously created Sudoku array based on the inputted string
     * @param j Column index number
     * @return True if the column is Latin, or false otherwise
     */
    public boolean colIsLatin(String[][] x, int j) {
        boolean[] found = new boolean[9] ;
        
            for (int i = 0; i < x.length; i++)
            {
                found[Integer.parseInt(x[i][j]) - 1] = true ;
            }
            for (int i = 0; i < x.length; i++)
            {
                if (!found[i])
                {
                    return false ;
                }
            }
        return true ;
    }

    /**
     * Determines whether every 3x3 subsquare has one of each number from 1 to 9.
     * @param x Previously created Sudoku array based on the inputted string
     * @return True if every subsquare is valid, or false otherwise
     */
    public boolean goodSubsquares(String[][] x) {
        boolean test = true ;
        
        for (int i = 0; i < x.length; i++)
        {
            for (int j = 0; j < x.length; j++)
            {
                test = test && goodSubsquare(x, i, j) ;
            }
        }
        return test ;
    }

    /**
     * Determines whether a single 3x3 subsquare has one of each number from 1 to 9.
     * @param x Previously created Sudoku array based on the inputted string
     * @param i Row index number
     * @param j Column index number
     * @return True if the subsquare is valid, or false otherwise
     */
    public boolean goodSubsquare(String[][] x, int i, int j) {
        boolean[] found = new boolean[9] ;
        
        for (int r = (i / 3) * 3; r < ((i / 3) * 3) + 3; r++)
        {
            for (int c = (j / 3) * 3; c < ((j / 3) * 3) + 3; c++)
            {
                found[Integer.parseInt(x[r][c]) - 1] = true ;
            }
        }
        for (int k = 0; k < x.length; k++)
        {
            if (!found[k])
            {
                return false ;
            }
        }
        return true ;
    }
}
