/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Trail {
    private int[] markers;

    public boolean isLevelTrailSegment(int start, int end){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = start; i < Math.min(end, markers.length); i++) {
            int val = markers[i];
            if (val > max){
                max = val;
            }
            if (val < min){
                min = val;
            }
        }
        return (max - min) <= 10;
    }

    public boolean isDifficult(){
        int cnt = 0;
        for (int i = 0; i < markers.length-1; i++) {
            int i1 = markers[i];
            int i2 = markers[i+1];

            if (Math.abs(i1-i2) >= 30){
                cnt ++;
                if (cnt >=3){
                    return true;
                }
            }
        }
        return false;
    }
}
