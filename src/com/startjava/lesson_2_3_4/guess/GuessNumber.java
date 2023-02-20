package com.startjava.lesson_2_3.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int min = 1;
        int max = 100;
        Random random = new Random();
        int hiddenNum = random.nextInt(max - min) + min;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int estimatedNum = 0;
            System.out.println(player1.getName() + " введите число: ");
            estimatedNum = scanner.nextInt();

            if (estimatedNum == hiddenNum) {
                System.out.println("Выиграл " + player1.getName());
                break;
            } 
            if (estimatedNum < hiddenNum) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }

            System.out.println(player2.getName() + " введите число: ");
            estimatedNum = scanner.nextInt();

            if (estimatedNum == hiddenNum) {
                System.out.println("Выиграл " + player2.getName());
                break;
            } 
            if (estimatedNum < hiddenNum) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
