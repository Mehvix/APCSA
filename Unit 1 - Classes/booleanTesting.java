/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/11/20
 * Purpose: Learn about the boolean
 */



public class booleanTesting {
    public static void main(String[] args) {
        Boolean b1 = true;
        boolean b2 = false;
        Boolean b3 = Boolean.FALSE;
        Boolean b4 = new Boolean("true");

        String str1 = "true";

        System.out.println(Boolean.compare(b2, b1));
        System.out.println(Boolean.parseBoolean(str1));
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b4.toString());
    }
}
