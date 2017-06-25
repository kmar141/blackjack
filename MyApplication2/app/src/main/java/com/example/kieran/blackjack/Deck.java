package com.example.kieran.blackjack;

import com.example.kieran.blackjack.enums.Rank;
import com.example.kieran.blackjack.enums.SuitType;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by Kieran on 24/06/2017.
 */

public class Deck {


    ArrayList<Card> cards;
    public Deck deck;
    public Card dealCard;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public void populate() {
        for (SuitType suit : SuitType.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public int cardCount() {
        return cards.size();
    }

//    public void shuffle() {
//        return Collections.shuffle(deck);
//    }

    public Card dealCard() {
        return cards.remove(0);
    }








}
