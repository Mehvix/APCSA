/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words){
        allPairs = new ArrayList<WordPair>();  // Correction: Need to initialize instance variable(s)
        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String word2 = words[j];
                allPairs.add(new WordPair(word1, word2));
            }
        }
    }

    public int numMatches(){
        int cnt = 0;
        for (WordPair wordPair : allPairs) {
            if (wordPair.getFirst().equals(wordPair.getSecond())) {
                cnt++;
            }
        }
        return cnt;
    }
}
