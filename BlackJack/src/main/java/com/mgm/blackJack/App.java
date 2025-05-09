package com.mgm.blackJack;


import com.mgm.blackJack.models.Card;
import com.mgm.blackJack.models.Deck;
import com.mgm.blackJack.models.Hand;
import com.mgm.blackJack.models.Player;

import java.util.Scanner;

public class App {
   static Scanner sc;


   static Deck deck = new Deck();
    public static void main(String[] args) {

       sc = new Scanner(System.in);


        //we need to shuffle the deck
        deck.shuffle();


        //now lets invite the players to come playyy
        Player player = new Player();
        Player player2 = new Player();

        System.out.println("Heyyyy!!! Welcome to Black Jack!");
        System.out.println("-");
        System.out.println("Player 1: Please enter your name");
        String p1Name = sc.nextLine();
        System.out.println("Thank you!");
        System.out.println("-");
        System.out.println("Player 2: Please enter your name");
        String p2Name = sc.nextLine();

        player.setName(p1Name);
        player2.setName(p2Name);

        System.out.println("Dealing to Player 1...");
        System.out.println(".");
        System.out.println(".");

        dealInitialHand(player);

        System.out.println("Dealing to Player 2...");
        System.out.println(".");
        System.out.println(".");
        dealInitialHand(player2);



        // TODO: Displayyy the card that are in the users hard

        System.out.println("Tallying points!");
        System.out.println("Check out the hands! Let's see who won!");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Player 1's Hand: ");
        display(player.getHand());

        System.out.println(" ");
        System.out.println("Player 2's Hand: ");
        display(player2.getHand());


        int player1Score = player.getHand().getValue();
        int player2Score = player2.getHand().getValue();

        if(player1Score > player2Score){
            System.out.println("Congratulations!!! " + player.getName()+ " won!!!");

        } else if(player2Score > player1Score){
            System.out.println("Congratulations!!! " + player2.getName()+ " won!!!");

        } else {
            System.out.println("It's A Tie!!! Womp Womp!");
            System.out.println("Play again to win!");
        }


        //TODO: if the playerhad less than 21 allow them to get an additonal card (Hit or Stay)



       // Player player3 = new Player();

    }

    //we could create a method that deals 2 card to a players at the start of every game
    static void dealInitialHand(Player player){
        player.addCardToHand(deck.deal());
        player.addCardToHand(deck.deal());
    }

    static void display(Hand hand){
        System.out.println(hand);
    }
}
