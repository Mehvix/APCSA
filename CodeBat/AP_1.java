/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AP_1 {
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            int score1 = scores[i];
            int score2 = scores[i+1];

            if (score1 > score2){
                return false;
            }

        }
        return true;
    }

    public boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length-1; i++) {
            int score1 = scores[i];
            int score2 = scores[i+1];

            if (score1 == 100 & score2 == 100){
                return true;
            }

        }
        return false;
    }

    public boolean scoresClump(int[] scores) {
        for (int i = 1; i < scores.length-1; i++) {
            int score1 = scores[i-1];
            int score2 = scores[i+1];

            if (score2 - score1 <= 2){
                return true;
            }

        }
        return false;
    }

    public int scoresAverage(int[] scores) {
        int av1 = 0;
        int av2 = 0;

        for (int i = 0; i < scores.length/2; i++) {
            int score = scores[i];
            av1 += score;
        }

        for (int i = scores.length/2; i < scores.length; i++) {
            int score = scores[i];
            av2 += score;
        }

        return Math.max(av1, av2)/(scores.length/2);
    }

    public int wordsCount(String[] words, int len) {
        int cnt = 0;
        for (String word : words) {
            if (word.length() == len) cnt++;
        }
        return cnt;
    }

    public String[] wordsFront(String[] words, int n) {
        String[] fin = new String[n];

        for (int i = 0; i < n; i++) {
            String s = words[i];
            fin[i] = s;
        }

        return fin;
    }

    public List wordsWithoutList(String[] words, int len) {
        List<String> arr = new ArrayList<>();
        for (String word : words) {
            if (word.length() != len) arr.add(word);
        }
        return arr;
    }

    public boolean hasOne(int n) {
        // method 1
//        for (char c : String.valueOf(n).toCharArray()) {
//            if (c == '1') return true;
//        }
//        return false;

        // method 2
        while(n != 0) {
            if(n % 10 == 1) return true;
            n /= 10;
        }

        return false;
    }

    public boolean dividesSelf(int n) {
        int temp = n;
        while(temp != 0) {
            int c = temp%10;
            if (c == 0 || n % c != 0) return false;
            temp /=10;
        }
        return true;
    }

    public int[] copyEvens(int[] nums, int count) {
        int[] arr = new int[count];
        int cnt = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                arr[cnt] = num;
                cnt++;
            }
            if (cnt == count) break;
        }
        return arr;
    }

    public int[] copyEndy(int[] nums, int count) {
        int[] arr = new int[count];
        int cnt = 0;

        for (int num : nums) {
            if ((0 <= num && 10 >= num) || (90 <= num && 100 >= num)){
                arr[cnt] = num;
                cnt ++;
            }
            if (cnt == count) break;
        }

        return arr;
    }

    public int matchUp(String[] a, String[] b) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            String sA = a[i];
            String sB = b[i];

            if (sA.length() != 0 && sB.length() != 0){
                if (sA.charAt(0) == sB.charAt(0)) cnt ++;
            }
        }
        return cnt;
    }

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < key.length; i++) {
            String sKey = key[i];
            String sAns = answers[i];

            if (sAns.equals(sKey)) score += 4;
            else if (!sAns.equals("?")) score -= 1;
        }

        return score;
    }

    public String[] wordsWithout(String[] words, String target) {
        ArrayList<String> arr = new ArrayList<>();

        for (String word : words) {
            if (!word.equals(target)) arr.add(word);
        }
        return arr.toArray(new String[0]);
    }

    public int scoresSpecial(int[] a, int[] b) {
        int maxA = 0;
        int maxB = 0;

        for (int i : a) {
            if (i % 10 == 0 && i > maxA) maxA = i;
        }
        for (int i : b) {
            if (i % 10 == 0 && i > maxB) maxB = i;
        }

        return maxA+maxB;
    }

    public int sumHeights(int[] heights, int start, int end) {
        int cnt = 0;
        for (int i = start; i < end; i++) {
            int height1 = heights[i];
            int height2 = heights[i+1];
            cnt += Math.abs(height2 - height1);
        }
        return cnt;
    }

    public int sumHeights2(int[] heights, int start, int end) {
        int cnt = 0;
        for (int i = start; i < end; i++) {
            int height1 = heights[i];
            int height2 = heights[i+1];
            int diff = (height2 - height1);
            if (diff > 0){
                cnt += diff*2;
            } else {
                cnt -= diff;
            }
        }
        return cnt;
    }

    public int bigHeights(int[] heights, int start, int end) {
        int cnt = 0;
        for (int i = start; i < end; i++) {
            int height1 = heights[i];
            int height2 = heights[i+1];
            int diff = Math.abs(height2 - height1);
            if (diff >= 5){
                cnt += 1;
            }
        }
        return cnt;
    }

    public int userCompare(String aName, int aId, String bName, int bId) {
        int diff = aName.compareTo(bName);
        if (diff < 0) return -1;
        else if (diff > 0) return 1;
        else if (aId < bId) return -1;
        else if (aId > bId) return 1;
        return 0;
    }

    public String[] mergeTwo(String[] a, String[] b, int n) {
        String[] ans = new String[n];
        int pointA = 0;
        int pointB = 0;

        for (int i = 0; i < n;  i++){
            int diff = a[pointA].compareTo(b[pointB]);

            if (diff == 0){
                ans[i] = a[pointA];
                pointA ++;
                pointB ++;
            }
            else if (diff < 0){
                ans[i] = a[pointA];
                pointA ++;
            } else {
                ans[i] = b[pointB];
                pointB ++;
            }
        }
        return ans;
    }

    public static int commonTwo(String[] a, String[] b) {
        int pointA = 0;
        int pointB = 0;
        int cnt = 0;
        StringBuilder cache = new StringBuilder();
        while(true){
            int diff = a[pointA].compareTo(b[pointB]);
            if (diff == 0){
                if (!cache.toString().contains(a[pointA])) {
                    cnt++;
                }
                if (pointA == a.length - 1 && pointB == b.length - 1) break;
                cache.append(a[pointA]);
                if (a.length - 1 > pointA) pointA++;
                if (b.length - 1 > pointB) pointB++;
            }
            else if (diff < 0){
                if (pointA == a.length-1 && pointB == b.length-1) break;
                if(a.length - 1 > pointA) pointA ++;
                else pointB ++;
            } else {
                if (pointA == a.length-1 && pointB == b.length-1) break;
                if(b.length - 1 > pointB) pointB ++;
                else pointA ++;
            }
        }
        return cnt;
    }
}
