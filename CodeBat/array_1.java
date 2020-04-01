/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class array_1 {
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6 || nums[nums.length-1] == 6) {
            return true;
        }
        return false;
    }
    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1){
            if (nums[0] == nums[nums.length-1]){
                return true;
            }
        }
        return false;
    }
    public int[] makePi() {
        int[] pi = {3,1,4};
        return pi;
    }
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
            return true;
        return false;
    }
    public int[] front11(int[] a, int[] b) {

        if (a.length != 0){
            if (b.length != 0){
                int[] combo = {a[0], b[0]};
                return combo;
            }
            int[] combo = {a[0]};
            return combo;
        }
        if (b.length != 0){
            int[] combo = {b[0]};
            return combo;
        }
        int[] combo = new int[0];
        return combo;
    }

}
