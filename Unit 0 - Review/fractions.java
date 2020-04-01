/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/3/20
 * Purpose: Handle fraction operations by splitting them into numerators and denominators
 */


import java.util.Scanner;
import java.util.Random;

public class fractions {
    public static void main(String[] args){
        /*
        int[] frac1 = {1,2};
        int[] frac2 = new int[2];
        frac2[0] = 3;
        frac2[1] = 4;
        print_fraction(frac1);
        print_fraction(frac2);
        user_frac();
         */
        int[] f1 = user_frac();
        int[] f2 = user_frac();

        print_fraction(operations(f1, f2, "+"));
        print_fraction(operations(f1, f2, "-"));
        print_fraction(operations(f1, f2, "*"));
        print_fraction(operations(f1, f2, "/"));
    }
    public static int gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b);
    }
    public static void print_fraction(int[] frac) {
        int numerator = frac[0];
        int denominator = frac[1];

        if (numerator == denominator) {
            System.out.println(1);
        } else if(denominator == 0) {
            System.out.println("ERROR: Cannot devide by zero (denominator is zero)");
        } else if(numerator == 0) {
            System.out.println(0);
        } else {
            int gcm = gcm(numerator, denominator);
            int newnum = (numerator / gcm);
            int newdenom = (denominator / gcm);
            System.out.println(newnum + "/" + newdenom);
        }
    }
    public static int get_int() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }
    public static int[] user_frac() {
        int[] frac = new int[2];
        System.out.println("What numerator would you like?");
        frac[0] = get_int();

        // frac[1] = 0;  // Turns out we don't actually need to define this as zero because it's initialized as zero
        while(frac[1] == 0) {
            System.out.println("What denominator would you like? (Any number except 0)");
            frac[1] = get_int();
        }
        return frac;
    }

    public static int[] random_frac() {
        Random rand = new Random();
        int[] frac = new int[2];

        frac[0] = rand.nextInt(10); // Obtain a number between [0 - 10].
        frac[1] = rand.nextInt(9) + 1; // Obtain a number between [1 - 10].
        return frac;
    }

    public static int[] operations(int[] frac1, int[] frac2, String operation) {
        int[] final_frac = new int[2];
        int frac1_num = frac1[0];
        int frac1_denom = frac1[1];
        int frac2_num = frac2[0];
        int frac2_denom = frac2[1];

        int cd, frac1_newnum, frac2_newnum, final_num, final_denom;
        switch(operation) {
            case "+":
                /*
                1. Common denom
                2. Add numerators
                3. Simplify(?)
                4. Assign to final_frac
                 */
                cd = frac1_denom * frac2_denom;
                frac1_newnum = frac1_num * frac2_denom;
                frac2_newnum = frac2_num * frac1_denom;

                final_num = frac1_newnum + frac2_newnum;
                final_denom = cd;

                final_frac[0] = final_num;
                final_frac[1] = final_denom;
                break;
            case "-":
                cd = frac1_denom * frac2_denom;
                frac1_newnum = frac1_num * frac2_denom;
                frac2_newnum = frac2_num * frac1_denom;

                final_num = frac1_newnum - frac2_newnum;
                final_denom = cd;

                final_frac[0] = final_num;
                final_frac[1] = final_denom;
                break;
            case "*":
                final_frac[0] = frac1_num * frac2_num;
                final_frac[1] = frac1_denom * frac2_denom;
                break;
            case "/":
                final_frac[0] = frac1_num * frac2_denom;
                final_frac[1] = frac1_denom * frac2_num;
                break;
        }

        return final_frac;
    }
}
