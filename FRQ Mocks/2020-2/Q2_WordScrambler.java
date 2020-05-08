/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Arrays;

public class Q2_WordScrambler {
    private String[] scrambledWords;

    public Q2_WordScrambler(String[] wordArr){
        scrambledWords = mixedWords(wordArr);
    }



    // private String
    public static String[] mixedWords(String[] wordArr) {
        int n = wordArr.length;
        String[] newArr = new String[n];

        for (int i = 0; i < n; i += 2) {
            String s1 = wordArr[i];
            String s2 = wordArr[i+1];
            newArr[i] = recombine(s1, s2);
            newArr[i+1] = recombine(s2, s1);
        }

        return newArr;
    }

    // private String
    public static String recombine(String word1, String word2){
        return word1.substring(0, word1.length()/2) +
                word2.substring(word2.length()/2, word2.length());
    }

    /*B
     * The method checkValidLength would be a private, return  a boolean, and take 2 Strings.
     * It would use the recombine method, using the 2 strings it was given as arguments as args
     * for recombine. With what the recombine method returned it would store the length of the
     * string it got back (recombineReturnString.size()), and if word1.size() was greater than
     * it OR the word2.size() was greater than it than it would return true; otherwise, it would
     * return false
     */
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mixedWords(new String[]{"apple", "pear", "this", "cat"})));
    }
}
