/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Arrays;

public class SelfDivisor {
    public static boolean isSelfDivisor(int number){
        int tmp = number;

        while(tmp != 0){
            int x = tmp % 10;  // gets right most int
            if (x == 0 || number % x != 0) return false;
            tmp /= 10;  // removes rightmost int
        }
        return true;
    }

    public static int[] firstNumSelfDivisors(int start, int num){
        int[] arr = new int[num];
        int cnt = 0;

        while (cnt != num){
            start ++;
            if (isSelfDivisor(start)) {
                arr[cnt] = start;
                cnt ++;
            }
        }

        return arr;
    }
}
