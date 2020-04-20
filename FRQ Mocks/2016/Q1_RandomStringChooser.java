/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;

public class Q1_RandomStringChooser {
    private ArrayList<String> words = new ArrayList<>();

    public Q1_RandomStringChooser(String[] strArr){
        for (String i : strArr){
            words.add(i);
        }
    }

    public String getNext(){

        if (words.size() == 0){
            return "NULL";
        }
        Random gen = new Random();
        int i = gen.nextInt(words.size());
        String val = words.get(i);
        words.remove(val);
        return val;
    }

    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        Q1_RandomStringChooser sChoooser = new Q1_RandomStringChooser(wordArray);
        for (int k = 0; k < 6; k++) {
            System.out.print(sChoooser.getNext() + " ");
        }
    }
}
