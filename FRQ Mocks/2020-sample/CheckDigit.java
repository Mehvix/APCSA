/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class CheckDigit {
    public static int getCheck(int num){
        return 2;
    }

    public static boolean isValid(int numWithCheckDigit){
        int n = String.valueOf(numWithCheckDigit).length();
/*        int check = Integer.parseInt(
                String.valueOf(
                        String.valueOf(numWithCheckDigit).
                                charAt(n -1)
                )
        );*/
        int check = numWithCheckDigit % 10;
        int num = Integer.parseInt(String.valueOf(numWithCheckDigit).substring(0, n-1));

        int checkValue = getCheck(num);
        return checkValue == check;
    }

    public static void main(String[] args) {
        isValid(1592);
    }

    /*B
    * - They could add a new private instance variable int called count
    * - count would be increased by 1 in isValid if the getCheck of the number wasn't equal to the check
    * - count could be called by a new accessor public int getCount() that would return count*/
}
