package com.example.kieran.blackjack;

import com.example.kieran.blackjack.enums.Rank;
import com.example.kieran.blackjack.enums.SuitType;

/**
 * Created by Kieran on 24/06/2017.
 */

public class Card {
    private final SuitType suit;
    private final Rank rank;

    public Card(SuitType suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getRankValue(){
        return rank.cardValue();
    }




}
