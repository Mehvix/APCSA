/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/24/20
 * Purpose: tester for Rational.java
 */

package Unit1_Classes;

public class Rational_Tester {
    public static void main(String[] args) {
        Rational frac1 = new Rational(1,2);
        Rational frac2 = new Rational(3,4);
        Rational frac3 = new Rational(3,6);

        System.out.println(frac1.toString());
        System.out.println(frac2.toString());
        System.out.println(frac3.toString());

        System.out.println("---");

        frac1 = frac1.add(frac2);
        System.out.println(frac1.toString());

        frac1.reduce();
        System.out.println(frac1.toString());

        frac1 = frac1.subtract(frac2);
        System.out.println(frac1.toString());

        System.out.println("---");

        System.out.println(frac1.toString());
        System.out.println(frac3.toString());
        System.out.println(frac3.equals(frac1));
        System.out.println(frac1.equals(frac3));

    }
}
