/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */
import java.util.*;


public class Q4_StringFormatter {
    public static int totalLetters(List<String> wordList) {
        int cnt = 0;
        for (String s : wordList) {
            cnt += s.length();
        }
        return cnt;
    }

    public static int basicGapWidth(List<String> wordList, int formattedLen){
        return (formattedLen - totalLetters(wordList)) / (wordList.size() - 1);
    }
    public static int leftoverSpaces(List<String> wordList, int formattedLen){
        return (formattedLen - (totalLetters(wordList) + basicGapWidth(wordList, formattedLen) * (wordList.size() - 1)));
    }

    public static String format(List<String> wordList, int formattedLen){
        String str = "";
        int extraSpaces = leftoverSpaces(wordList, formattedLen);
        for (int i = 0; i < wordList.size(); i++) {  // in retrospect, it's probably better to do ..size()-1 instead of having the check later
            String s = wordList.get(i);
            str += (s);

            if (i != wordList.size() - 1) {  // we don't add spaces on the last word
                for (int j = 0; j < basicGapWidth(wordList, formattedLen); j++) {
                    str += (" ");
                }
                if (extraSpaces != 0){
                    extraSpaces --;
                    str += (" ");
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(totalLetters(Arrays.asList("BEACH", "BALL")));
        System.out.println(basicGapWidth(Arrays.asList("BEACH", "BALL"), 20));
        System.out.println(leftoverSpaces(Arrays.asList("BEACH", "BALL"), 20));
        System.out.println(format(Arrays.asList("BEACH", "BALL"), 20));
    }
}
