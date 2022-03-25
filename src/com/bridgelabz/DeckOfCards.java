package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {

        String players[][] = new String[4][9];
        Cards obj = new Cards();

        obj.displayDeck();
        obj.assortRandom(players);
        obj.display(players);
    }
}