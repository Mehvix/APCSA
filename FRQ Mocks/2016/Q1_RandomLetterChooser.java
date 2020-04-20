/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q1_RandomLetterChooser extends Q1_RandomStringChooser{
    public Q1_RandomLetterChooser(String str){
        super(str.split(""));
    }  //  correction: this should be getSingleLetters instead of .split("")

    /*public static String[] getSingleLetters(String str){
        //not shown
    }*/

    public static void main(String[] args) {
        Q1_RandomLetterChooser letterChooser = new Q1_RandomLetterChooser("cat");
        for (int k = 0; k < 4; k++) {
            System.out.print(letterChooser.getNext());
        }
    }
}
