package com.mgm.blackJack.models;

public class Player {
    //fields
private String name;
private int age;
private Hand hand;
private int numberOfWins;
private boolean hasCard;

//constructors
    public Player(){
        this.hand = new Hand();
        this.hasCard = false;
    }

    public Player(String name, int age, Hand hand, int numberOfWins, boolean hasCard) {
        this.name = name;
        this.hand = hand;
        this.numberOfWins = numberOfWins;
        this.hasCard = hasCard;
    }
    //getters/setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public boolean hasCard() {
        return hasCard;
    }

    public void setHasCard(boolean hasCard) {
        this.hasCard = hasCard;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //other methods you may need on a class

    //add Card to our hand

    public void addCardToHand(Card card){

       hand.addCard(card);
       if(!hasCard()){
           hasCard = true;
       }

    }


    //display hand
    //we want to go through our hand aka our (cards Arr)
    //and show what the suits and values are



}
