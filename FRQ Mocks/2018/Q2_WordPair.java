/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q2_WordPair {
    public WordPairList(String[] words){
        for (int i = 0; i < words.length-1; i ++){
            for (int j = i+1; j < words.length; j ++){
                allPairs.append(WordPair(words[i], words[j]));  // Correction: use add, not append AND should be "new WordPair(..."
            }
        }
    }

    public int numMatches(){
        int matches = 0;
        for (int i = 0; i < allPairs.length; i ++){
            WordPair current = allPairs[i];
            if (current.getFirst() == current.getSecond()){  // Correction: comparing strings need .equals, not ==
                matches += 1;
            }
        }
        return matches;
    }
}
