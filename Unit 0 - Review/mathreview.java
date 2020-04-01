/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 1/22/20
 * Purpose: Review math operations
 */

public class mathreview                                 {
    public static void main(String[] args)              {
        /* String is a reference data type */
        String word = "The time is 6:15 PM"             ;

        /* int, double, and char are all primitive data types */
        int num = -9                                    ;
        double decimal = 2.83594                        ;
        /* chatAt is a static method from the String class */
        char letter = word.charAt(3)                    ;  // [space]

        /* substring is a static method from the String class */
        String part = word.substring(12, 16)            ;  // 1:55
        /* length is a static method from the String class */
        int num_chars = word.length()                   ;
        String string_hour = word.substring(12, 13)     ;

        /* parseInt is a static method from the Integer class */
        int hour = Integer.parseInt(string_hour)        ;  // 1

        /* Math references back to the class (Math), where string references back to the object (e.g. word) */
        double positive = Math.abs(num)                 ;  // 3
        double root = Math.sqrt(positive)               ;  // sqrt(3)
        double square = Math.pow(positive, 2)           ;  // 9

        if (1 == 1)                                     {
            System.out.println(num_chars)               ;}
                                                        }}
