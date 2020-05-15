/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    // instance variables
    private ArrayList<Card> defaultDeck = new ArrayList<Card>();
    private String[] suits = {"Heart", "Club", "Diamond", "Spade"};

    public Deck(){
        for (int j = 0; j < suits.length; j++) {
            String j_value = suits[j];
            for (int i = 2; i < 14; i++) {
                defaultDeck.add(new Card(j_value, i));
            }
        }
    }

    // initializers
    public Deck(int decksize){
        for (int i = 2; i < decksize + 1; i++) {  // we need +1 to iterate including decksize
            for (int j = 0; j < suits.length; j++) {  // loop statements so that we don't get all of one suit
                String j_value = suits[j];
                defaultDeck.add(new Card(j_value, i));
            }
        }
    }

    // mutator
    public void shuffle(){
        Collections.shuffle(defaultDeck);
    }

    public Card deal() {
        Card temp = defaultDeck.get(0);  // we can't use [] because it's not python :(
        defaultDeck.remove(0);
        return temp;
    }

    // accessor - toString
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Card i : defaultDeck){
            str.append(i.toString()).append("\n");
        }
        return str.toString();
    }

    // tester
    public static void main(String[] args) {
        Deck d1 = new Deck();
        Deck d2 = new Deck(10);  // no faces

        d2.shuffle();
        System.out.println(d2.toString());
        System.out.println(d2.deal().toString());

    }

}
