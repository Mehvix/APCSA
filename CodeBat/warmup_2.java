/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class warmup_2 {
    public String altPairs(String str) {
        String fin = "";

        for(int i = 0; i < str.length(); i += 4) {
            fin += str.substring(i, i + 1);
            if(str.length() > i+1){
                fin += str.substring(i + 1, i + 2);
            } else {
                break;
            }

        }
        return fin;
    }
}
