package com.mgm.blackJack.models;

public class Card {

    //fields - class attributes
    private String suit;
    private String value;
    private boolean isFaceUp;

    //constructor: allows us to create instances if this class
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit() {
// only return the suit if the card is face up
        if (isFaceUp) {
            return suit;
        } else {
            return "#";
        }
    }

    public String getValue() {
        if (isFaceUp) {
            return value;
        } else {
            return "#";
        }
    }

    public int getPointValue() {
        if (isFaceUp) {

            switch(value){
                case "J","Q","K":
                    return 10;
                case "A":
                    return 11;
                default:
                    return Integer.parseInt(value);
            }
        } else {
            return -0;
        }
    }

    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip() {
        isFaceUp = !isFaceUp;
    }

    @Override
    public String toString() {
        return  value + " " + suit;
    }
}


