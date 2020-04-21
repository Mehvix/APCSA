/*
 * Programmer: Max Vogel
 * Hour: Third
 * Date: X/X/20
 * Purpose: X
 */

import java.util.Scanner;

public class twentyOne {
    private int count;
    private Deck gameDeck = new Deck();  // inits deck w 52 cards


    public twentyOne(){
        gameDeck.shuffle();
        count = 0;
    }

    public static String getValidMove() {
        Scanner in = new Scanner(System.in);
        String value;
        value = in.next().toUpperCase();
        if (!value.equals("HIT") && !value.equals("STAY")) {
            System.out.println("Please enter either \"Hit\" or \"Stay\"");
            return getValidMove();
        } else {
            return value;
        }
    }


    private void addCount(int value) {
        count += value;
    }

    public Deck getGameDeck(){
        return gameDeck;
    }

    public int getCount(){
        return count;
    }

    public String twentyOneCardToString(Card card){
        if (card.getFace() != 0){
            return ("The card comes " + card.getFace() + " ("  + card.getValue() + ") of " + card.getSuit());
        } else {
            return ("The card comes " + card.getValue() + " of " + card.getSuit());
        }
    }

    public void dealerGoes(){
        int dealerCount = 0;
        System.out.println("Dealer is going...");
        while ((dealerCount < this.getCount()) && (dealerCount < 21)){
            Card dealtCard = this.getGameDeck().deal();
            System.out.println(this.twentyOneCardToString(dealtCard) + " for a dealer total of " + (dealerCount + dealtCard.getValue()));
            dealerCount += dealtCard.getValue();

        }

        if (dealerCount > 21){
            System.out.println("Dealer's " + dealerCount + " is greater than 21. You win!");
        }
         else if(dealerCount >= this.getCount()){
            System.out.println("Dealer's " + dealerCount + " is greater than or equal to " + this.getCount() + ". You loose! :(");
        } else {
            System.out.println("Dealer's " + dealerCount + " is less than " + this.getCount() + ". You win!");
        }
         System.exit(0);
    }

    public static void main(String[] args) {
        twentyOne game = new twentyOne();

        while (game.getCount() < 21){
            System.out.println("Would you like to \"Hit\" or \"Stay\"?");
            String choice = getValidMove();
            if (choice.equals("HIT")){
                Card dealtCard = game.getGameDeck().deal();
                System.out.println(game.twentyOneCardToString(dealtCard));
                game.addCount(dealtCard.getValue());
            } else {  // stay
                game.dealerGoes();
            }
            System.out.println("Your count is " + game.getCount());
        }
        if (game.getCount() == 21){
            game.dealerGoes();
        } else {
            System.out.println("You went over 21! You loose :(");
        }
    }
}
