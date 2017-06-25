package com.example.kieran.blackjack.enums;

import static android.R.attr.value;

/**
 * Created by Kieran on 24/06/2017.
 */

public enum Rank {
    ACE(11),
    KING(10),
    QUEEN(10),
    JACK(10),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    DUECE(2);

    private int card;

    Rank(int card){
        this.card = card;
    }

    public int cardValue(){
        return this.card;
    }

}