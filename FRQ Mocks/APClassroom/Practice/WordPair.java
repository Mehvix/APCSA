/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class WordPair {
    private String first;
    private String second;
    public WordPair(String firstWord, String secondWord){
        first = firstWord;
        second = getSecond();
    }

    public String getFirst(){
        return first;
    }
    public String getSecond(){
        return second;
    }
}
