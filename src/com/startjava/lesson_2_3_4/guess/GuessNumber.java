package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNumber;
    private static final int ATTEMPTS_LIMIT = 10;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        clear();
        generateHiddenNumber();
        while (!attemptCalculation(player1) || !attemptCalculation(player2)) {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
        }
    }

    public boolean isGuessed(Player player) {
        int estimatedNum = 0;
        System.out.println("У каждого игрока по 10 попыток");
        while (!attemptCalculation(player)) {
            System.out.print(player.getName() + " введите число: ");
            estimatedNum = inputNumber(player);

            if (estimatedNum == hiddenNumber) {
                System.out.println("Игрок " + player.getName() + " угадал " + hiddenNumber + " с " +
                        player.getCountAttempts() + " попытки");
                System.out.print("Игрок " + player.getName() + " ввел числа: ");
                printInputNumber(player);
                return true;
            }
            if (estimatedNum < hiddenNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
        return false;
    }

    public void clear() {
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private void generateHiddenNumber() {
        int min = 1;
        int max = 100;
        Random random = new Random();
        hiddenNumber = random.nextInt(max - min) + min;
    }

    private int inputNumber(Player player) {
        int number = scanner.nextInt();
            player.addNumber(number);
            return number;
    }

    public boolean attemptCalculation(Player player) {
        if (player.getCountAttempts() == ATTEMPTS_LIMIT && player.getCountAttempts() == ATTEMPTS_LIMIT) {
            System.out.println("У игрока " + player.getName() + " закончились попытки.");
            return true;
        }
        return false;
    }

    public void printInputNumber(Player player) {
        for (int i : player.getNumber()) {
            System.out.printf("%d %s", i, " ");
        }
    }
}
