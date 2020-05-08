/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class CookieOrder {
    private String variety;
    private int numBoxes;

    public CookieOrder(String varietyGiven, int numBoxesGiven){
        variety = varietyGiven;
        numBoxes = numBoxesGiven;
    }

    public int getNumBoxes() {
        return numBoxes;
    }

    public String getVariety() {
        return variety;
    }
}
