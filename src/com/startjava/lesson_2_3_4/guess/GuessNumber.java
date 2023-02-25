package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int hiddenNum;
    private static final int MAX_COUNT_ATTEMPT = 10;
    Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        clearArray();
        generateHiddenNumber();
        int estimatedNum = 0;
        System.out.println("У каждого игрока по 10 попыток");
        while (player1.getCountAttempts() != MAX_COUNT_ATTEMPT && player2.getCountAttempts() != MAX_COUNT_ATTEMPT) {
            System.out.print(player1.getName() + " введите число: ");
            estimatedNum = enterNumberOfPlayers(player1);

            if (estimatedNum == hiddenNum) {
                System.out.println("Игрок " + player1.getName() + " угадал " + hiddenNum + " с " +
                        player1.getCountAttempts() + " попытки");
                break;
            }
            if (estimatedNum < hiddenNum) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
            System.out.print(player2.getName() + " введите число: ");
            estimatedNum = enterNumberOfPlayers(player2);

            if (estimatedNum == hiddenNum) {
                System.out.println("Игрок " + player2.getName() + " угадал " + hiddenNum + " с " +
                        player2.getCountAttempts() + " попытки");
                break;
            }
            if (estimatedNum < hiddenNum) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
        attemptCalculation();
        System.out.print("Игрок " + player1.getName() + " ввел числа: ");
        printEnteredNums(player1);
        System.out.print("\nИгрок " + player2.getName() + " ввел числа: ");
        printEnteredNums(player2);
    }

    private void generateHiddenNumber() {
        int min = 1;
        int max = 100;
        Random random = new Random();
        hiddenNum = random.nextInt(max - min) + min;
    }

    private int enterNumberOfPlayers(Player player) {
        int number = scanner.nextInt();
        player.addNumberOfPlayer(number);
        return number;
    }

    public void attemptCalculation() {
        if (player1.getCountAttempts() == MAX_COUNT_ATTEMPT) {
            System.out.println("У игрока " + player1.getName() + " закончились попытки.");
        }
        if (player2.getCountAttempts() == MAX_COUNT_ATTEMPT) {
            System.out.println("У игрока " + player2.getName() + " закончились попытки.");
        }
    }

    public void clearArray() {
        player1.clearAttempts();
        player2.clearAttempts();
    }

    public void printEnteredNums(Player player) {
        for (int i : player.getNumberOfPlayer()) {
            System.out.printf("%d %s", i, " ");
        }
    }
}
