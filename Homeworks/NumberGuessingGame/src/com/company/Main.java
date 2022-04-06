package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static int getRandomValue(int minVal, int maxVal) {
        return (int) ((Math.random() * (maxVal - minVal)) + minVal);
    }

    public static void main(String[] args) {

        ArrayList<Player> playerList = new ArrayList<Player>();
        int totalPlayer, guessValue, playTurn = 0;
        boolean run = true;

        System.out.println("-- Guess Game --");

        Scanner scan = new Scanner(System.in);
        guessValue = getRandomValue(1,100);

        System.out.print("How many player(s) do you want to declare? > ");
        totalPlayer = scan.nextInt();

        for (int i = 0; i < totalPlayer; i++) {
            System.out.printf("Enter %d. player name: ", i+1);
            String playerName = scan.next();
            playerList.add( new Player(playerName));
        }

        while (run) {
            Player currentPlayer = playerList.get(playTurn % totalPlayer);

            System.out.print(currentPlayer.getName()+"'s guess: ");
            int currentPlayerGuess = scan.nextInt();
            currentPlayer.addGuessCount();

            if (currentPlayerGuess > guessValue) {
                System.out.println("Get a less value for the next time.");
            } else if (currentPlayerGuess < guessValue) {
                System.out.println("Get a bigger value for the next time.");
            } else {
                System.out.printf("\n----- %s found the value %d at him/her %d. try -----", currentPlayer.getName(), guessValue, currentPlayer.getGuessCount());
                run = false;
            }

            playTurn++;
        }

        scan.close();

    }

}
