/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 2/24/20
 * Purpose:
 * Write a class that will handle all Rational number operations.  The 'user' should be able to declare a Rational object in the following ways:
a)  Rational frac1 = new Rational();     // the user doesn't know ahead of time what the value of this fraction is
b) Rational frac1 = new Rational(1,2); //frac1 now has a value of 1/2

The user should (at minimum) be able to perform the following operations on their Rational objects:

a) add
b) subtract
c) multiply
d) divide
e) reduce
f) obtain the fraction as a String (call this toString)
g) change/set the value of the numerator, denominator, or entire fraction
h) get the value of the numerator and/or denominator

If you have extra time, create a method that will randomly fill the numerator/denominator (call it random_define), a method that will allow the user to enter a numerator and denominator (call it user_define).

If you have extra time, create a method that will randomly fill the numerator/denominator (call it random_define), a method that will allow the user to enter a numerator and denominator (call it user_define).

**Note:  add, subtract, multiply, and divide should only take 1 parameter!!  Reduce should not take ANY parameters

**Note: there is no need for arrays in this assignment!

** Remember to test all of your methods and constructors!! share it with others so they might test it!
*/

package Unit1_Classes;

public class Rational {
    private int num;
    private int den;

    public static int gcm(int a, int b) {
        return b == 0 ? a : gcm(b, a % b);
    }

    public Rational(int numerator, int denominator){
        num = numerator;
        den = denominator;
    }

    public void add(Rational arg) {
        /*
        1. Common denom
        2. Add numerators
        3. Simplify(?)
        4. Assign to final_frac
         */
        int cd = den * arg.getDen();
        int frac1_newnum = num * arg.getDen();
        int frac2_newnum = arg.getNum() * den;

        num = frac1_newnum + frac2_newnum;
        den = cd;
    }

    public void subtract(Rational arg) {
        int cd = den * arg.getDen();
        int frac1_newnum = num * arg.getDen();
        int frac2_newnum = arg.getNum() * den;

        num = frac1_newnum - frac2_newnum;
        den = cd;
    }

    public void multi(Rational arg) {
        num *= arg.getNum();
        den *= arg.getDen();
    }

    public void divide(Rational arg) {
        num *= arg.getDen();
        den *= arg.getNum();
    }

    public void reduce() {
        int gcm = gcm(num, den);
        num = (num / gcm);
        den = (den / gcm);
    }

    public String toString() {
        return num + "/" + den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return num;
    }
}
