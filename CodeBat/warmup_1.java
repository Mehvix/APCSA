/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class warmup_1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation){
            return true;
        }
        return false;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || ((aSmile == false) && (bSmile == false))){
            return true;
        }
        return false;
    }
    public int sumDouble(int a, int b) {
        if (a==b){
            return 2*(a+b);
        }
        return a + b;
    }
    public int diff21(int n) {
        int diff = Math.abs(21-n);

        if(n > 21){
            return 2*diff;
        }
        return diff;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking && ((7>hour) || (20<hour))){
            return true;
        }
        return false;
    }
    public boolean makes10(int a, int b) {
        if(a+b==10 || (a == 10 || b == 10)){
            return true;
        }
        return false;
    }
    public boolean nearHundred(int n) {
        if (Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10){
            return true;
        }
        return false;
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if(!negative){
            if ((a < 0 && b > 0) || (b < 0 && a > 0)){
                return true;
            }
        } else {
            if (a < 0 && b < 0) {
                return true;
            }
        }
        return false;

    }
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return ("not " + str);
    }
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1, str.length());

    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return  str.substring(str.length()-1, str.length()) + mid + str.substring(0,1);
    }
    public String front3(String str) {
        String front;
        String fin = "";
        if (str.length() <= 3) {
            front = str;
        } else {
            front = str.substring(0,3);
        }

        return front + front + front;
    }
    public String backAround(String str) {
        return str.substring(str.length()-1, str.length()) + str + str.substring(str.length()-1, str.length());
    }
    public boolean or35(int n) {
        if (n > 0 && (n % 5 == 0||n % 3 == 0)){
            return true;
        }
        return false;
    }
    public String front22(String str) {
        String word;
        if (str.length() <= 2){
            word = str;
        } else {
            word = str.substring(0, 2);
        }
        return word + str + word;
    }
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
        if (str.substring(0, 2).equals("hi")){
            return true;
        }
        return false;
    }
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)){
            return true;
        }
        return false;
    }
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)){
            return true;
        }
        return false;
    }
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            return true;
        }
        return false;
    }
    public boolean loneTeen(int a, int b) {
        if (((a >= 13 && a <= 19) && !(b >= 13 && b <= 19))
                || ((b >= 13 && b <= 19) && !(a >= 13 && a <= 19))){
            return true;
        }
        return false;
    }
    public String delDel(String str) {
        if(str.length() <= 3) return str;
        if(str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4, str.length());
        } else {
            return str;
        }

    }
    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        if (str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }
    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }
    public int intMax(int a, int b, int c) {
        return Math.max(Math.max(b,c), Math.max(a,b));
    }
    public int close10(int a, int b) {
        int adif = (Math.abs(10-a));
        int bdif = (Math.abs(10-b));

        if (adif < bdif){
            return a;
        }
        if (adif > bdif){
            return b;
        }
        return 0;
    }
    public boolean in3050(int a, int b) {
        if((a >= 30 && a <= 40) && (b >= 30 && b <= 40)){
            return true;
        }
        if((a >= 40 && a <= 50) && (b >= 40 && b <= 50)){
            return true;
        }
        return false;
    }
    public int max1020(int a, int b) {
        if (a >= 10 &&  a <= 20){
            if (b >= 10 && b <= 20){
                return Math.max(a,b);
            } else {
                return a;
            }
        }
        if (b >= 10 && b <= 20){
            return b;
        }
        return 0;
    }
    public boolean stringE(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e'){
                count += 1;
            }
        }
        if((count >= 1) && (count <= 3)){
            return true;
        }
        return false;
    }
    public boolean lastDigit(int a, int b) {
        return(a%10 == b%10);
    }
    public String endUp(String str) {
        if (str.length() < 3){
            return str.toUpperCase();
        } else {
            String fin = str.substring(str.length()-3,str.length()).toUpperCase();
            return str.substring(0, str.length()-3) + fin;
        }
    }
    public String everyNth(String str, int n) {
        String fin = "";
        for(int i=0; i < str.length(); i += n){
            fin += str.charAt(i);
        }
        return fin;
    }

}
