package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbersOfPlayer = new int[10];
    private int countAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public void addNumberOfPlayer(int playerNumber) {
        this.numbersOfPlayer[countAttempts++] = playerNumber;
    }

    public int[] getNumberOfPlayer() {
        return Arrays.copyOf(numbersOfPlayer, countAttempts);
    }

    public void clearAttempts() {
        Arrays.fill(numbersOfPlayer, 0, countAttempts, 0);
        countAttempts = 0;
    }
}
