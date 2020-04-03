/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q3_Phase {
    private String currentPhase;

    public Q3_Phase(String p) {
        currentPhase = p;
    }

    public int findNthOccurance(String str, int n) {
        int count = 0;
        for (int i = 0; i < currentPhase.length() - str.length(); i++){
            if (currentPhase.substring(i, i + str.length()).equals(str)){
                count ++;
                if (count == n){
                    return i;
                }
            }
        }
        return -1;
    }

    public void replaceNthOccurance(String str, int n, String repl) {
        int index_start = findNthOccurance(str, n);
        int index_end = index_start + str.length();

        if (index_start != -1) {  // Correction: needs condition to check if n value exists
            currentPhase = currentPhase.substring(0, index_start) + repl + currentPhase.substring(index_end, currentPhase.length());
        }
    }

    public int findLastOccurance(String str) {
        int i = 1;
        int last = findNthOccurance(str, i);

        while (last != -1) {
            i ++;
            last = findNthOccurance(str, i);  // Correction: remember that loop condition is only met when last line inside loop is finished
        }
        return findNthOccurance(str, i - 1);
    }

    public String toString(){
        return currentPhase;
    }

    public static void main(String[] args) {
        Q3_Phase a = new Q3_Phase("A cat ate late.");
        // System.out.println(a.findNthOccurance("at", 1));
        a.replaceNthOccurance("at", 1, "rane");
        System.out.println(a.toString());
        // System.out.println(a.findLastOccurance("at"));
    }
}