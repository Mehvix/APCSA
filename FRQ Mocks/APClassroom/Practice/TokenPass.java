/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Random;

public class TokenPass {
    private int[] board;
    private int currentPlayer;

    public TokenPass(int playerCount){
        Random rnd = new Random();

        board = new int[playerCount];
        currentPlayer = rnd.nextInt(playerCount);

        for (int i = 0; i < board.length; i++) {
            board[i] = rnd.nextInt(10) + 1;  // between 0(inclusive) argument(n), exclusive
        }

    }


    public void distributeCurrentPlayerTokens(){
        int dist = board[currentPlayer];
        board[currentPlayer] = 0;
        int i = 0;  // Correction: Should be `currentPlayer+1` instead

        while (dist >= 0){
            board[(currentPlayer+i)%board.length] ++;
            i++;
            dist --;
        }
    }
}
