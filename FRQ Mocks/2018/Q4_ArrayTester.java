/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q4_ArrayTester {
    public static int[] getColumn(int[][] arr2D, int c){
        int row_len = arr2D.length;
        // int col_len = arr2D[0].length;
        int[] result = new int[row_len];

        for (int i = 0; i < row_len; i++){
            result[i] = arr2D[i][c];
        }
        return result;
    }

    public static boolean isLatin(int[][] square) {
        int row_len = square.length;
        int col_len = square[0].length;
        int[] firstrow = new int[row_len];
        int value;
        if (row_len == col_len){
            for (int i = 0; i < row_len; i++) {
                value = square[0][i];
                if (!Arrays.asList(firstrow).contains(value)) {
                    firstrow[i] = value;
                } else {
                    return false;
                }
            }
            for (int i = 0; i < row_len; i++){
                value = square[i][0];
                if (!Arrays.asList(firstrow).contains(value)){
                    return false;
                }
            }
            for (int i = 0; i < row_len; i++){
                value = square[0][i];
                if (!Arrays.asList(firstrow).contains(value)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
