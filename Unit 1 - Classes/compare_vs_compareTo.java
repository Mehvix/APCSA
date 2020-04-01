/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/13/20
 * Purpose: Learn the difference between the compare and compareTo classes
 */


public class compare_vs_compareTo {
    /* compare:
        - static
        - takes 2 primitive data types
        - returns a primitive data type

      compareTo:
        - not static
        - takes 1 reference data type
        - returns a reference data type
     */

    public static void main(String[] args) {
        //set up primitive data types
        int num1 = 5, num2 = 7;
        boolean boo1 = true, boo2 = false;

        //set up reference objects
        String str1 = "msg1", str2 = "msg2";
        Integer numObj = new Integer(num1);
        Boolean booObj = new Boolean(boo1);

        System.out.println("Using int values, compare: " + Integer.compare(num1, num2));
        System.out.println("Using int values, compareTo: " + numObj.compareTo(num2));
    }
}
