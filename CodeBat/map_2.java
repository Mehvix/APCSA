/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.*;

public class map_2 {
    public Map<String, Integer> word0(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if(!map.containsKey(s)) {
                map.put(s, s.length());
            }
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        HashMap<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length()-1)));
        }
        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        HashMap<String, String> map = new HashMap<>();
        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), map.getOrDefault(String.valueOf(s.charAt(0)), "") + s);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            int cnt = map.getOrDefault(s, 0) + 1;
            if (cnt != 0 && cnt % 2 == 0){
                sb.append(s);
            }
            map.put(s, cnt);
        }
        return sb.toString();
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        HashMap<String, Boolean> mapFinal = new HashMap<>();
        HashMap<String, Integer> mapCount = new HashMap<>();

        for (String s : strings) {
            mapCount.put(s, mapCount.getOrDefault(s, 0) + 1);
            mapFinal.put(s, mapCount.get(s) >= 2);
        }

        return mapFinal;
    }

    public String[] allSwap(String[] strings) {
        HashMap<Character, Integer> map = new HashMap<>();
        String[] arr = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            char x = strings[i].charAt(0);

            if(!map.containsKey(x)){
                map.put(x, i);
                arr[i] = strings[i];
            } else {
                int val = map.get(x);
                map.remove(x);

                arr[i] = arr[val];
                arr[val] = strings[i];
            }
        }
        return arr;
    }

    public String[] firstSwap(String[] strings) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<Character> arrTF = new ArrayList<>();
        String[] arr = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            char x = strings[i].charAt(0);

            if(!map.containsKey(x)){
                if(!arrTF.contains(x)) {
                    map.put(x, i);
                }
                arr[i] = strings[i];

            } else {
                int val = map.get(x);
                map.remove(x);

                arr[i] = arr[val];
                arr[val] = strings[i];

                arrTF.add(x);
            }
        }
        return arr;
    }



}
