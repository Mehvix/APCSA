/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;

public class functional_2 {

    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();
        for (Integer num : nums) {
            if (num >= 0) temp.add(num);
        }
        return temp;
    }

    public List<Integer> no9(List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 10 != 9) temp.add(num);
        }
        return temp;
    }

    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();
        for (Integer num : nums) {
            if (num > 19 || num < 13) temp.add(num);
        }
        return temp;
    }

    public List<String> noZ(List<String> strings) {
        List<String> temp = new ArrayList<>();
        for (String s : strings) {
            boolean hasZ = false;
            for (char x : s.toCharArray()) {
                if (x == 'z') {
                    hasZ = true;
                    break;
                }
            }
            if (!hasZ){
                temp.add(s);
            }
        }
        return temp;
    }

    public List<String> noLong(List<String> strings) {
        List<String> temp = new ArrayList<>();

        for (String s : strings) {
            if (s.length() < 4) temp.add(s);
        }

        return temp;
    }

    public List<String> no34(List<String> strings) {
        List<String> temp = new ArrayList<>();

        for (String s : strings) {
            if (s.length() != 3 && s.length() != 4) temp.add(s);
        }

        return temp;
    }

    public List<String> noYY(List<String> strings) {
        List<String> temp = new ArrayList<>();

        for (String s : strings) {
            boolean doubleY = false;
            for (int i = 1; i < s.length(); i++) {
                char c1 = s.charAt(i - 1);
                char c2 = s.charAt(i);
                if (c1 == 'y' && c2 == 'y') {
                    doubleY = true;
                    break;
                }
            }
            if (!doubleY) {
                if ((s.length() == 0 || s.charAt(s.length() - 1) != 'y')) {
                    temp.add(s + "y");
                }
            }
        }
        return temp;
    }

    public List<Integer> two2(List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();

        for (Integer i : nums) {
            int result = i * 2;
            if (result % 10 != 2) temp.add(result);
        }
        return temp;
    }

    public List<Integer> square56(List<Integer> nums) {
        List<Integer> temp = new ArrayList<>();

        for (Integer i : nums) {
            int result = i * i;
            if (result % 10 != 6 && result % 10 != 5) temp.add(result+10);
        }
        return temp;
    }


}
