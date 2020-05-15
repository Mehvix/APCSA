/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Mountain {
    public static boolean isIncreasing(int[] array, int stop){
        return false;
    }

    public static boolean isDecreasing(int[] array, int start){
        return true;
    }

    public static int getPeakIndex(int[] array){
        for (int i = 1; i < array.length-1; i++) {
            int i1 = array[i-1];
            int i2 = array[i];
            int i3 = array[i+1];
            if (i2 > i1 && i2 < i3) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isMountain(int[] array){
        int peakI = getPeakIndex(array);
        if (peakI == -1) return false;  // Correction: This needed to be added
        else return isIncreasing(array, peakI) && isDecreasing(array, peakI);
    }
}
