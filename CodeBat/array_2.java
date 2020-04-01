/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class array_2 {
    public String[] fizzBuzz(int start, int end) {
        String[] lst = new String[end-start];
        String current = "";
        for (int i = start; i < end; i++){
            if (i % 3 == 0 || i % 5 == 0){
                if (i % 3 == 0){
                    current = "Fizz";
                }
                if (i % 5 == 0){
                    current += "Buzz";
                }
            } else {
                current = ""+ i;
            }
            lst[i-start] = current;
            current = "";
        }
        return lst;
    }
}
