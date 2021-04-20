import java.util.Arrays;

public class flipflop {
    public static void main(String[] args) {
        int size = 3;
        boolean[][] arr = new boolean[size][size];
        boolean val = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = val;
                val = !val;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        // Alternatively
        // System.out.println(Arrays.deepToString(arr));
    }
}
