package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private static final int ATTEMPTS_LIMIT = 10;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        clear();
        generateHiddenNumber();
        System.out.println("У каждого игрока по 10 попыток");
        if (isGuessed(player1) | isGuessed(player2)) {
        }
        System.out.print("Игрок " + player1.getName() + " ввел числа: ");
        printEnteredNumbers(player1);
        System.out.print("\nИгрок " + player2.getName() + " ввел числа: ");
        printEnteredNumbers(player2);
    }

    private void clear() {
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private void generateHiddenNumber() {
        int min = 1;
        int max = 100;
        Random random = new Random();
        hiddenNumber = random.nextInt(max - min) + min;
    }

    private boolean hasAttempts(Player player) {
        if (player.getCountAttempts() == ATTEMPTS_LIMIT) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return true;
        }
        return false;
    }

    private boolean isGuessed(Player player) {
        while (!hasAttempts(player)) {
            System.out.print(player.getName() + " введите число: ");
            int playerNumber = inputNumber(player);

            if (playerNumber == hiddenNumber) {
                System.out.println("Игрок " + player.getName() + " угадал " + hiddenNumber + " с " +
                        player.getCountAttempts() + " попытки");
                return true;
            }
            if (playerNumber < hiddenNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
        return false;
    }

    private int inputNumber(Player player) {
        int number = new Scanner(System.in).nextInt();
        player.addNumber(number);
        return number;
    }

    private void printEnteredNumbers(Player player) {
        for (int i : player.getNumber()) {
            System.out.printf("%d %s", i, " ");
        }
    }
}
