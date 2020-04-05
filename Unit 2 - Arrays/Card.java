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
            return face + " of " + suit;
        } else {
            return value + " of " + suit;
        }
    }

    // add
    public int add(Card testCard){
        return testCard.getValue() + this.value;
    }

    // equal
    public boolean equals(Card testCard){
        return this.suit.equals(testCard.getSuit()) && this.face == testCard.getFace();
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(new Integer(1));
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        list1.remove(1);
        System.out.println(list1);

    }
}
