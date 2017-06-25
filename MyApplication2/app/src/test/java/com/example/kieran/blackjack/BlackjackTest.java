package com.example.kieran.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kieran on 25/06/2017.
 */

public class BlackjackTest {


    Deck deck;
    Hand hand;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
    }

    @Test
    public void testFullDeck() {
        deck.populate();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void testCardValue(){
        assertEquals(12, card.getRankValue());
    }


}