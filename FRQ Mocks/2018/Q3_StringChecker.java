/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q3_StringChecker {
    public class CodeWordChecker implements StringChecker {
            // Correction: Variables should be initialized, but not defined here
            private int MIN = 6;
            private int MAX = 20;
            private String BAD = new String();

        public CodeWordChecker(int min, int max, String bad){
                MIN = min;
                MAX = max;
                BAD = bad;
            }
        public CodeWordChecker(String bad){
                // Correction: Variables should be initialized, but not defined here
                MIN = 6;
                MAX = 20;
                BAD = bad;
            }

        public boolean isValid(String str) {
            if (str.length() <= MIN || str.length() >= MAX || str.contains(BAD)){
                return false;
            }
            return true;
        }
    }
}
