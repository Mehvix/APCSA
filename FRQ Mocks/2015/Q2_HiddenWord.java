/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q2_HiddenWord {
    private static String word;

    public Q2_HiddenWord(String str){
        word = str;
    }

    public String getHint(String str){
        char[] guessChars = str.toCharArray();
        char[] wordChars = word.toCharArray();
        StringBuilder response = new StringBuilder();  // is collegeboard okay w this?
        for (int i = 0; i < wordChars.length; i++) {
            char wordChar = wordChars[i];
            char guessChar = guessChars[i];
            if (guessChar == wordChar){
                response.append(wordChar);
            } else {
                boolean found = false;
                for (char newWordChar : wordChars) {
                    if (guessChar == newWordChar) {
                        response.append("+");
                        found = true;
                        break;
                    }
                }
                if (!found){
                    response.append("*");
                }
            }
        }
        return response.toString();
    }

    public static void main(String[] args) {
        Q2_HiddenWord puzzle = new Q2_HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));
    }
}
