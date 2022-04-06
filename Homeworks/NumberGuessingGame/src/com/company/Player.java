package com.company;

public class Player {

    private String playerName;
    int guessCount = 0;

    public Player(String name) {
        this.playerName = name;
    }

    public String getName() {
        return playerName;
    }

    public void addGuessCount() {
        this.guessCount++;
    }

    public int getGuessCount() {
        return guessCount;
    }

}
