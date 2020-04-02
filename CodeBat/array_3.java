/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class array_3 {
    public int maxSpan(int[] nums) {
        if (nums.length != 0){
            int greatest = 0;
            int current_span = 0;
            int val_second = 0;
            int val_first = 0;
            for (int i = 0; i < nums.length; i ++){
                val_first = nums[i];
                for (int j = nums.length-1; j != i; j --){
                    val_second = nums[j];
                    current_span = j-i;
                    if (val_first == val_second){
                        if (current_span > greatest){
                            greatest = current_span;
                            break;
                        }
                    }
                }
            }
            return 1 + greatest;
        }
        return 0;
    }
    public int[] fix34(int[] nums) {
        int[] tmp;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == 3) {
                for (int j = 0; j < nums.length; j ++){
                    if (nums[j] == 4) {
                        if (nums[j-1] != 3) {
                            tmp = nums.clone();
                            tmp[i+1] = nums[j];
                            tmp[j] = nums[i+1];
                            nums = tmp;
                        }
                    }
                }
            }
        }
        return nums;
    }
    public int[] fix45(int[] nums) {
        int[] tmp;
        for (int i = 0; i < nums.length; i ++){
            if (nums[i] == 4) {
                for (int j = 0; j < nums.length; j ++){
                    if (nums[j] == 5) {
                        if (j == 0 || nums[j-1] != 4){  // has to be in this order!
                            tmp = nums.clone();
                            tmp[i+1] = nums[j];
                            tmp[j] = nums[i+1];
                            nums = tmp;
                        }
                    }
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int sumL = 0;
        int sumR = 0;

        for (int i : nums) sumR += i;

        for (int i : nums) {
            sumL += i;
            sumR -= i;
            if (sumL > sumR) return false;
            if (sumL == sumR) return true;
        }
        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int count = 0;
        int location = 0;
        for (int value : inner) {
            for (int j = location; j < outer.length; j++) {
                if (outer[j] == value) {
                    location = j;
                    count += 1;
                    break;
                }
            }
        }
        if (count == inner.length) {
            return true;
        }
        return false;
    }

    public int[] squareUp(int n) {
        int[] arr = new int[n * n];
        int pass = 1, index;
        if(n == 0) { return arr; }
        for(int i = n-1; i < arr.length; i+=n) {
            index = i;
            for(int k = 1; k <= pass; k++) {
                if(k == 0) { break; }
                arr[index] = k;
                index--;
            }
            pass++;
        }
        return arr;
    }


}
