/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q1_arrays {
    public static int arraySum(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int[] rowSums(int[][] arr2D) {
        int[] sumArr = new int[arr2D.length];
        for (int i = 0; i < arr2D.length; i++) {
            int[] row = arr2D[i];
            int rowSum = arraySum(row);
            sumArr[i] = rowSum;
        }
        return sumArr;
    }

    public static boolean isDiverse(int[][] arr2D) {
        int[] sumArr = rowSums(arr2D);

        // todo optimize this w hashmap if time
        // this is gonna be o(n^2) and it could be linear, but i'm lazy and this is timed :ppp

        for (int i = 0; i < sumArr.length - 1; i++) {
            int i1 = sumArr[i];
            for (int j = i + 1; j < sumArr.length; j++) {
                int j1 = sumArr[j];
                if (i1 == j1){return false;}
            }
        }
        return true;
    }
}
