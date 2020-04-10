/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.ArrayList;
import java.util.List;

public class Card {
    // Should these be private?
    private String suit;
    private int value;
    private char face;  // J Q K

    private final int value_default = 2;
    private final String suit_default = "Heart";
    private final char face_default = 0;

    public Card(String s, int v){
        suit = s;
        value = v;
        updateFace();  // face depends on value
    }
    public Card(String s){
            suit = s;
            value = value_default;
            face = face_default;
    }
    public Card(int v){
            suit = suit_default;
            value = v;
            updateFace();
    }
    public Card(){
            suit = suit_default;
            value = value_default;
            face = face_default;
    }

    // accessor
    public String getSuit() {return suit;};
    public int getValue() {return value;};
    public char getFace() {return face;};

    // mutator
    private void updateFace(){
        if (value == 11) {
            face = 'J';
        } else if (value == 12) {
            face = 'Q';
        } else if (value == 13) {
            face = 'K';
        } else {
            face = 0;
        }
    }

    public void setSuit(String s) {suit = s;}
    public void setValue(int i) {value = i; updateFace();}
    // face depends on value so we shouldn't (in this scenario) let the user update it

    // toString
    public String toString(){
        if (face != 0){
            String name = "";
            if (face == 'J') name = "Jack";
            else if (face == 'Q') name = "Queen";
            else if (face == 'K') name = "King";
            return name + " of " + suit + "s";
        } else {
            return value + " of " + suit + "s";
        }
    }

    // add
    public int add(Card testCard){
        return testCard.getValue() + this.value;
    }

    // equal
    public boolean equals(Card testCard){
        return this.suit.equals(testCard.getSuit()) && this.face == testCard.getFace() && this.value == testCard.getValue();
    }

    public static void main(String[] args) {

        Card c1 = new Card("Heart", 12);
        Card c2 = new Card("Club", 3);
        System.out.println(c1.toString());
    }
}
