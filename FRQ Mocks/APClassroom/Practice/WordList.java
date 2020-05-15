/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList;

    public int numWordsOfLength(int len){
        int cnt = 0;
        for (String s : myList) {
            if (s.length() == len) cnt++;
        }
        return cnt;
    }

    public void removeWordsOfLength(int len){
        ArrayList<String> tmp = new ArrayList<>();
        for (String s : myList) {
            if(s.length() != len) tmp.add(s);
        }
        myList = tmp;
    }
}
