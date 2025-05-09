package com.mgm.blackJack.models;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
         cards = new ArrayList<>();
    }

    public void Hands(Card card) {
        cards.add(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for(Card card: cards){
            card.flip(); // turn the card over to see the value
            value += card.getPointValue();
            card.flip(); // hide the card again
        }
        return value;
    }

    public void addCard(Card card){
        cards.add(card);

    }

    @Override
    public String toString() {
        return cards.toString();
    }
}

