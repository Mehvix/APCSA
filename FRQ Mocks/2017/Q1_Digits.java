/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;

public class Q1_Digits {
    private ArrayList<Integer> digitList;

    public Q1_Digits(int num) {
        digitList = new ArrayList<Integer>();  // Correction: Constructors are the only place to initialize variables
        for (char i : String.valueOf(num).toCharArray()) {
            digitList.add(Character.getNumericValue(i));
        }
    }

    public boolean isStrictlyIncreasing(){
        int last = -1;
        for (int i : digitList) {
            if (last < i) {
                last = i;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Q1_Digits a = new Q1_Digits(1234);
        System.out.println(a.isStrictlyIncreasing());
    }

}
