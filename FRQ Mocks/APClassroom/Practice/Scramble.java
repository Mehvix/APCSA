/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scramble {
    public static String scrambleWord(String word){
        char[] arr = word.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            char i1 = arr[i-1];
            char i2 = arr[i];
            if(i1 == 'A' && i2 != 'A') {
                arr[i-1] = i2;
                arr[i] = i1;
                i ++;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static List<String> scrambleOrRemove(List<String> wordlist){
        List<String> tmp = new ArrayList<>();
        for (String s : wordlist) {
            if (!scrambleWord(s).equals(s)) {
                tmp.add(scrambleWord(s));
            }
        }
        wordlist = tmp;
        return wordlist;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("TAN");
        arr.add("WHOA");
        arr.add("APPLE");
        arr.add("EGGS");
        System.out.println(scrambleOrRemove(arr).toString());
    }
}
