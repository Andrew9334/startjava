package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] inputNumbers = new int[10];
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

    public void addNumber(int playerNumber) {
        this.inputNumbers[countAttempts++] = playerNumber;
    }

    public int[] getNumber() {
        return Arrays.copyOf(inputNumbers, countAttempts);
    }

    public void clearAttempts() {
        Arrays.fill(inputNumbers, 0, countAttempts, 0);
        countAttempts = 0;
    }
}
