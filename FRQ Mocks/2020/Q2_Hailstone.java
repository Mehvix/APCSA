/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q2_Hailstone {
    public static int hailStoneLength(int n) {
        int cnt = 1;
        while (n != 1){
            if (n % 2 == 0){  // even
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
//            System.out.println(cnt + " " + n);
            cnt ++;
        }
        return cnt;
    }

    public static boolean isLongSeq(int n){
        return hailStoneLength(n) > n;
    }

    /*propLong runs isLongSeq on each value 1 through n (inclusive), keeping count of
     how many times it gets true. Then it returns that count over n, making sure to cast
     double to either count or n
     */
    public static double propLong(int n){
        int cnt = 0;
        for (int i = 1; i < n + 1; i++) {
            if(isLongSeq(i)){
                cnt ++;
            }
        }
        return (double)cnt / n;
    }

    public static void main(String[] args) {
        System.out.println(propLong(10));
    }
}
