/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

public class Unit4 {
    public static void longestStreak(String str) {
        char last = 0;
        int count = 1;
        int high = 0;

        for (char i : str.toCharArray()) {
            System.out.println(i);

            if (last == i) {
                count ++;
                high = Math.max(high, count);
            } else {
                last = i;
                count = 1;
            }
        }
        System.out.println(high);
    }

    public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        } else {
            if (round % 2 == 0) {
                return 2;
            }
            return 1;
        }
    }

    /** Plays a simulated game between two players, as described in part (b).
     */
    public void playGame() {
        int p1_coins = startingCoins;
        int p2_coins = startingCoins;
        for (int i = 0; i < maxRounds; i++){
            int p1_move = getPlayer1Move();
            int p2_move = getPlayer2Move(i);
            if (p1_move == p2_move){
                p2_coins ++;
            } else {
                int diff = Math.abs(p1_move - p2_move);
                if (diff == 1){
                    p2_coins ++;
                } else if (diff == 2) {
                    p1_coins += 2;
                }
            }
        }

        if (p1_coins == p2_coins) System.out.println("tie game");
        if (p1_coins > p2_coins) System.out.println("player 1 wins");
        if (p1_coins < p2_coins) System.out.println("player 2 wins");
    }
}
