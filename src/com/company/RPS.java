package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class RPS {

    private int playerScore = 0;
    private int computerScore = 0;

    private int ties = 0;
    private int totalGamesPlayed = 0;

    private int numberOfRocks = 0;
    private int numberOfPaper = 0;
    private int numberOfScissors = 0;

    private int numberOfRocksPlayer = 0;
    private int numberOfPaperPlayer = 0;
    private int numberOfScissorsPlayer = 0;

    Scanner input = new Scanner(System.in);


    public void play() {


        System.out.println("For Rock: Enter 1 \nFor Paper: Enter 2\nFor Scissors: Enter 3");
        int player = input.nextInt() - 1;


        if (player == 1) {

            numberOfRocksPlayer++;

        } else if (player == 2) {
            numberOfPaperPlayer++;
        } else if (player == 3) {
            numberOfScissorsPlayer++;
        }


        totalGamesPlayed++;

        int computer = 0;

       /* if (numberOfRocksPlayer == 0 && numberOfPaperPlayer == 0 && numberOfScissorsPlayer == 0){
            computer = (new Random().nextInt(3));
        }else {
            if (numberOfRocksPlayer > 0 && numberOfPaperPlayer == 0 && numberOfScissorsPlayer == 0)
        }
        else {
            if (numberOfRocksPlayer == 0 && numberOfPaperPlayer > 0 && numberOfScissorsPlayer == 0)
        }
        else {
            if (numberOfRocksPlayer == 0 && numberOfPaperPlayer == 0 && numberOfScissorsPlayer > 0)
        }
        else {
            if (numberOfPaperPlayer > numberOfRocksPlayer  && numberOfScissorsPlayer == 0)
        }
        else {
            if (numberOfRocksPlayer > numberOfPaperPlayer  && numberOfScissorsPlayer == 0)
        }
        else {
        }
        else {
            if (numberOfRocksPlayer > numberOfScissorsPlayer  && numberOfScissorsPlayer == 0)
        } */

      //  System.out.println(computer);

        HashMap<Integer, String> rps = new HashMap<>();
        rps.put(0, "rock");
        rps.put(1, "paper");
        rps.put(2, "scissors");

        if (player == computer) {
            ties++;
            System.out.println("Player picked " + rps.get(player) + " & Computer picked " + rps.get(computer));
        }

        if (player == 0 && computer == 1) {
            numberOfRocks++;
            numberOfPaper++;
            this.computerScore++;
            System.out.println("paper covers rock, Computer Wins!");
        }
        if (player == 1 && computer == 2) {
            numberOfPaper++;
            numberOfScissors++;
            this.computerScore++;
            System.out.println("scissors cuts paper, Computer Wins!");

        }
        if (player == 2 && computer == 0) {
            numberOfScissors++;
            numberOfRocks++;
            this.computerScore++;
            System.out.println("rock crushes scissors, Computer Wins!");
        }

        if (player == 1 && computer == 0) {
            numberOfPaper++;
            numberOfRocks++;
            this.playerScore++;
            System.out.println("paper covers rock, Player Wins!");
        }
        if (player == 2 && computer == 1) {
            numberOfScissors++;
            numberOfPaper++;
            this.playerScore++;
            System.out.println("scissors cuts paper, Player Wins!");
        }
        if (player == 0 && computer == 2) {
            numberOfRocks++;
            numberOfScissors++;
            this.playerScore++;
            System.out.println("rock crushes scissors, Player Wins!");
        }

        System.out.println("Player Score: " + playerScore + "   Computer Score: " + computerScore);

        System.out.println();
        System.out.println();

        play();

    }


    public int getComputerScore() {
        return computerScore;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getTotalGamesPlayed() {
        return totalGamesPlayed;
    }

    public int getTies() {
        return ties;
    }

    public String getMostUsed() {


        if (numberOfRocks > numberOfPaper && numberOfRocks > numberOfScissors) {
            return "Rock: " + numberOfRocks;
        }
        if (numberOfPaper > numberOfRocks && numberOfPaper > numberOfScissors) {

            return "Paper: " + numberOfPaper;

        }
        if (numberOfScissors > numberOfRocks && numberOfScissors > numberOfPaper) {
            return "Scissors: " + numberOfScissors;
        }

        return "No max used yet";

    }


}
