/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q3_Crossword {
    /** Each element is a Square object with a color (black or white) and a number.
     *  puzzle[r][c] represents the square in row r,column c.    *
     *  There is at least one row in the puzzle.
     */
    private Q3_Square[][] puzzle;


    /** Constructs a crossword puzzle grid.
     *  Precondition: There is at least one row in blackSquares.
     *  Postcondition:
     *  - The crossword puzzle grid has the same dimensions as blackSquares.
     *  - The Square object at row r,column c in the crossword puzzle grid is black
     *  if and only if blackSquares[r][c] is true.
     *  - The squares in the puzzle are labeled according to the crossword labeling rule.
     */
    public Q3_Crossword(boolean[][] blackSquares) {
         int cnt = 0;  // Correction: Should have started from 1 (-1)
         puzzle = new Q3_Square[blackSquares.length][blackSquares[0].length];

        for (int r = 0; r < blackSquares.length; r++) {
            for (int c = 0; c < blackSquares[0].length; c++) {
                boolean blackSquare = blackSquares[r][c];
                if (!blackSquare && toBeLabeled(r, c, blackSquares)){
                    puzzle[r][c] = new Q3_Square(false, cnt);
                    cnt ++;
                } else {
                    puzzle[r][c] = new Q3_Square(blackSquare, 0);
                }
            }
        }
     }


     /** Returns true if the square at row r,column c should be labeled with a positive number;
      *  false otherwise.
      *  The square at row r,column c is black if and only if blackSquares[r][c] is true.
      *  Precondition: r and c are valid indexes in blackSquares.
      */
     private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
         if (
                 blackSquares[r][c] == false &&  // if white
                 (r - 1 < 0 || blackSquares[r - 1][c] == true) &&  // valid range & no white above
                 (c - 1 < 0 || blackSquares[r][c - 1] == true)  // valid range & no white to left
         ) {
            return true;
         }
         return false;
     }


    // There may be instance variables, constructors, and methods that are not shown
}
