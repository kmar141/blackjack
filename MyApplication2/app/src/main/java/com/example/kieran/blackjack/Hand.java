package com.example.kieran.blackjack;


import java.util.ArrayList;

/**
 * Created by Kieran on 25/06/2017.
 */

public class Hand extends Deck {

    ArrayList<Card> hand;
    Deck deck;


    public void addCard(){
        hand.add(deck.dealCard);
    }



}
