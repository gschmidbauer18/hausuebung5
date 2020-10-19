package net.htlgrieskirchen.pos3.sudoku;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/* Please enter here an answer to task four between the tags:
 * <answerTask4>
 *    Hier sollte die Antwort auf die Aufgabe 4 stehen.
 * </answerTask4>
 */
public class SudokuSolver implements ISodukoSolver {
    public SudokuSolver() {
        //initialize if necessary
    }

    @Override
    public final int[][] readSudoku(File file) {
        try {
            int[][] iarr=Files.lines(file.toPath())
                    .map(l -> l.split(";"))
                    .map(s -> new int[]{Integer.parseInt(s[0])
                            ,Integer.parseInt(s[1])
                            ,Integer.parseInt(s[2])
                            ,Integer.parseInt(s[3])
                            ,Integer.parseInt(s[4])
                            ,Integer.parseInt(s[5])
                            ,Integer.parseInt(s[6])
                            ,Integer.parseInt(s[7])
                            ,Integer.parseInt(s[8])})
                    .toArray(s -> new int[9][9]);
            return iarr;
        } catch (IOException ex) {
            Logger.getLogger(SudokuSolver.class.getName()).log(Level.SEVERE, null, ex);
        }
        //nur wenn error
        return null;
    }

    @Override
    public boolean checkSudoku(int[][] rawSudoku) {
        // implement this method
        return false; // delete this line!
    }

    @Override
    public int[][] solveSudoku(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }
    
    @Override
    public int[][] solveSudokuParallel(int[][] rawSudoku) {
        // implement this method
        return new int[0][0]; // delete this line!
    }

    // add helper methods here if necessary
}
