/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;

public class StringCoder {
    private String masterString;

    public StringCoder(String master){
        masterString = master;
    }

    public String decodeString(ArrayList<StringPart> parts){
        String str = "";

        for (StringPart part : parts) {
            str += (masterString.substring(part.getStart(), part.getStart() + part.getLength()));
        }

        return str;
    }

    private StringPart findPart(String str){
        return new StringPart(1,4);
    }

    public ArrayList<StringPart> encodeString(String word){
        ArrayList<StringPart> arr = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            arr.add(findPart(word.substring(i, i+1)));
        }

        return arr;
    }

}
