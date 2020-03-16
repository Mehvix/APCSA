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
        // deck_size ++;  // extends so lst will have range of 0 through N
        int[] deck = new int[deck_size];

        for(int i = 0; i < deck_size; i++) {  // make the list not just zeros
            deck[i] += i;
        }
        shuffleDeck(deck);
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
        int bottom = 0, top = deck.length, middle;
        while (bottom + 1 < deck.length){
            middle = (bottom + top)/2;
            System.out.println("Looking at " + middle + "...");
            if(deck[middle] == target) {System.out.println("FOUND"); return middle;}
            else if(deck[middle] > target) {System.out.println("Too high"); top = middle;}
            else if(deck[middle] < target) {System.out.println("Too low"); bottom = middle;}
        }
        if(deck[deck.length - 1] == target){return (deck.length-1);}  // will never reach max because divide floors
        else {return -1;}
    }

    private static boolean verify_sort(int[] deck) {
        int previous = deck[0];
        for (int i = 1; i < deck.length; i++) {
            if (previous > deck[i]){
                return false;
            }
        }
        return true;
    }

    private static int[] bogo(int[] deck){
        int count = 0;
        while (!verify_sort(deck)){
            shuffleDeck(deck);
            count ++;
        }
        System.out.println("Bogo took " + count);
        return deck;
    }

    private static int[] selection(int[] deck) {
        int smallest, smallIndex, count = 0;
        for(int i = 0; i<deck.length; i++){
            //leftmost is smallest
            smallest = deck[i];
            smallIndex = i;

            //look through rest of lst
            for(int j = i+1; j < deck.length; j ++){
                if(smallest > deck[j]){
                    smallIndex = j;
                    smallest = deck[j];
                }
                count ++;
            }

            deck = swap(deck, i, smallIndex);
        }
        System.out.println("selection took " + count);
        return deck;
    }

    private static int[] insertion(int[] deck) {
        // todo
        return deck;
    }

    private static int[] merge(int[] deck) {
        // todo
        return deck;
    }

    private static int[] bubble(int[] deck) {
        int count = 0;
        for(int i = 0; i < deck.length; i ++){
            for(int j = 1; j < deck.length-i; j++) {
                if(deck[j-1] > deck[j]){
                    deck = swap(deck, j-1, j);
                    count ++;
                }
            }
        }
        System.out.println("bubble took " + count);
        return deck;
    }

    private static int[] bubbleBackwards(int[] deck) {
        int count = 0;
        for(int i = deck.length; i > 0; i --){
            for(int j = 1; j < i; j++) {
                if(deck[j-1] < deck[j]){
                    deck = swap(deck, j-1, j);
                    count ++;
                }
            }
        }
        System.out.println("bubble back took " + count);
        return deck;
    }

    private static int[] swap(int[] deck, int index1, int index2) {
        int[] tmp = deck.clone();  // this way tmp doesn't reference the deck's memory (because int[] a reference var, not a single value)
        tmp[index1] = deck[index2];
        tmp[index2] = deck[index1];
        return tmp;
    }

    public static void main(String[] args) {
        final int CARDS = 4;
        int[] deck = generateDeck(CARDS);

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("What card (0-9) would you like to look for?");
        int target = sc.nextInt();

        System.out.println(find(target, deck));
        System.out.println(binary_search(0, deck));
        System.out.println(array1.convert(swap(deck, 0, 3)));
         */

        System.out.println("---\nBubble\nOriginal: " + array1.convert(deck));
        System.out.println(array1.convert(bubble(deck)));

        System.out.println("---\nBubble Back\nOriginal: " + array1.convert(deck));
        System.out.println(array1.convert(bubbleBackwards(deck)));

        shuffleDeck(deck);
        System.out.println("---\nSelection\nOriginal: " + array1.convert(deck));

        System.out.println(array1.convert(selection(deck)));

        shuffleDeck(deck);
        System.out.println("---\nBogo\nOriginal: " + array1.convert(deck));

        System.out.println(array1.convert(bogo(deck)));
    }
}
