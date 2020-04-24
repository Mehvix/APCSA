/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Q4_Range implements Q4_NumberGroup {
    private int rangeMin;
    private int rangeMax;

    public Q4_Range(int min, int max){
        this.rangeMin = min;
        this.rangeMax = max;
    }

    @Override
    public boolean contains(int num) {
        return (rangeMin <= num && num <= rangeMax);
    }
}
