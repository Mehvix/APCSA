/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 1/24/20
 * Purpose: Demonstrate for loops
 */

public class sing {
    private static String happybday(String name) {
        String output = "";
        for (int i = 0; i < 2; i++) {
            output += "Happy Birthday to you\n";
        }
        output += ("Happy Birthday dear " + name + "\n");
        output += ("Happy Birthday to you!");
        return output;
    }
    public static void main(String[] args) {
        System.out.println(happybday("Aidan"));
    }
}
