package com.example.kieran.blackjack.enums;

/**
 * Created by Kieran on 24/06/2017.
 */

public enum SuitType {
    SPADES,
    HEARTS,
    DIAMONDS,
    CLUBS;

    private int suit;


    public int getSuit(){
        return this.suit;
    }

}