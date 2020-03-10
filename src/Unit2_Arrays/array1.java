/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/28/20
 * Purpose: Messing around with arrays + understanding interactions
 */

package Unit2_Arrays;

import java.util.Arrays;

public class array1 {
    public static String convert(int[] arg) {
        return Arrays.toString(arg);

        /* OR
        String output = "[";
        for (int number: arg){
            output += number + " ";
        }
        return output + "]";
         */
    }


    private static void increment(int[] arg) {
        for(int i = 0; i < arg.length; i++){
            arg[i] ++;
        }
        System.out.println(convert(arg));
    }

    private static void increment(int arg) {
        System.out.println(1 + arg);
    }

    private static int smallest(int[] arg) {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arg.length; i++){
            if (arg[i] < smallest){
                smallest = arg[i];
            }
        }
        return smallest;
    }

    private static int largest(int[] arg) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arg.length; i++){
            if (arg[i] > largest){
                largest = arg[i];
            }
        }
        return largest;
    }

    private static Boolean repeat(int[] arg) {
        // linear time -- o(3n)
        int max = Math.abs(largest(arg));  // has to be abs because of negative numbers
        int min = Math.abs(smallest(arg));
        System.out.println(min + " " + max);
        int[] count_lst = new int[min + max + 1];  // initializes to list of 0's

        for(int i = 0; i < arg.length; i++) {  // starting at 0 (first item in list)
            int value = arg[i];  // gets item in list
            count_lst[value+min] += 1;  // adds to list count
            if (count_lst[value+min] > 1) {  // if there are multiple values of that num
                return false;
            }
        }
        return true;
        /* Only works if sorted!!! (yuck)
        if (arg.length == 1) {
            return true;
        }

        Arrays.sort(arg);
        int previous = arg[0];
        for(int i = 1; i < arg.length; i++){  // starting at 1
            if (arg[i] == previous){  // if repeat
                return true;
            }
            previous = arg[i];
        }
        return false;
         */

    }

    public static void main(String[] args) {
        int[] myObject = {9, 4, 3, 17, 21};
        int[] myObject2 = {4, 9, 3, 17, 21};
        int myPrimative = 9;

        System.out.println(myObject);  // spits out gibberish because it's an object so it's referring to memory
        System.out.println(myPrimative); // prints out 9 (yay!) because it's referring to the actual data
        System.out.println(convert(myObject));  // prints out proper stuff

        System.out.println("1.)");
        // TODO Important for AP Test
        increment(myPrimative);  // DOES NOT save increment because it doesn't reference memory, just the value/data
        increment(myObject);  // DOES save the increment because it's referencing the memory
        increment(myObject2);  // DOES save the increment because it's referencing the memory
        System.out.println(smallest(myObject));

        System.out.println("2.)");
        System.out.println(Arrays.equals(myObject, myObject2));
        Arrays.sort(myObject);
        Arrays.sort(myObject2);
        System.out.println(convert(myObject) + convert(myObject2));
        System.out.println(myObject.equals(myObject2));  // this DOESN'T work
        System.out.println(Arrays.equals(myObject, myObject2));

        System.out.println("3.)");
        int[] myObjectNoRepeats = {-1, 7, 3, 9};
        int[] myObjectRepeats = {2, -3, 4, 4};
        System.out.println(repeat(myObjectNoRepeats));
        System.out.println(repeat(myObjectRepeats));
    }
}
