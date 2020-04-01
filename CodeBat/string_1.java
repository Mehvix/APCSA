/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class string_1 {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }
    public String extraEnd(String str) {
        int len = str.length();
        return str.substring(len-2, len) + str.substring(len-2, len) + str.substring(len-2, len);
    }
    public String firstTwo(String str) {
        if (str.length() <= 1){
            return str;
        }
        return str.substring(0,2);
    }
    public String firstHalf(String str) {
        int i = str.length() / 2;
        return str.substring(0, i);
    }
    public String withoutEnd(String str) {
        int len = str.length();
        return str.substring(1, len-1);
    }
    public String comboString(String a, String b) {
        if (a.length() < b.length()){
            return a + b + a;
        } else {
            return b + a + b;
        }

    }

}
