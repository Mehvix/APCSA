/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Scanner;

public class tictaktoe {
    /*
    Outline
    1.) init board
    -.) loop
        2.) display board
        3.) ask player move
            4.) check if move is winning
        5.) check if board is full
    6.) print outcome (win/lose/tie)
     */
    private static char[][] board = createBoard();
    private static int winner = -1;
    private static int nextPlayer = 1;

    public static void main(String[] args) {

        while (true) {
            displayBoard();

            if (boardFull()) {
                System.out.println("Game is a draw! Board is full");
                System.exit(0);
            }
            move(nextPlayer);

        }
    }

    private static char[][] createBoard() {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = '-';
            }
        }
        return board;
    }

    private static void displayBoard() {
        System.out.print(" ");
        for (int row = 0; row < board.length; row++) {
            System.out.print(" " + row);
        }
        System.out.println("");
        for (int row = 0; row < board.length; row++) {
            System.out.print(row + " ");
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println("");
        }
    }

    private static void move(int playerGoing) {
        // player 1 is X
        // player 2 is 0
        System.out.println("Player " + playerGoing + ": What row would you like to go to?");
        int row = getValidPosition();
        System.out.println("Player " + playerGoing + ": What col would you like to go to?");
        int col = getValidPosition();

        if (board[row][col] == '-') {
            if (playerGoing == 1) {
                board[row][col] = 'X';
                nextPlayer = 2;
            } else {
                board[row][col] = 'O';
                nextPlayer = 1;
            }
            hasWinner(row, col);
        } else {
            System.out.println("Invalid Position: That location isn't empty");
            move(playerGoing);
        }
    }

    public static int getValidPosition() {
        Scanner in = new Scanner(System.in);
        int value;
        if (in.hasNextInt()) {  // if user inputs an int
            value = in.nextInt();
            if (value > 2 || value < 0) {  // if input falls outside range of min-max
                System.out.println("Please enter your choice as an integer between 0 and 3");
                return getValidPosition();
            }
            return value;
        } else {  // if user DOESN'T input an int
            System.out.println("Please enter your choice as an integer between 0 and 3");
            return getValidPosition();
        }
    }

    private static void hasWinner(int x, int y) {
        char player_marker = board[x][y];

        for (int i = 0; i < 3; i++) {  //check col
            if (board[x][i] != player_marker)
                break;
            if (i == 3 - 1) {
                announceWinner(player_marker);
            }
        }

        //check row
        for (int i = 0; i < 3; i++) {
            if (board[i][y] != player_marker)
                break;
            if (i == 3 - 1) {
                announceWinner(player_marker);
            }
        }

        if (x == y) { //check diag
            for (int i = 0; i < 3; i++) {
                if (board[i][i] != player_marker)
                    break;
                if (i == 3 - 1) {
                    announceWinner(player_marker);
                }
            }
        }

        if (x + y == 3 - 1) {  //check anti diag
            for (int i = 0; i < 3; i++) {
                if (board[i][(3 - 1) - i] != player_marker)
                    break;
                if (i == 3 - 1) {
                    announceWinner(player_marker);
                }
            }
        }
    }

    private static void announceWinner(char player) {
        displayBoard();
        int playerAsInt = 2;
        if (player == 'X') {
            playerAsInt = 1;
        }
        System.out.println("Player " + playerAsInt + " won!");
        System.exit(0);
    }

    private static boolean boardFull() {
        int count = 0;

        for (char[] row : board) {
            for (char value : row) {
                if (value == 'O' || value == 'X') {
                    count++;
                }
            }
        }
        return (count == 9);
    }
}
