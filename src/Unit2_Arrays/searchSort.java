/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 3/4/20
 * Purpose: Intro to sorting
 */

package Unit2_Arrays;

import java.util.*;

public class searchSort {
    public static int[] generateDeck(int deck_size) {
        int[] deck = new int[deck_size];

        for(int i = 0; i < deck_size; i++) {  // make the list not just zeros
            deck[i] += i;
        }
        shuffleDeck(deck);
        return deck;
    }

    public static int[] shuffleDeck(int[] deck){
        Random randint = new Random();  // Random number generator
        for (int i=0; i<deck.length; i++) {
            int randomPosition = randint.nextInt(deck.length);
            int temp = deck[i];
            deck[i] = deck[randomPosition];
            deck[randomPosition] = temp;
        }
        return deck;
    }

    public static void main(String[] args) {
        final int CARDS = 8;
        int[] deck = generateDeck(CARDS);
        System.out.println(array1.convert(deck));

        Scanner sc = new Scanner(System.in);
        System.out.println("What card (0-9) would you like to look for?");
        int target = sc.nextInt();

        System.out.println(find(target, deck));
    }

    public static int find(int target, int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
