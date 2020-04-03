/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q4_Position {
    public Q4_Position(int r, int c) {

    }

    public static Q4_Position findPosition(int num, int[][] intArr) {
        int rows = intArr.length;
        int cols = intArr[0].length;

        for (int i = 0; i < rows; i++){
            int[] i_val = intArr[i];
            for (int j = 0; j < cols; j++) {
                int j_val = intArr[i][j];  // Correction: Accidentally had j_val as just j
                if (num == j_val) {
                    return new Q4_Position(i, j);
                }
            }
        }
        return null;
    }

    public static Q4_Position[][] getSuccessorArray(int num, int[][] intArr) {
        int rows = intArr.length;
        int cols = intArr[0].length;
        Q4_Position[][] succ = new Q4_Position[rows][cols];

        for (int i = 0; i < rows; i++){
            int[] i_val = intArr[i];
            for (int j = 0; j < cols; j++) {
                int j_val = intArr[i][j];
                if (num == j_val) {
                    succ[i][j] = findPosition(j_val + 1, intArr);  // Correction: Forgot +1 after j_val
                }
            }
        }
        return succ;
    }
}

