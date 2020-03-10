/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: 3/4/20
 * Purpose: Intro to sorting
 */

package Unit2_Arrays;

import java.util.*;

public class searchSort {
    private static int[] generateDeck(int deck_size) {
        int[] deck = new int[deck_size];

        for(int i = 0; i < deck_size; i++) {  // make the list not just zeros
            deck[i] += i;
        }
        // shuffleDeck(deck);
        return deck;
    }

    private static void shuffleDeck(int[] deck){  // this can be void because int[] list is a reference data
        Random randint = new Random();  // Random number generator
        for (int i=0; i<deck.length; i++) {
            int randomPosition = randint.nextInt(deck.length);
            int temp = deck[i];
            deck[i] = deck[randomPosition];
            deck[randomPosition] = temp;
        }
    }

    private static int find(int target, int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            if (deck[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static int binary_search(int target, int[] deck) {
        int index_value = -1;
        int index = (deck.length + 1)/(2);
        int change = index;
        while (index_value != target){
            index_value = deck[index];
            System.out.println("Looking at " + index_value + "...");
            if (index_value == target){
                System.out.println("FOUND!");
                return index;
            }
            else {
                change = (change+1)/2;
                if (index_value > target) {
                    index -= change;
                    System.out.println("Too high!");
                } else {
                    index += change;
                    System.out.println("Too low!");
                }
            }
            if (change == 1){
                index_value = deck[index];
                System.out.println("Looking at " + index_value + "...");
                if (index_value == target) {
                    System.out.println("FOUND!");
                } else {
                    System.out.println("Item is not in list!");
                    return -1;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        final int CARDS = 8000;
        int[] deck = generateDeck(CARDS);
        System.out.println(array1.convert(deck));

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("What card (0-9) would you like to look for?");
        int target = sc.nextInt();

        System.out.println(find(target, deck));
         */

        System.out.println(binary_search(445, deck));
    }
}
