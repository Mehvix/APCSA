/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class NumberCube {
    public int toss(){
        return 2;
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int[] arr = new int[numTosses];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = cube.toss();
        }

        return arr;
    }

    public static int getLongestRun(int[] values){
        int max = Integer.MIN_VALUE;
        int startI = -1;
        int maxI = -1;
        int cnt = 0;
        for (int i = 0; i < values.length - 1; i++) {
            int value1 = values[i];
            int value2 = values[i+1];

            if (value1 == value2){
                cnt ++;
                if (i == 0 || values[i - 1] != value1){
                    startI = i;
                }
            } else {
                if (cnt > max){
                    max = cnt;
                    maxI = startI;
                }
                cnt = 0;
            }
        }

        return maxI;
    }

    public static void main(String[] args) {
        System.out.println(getLongestRun(new int[]{1,1,1,1,1, 2, 4, 4, 3, 6, 8, 8,  8,  8,  8, 8, 6 ,6 ,6, 6, 2, 2}));
    }
}
