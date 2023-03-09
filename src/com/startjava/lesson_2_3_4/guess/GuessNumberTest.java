package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Введите имя первого игрока ");
        Player player1 = new Player(name = scanner.nextLine());
        System.out.print("Введите имя второго игрока ");
        Player player2 = new Player(name = scanner.nextLine());

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                guessNumber.play();
            }
            System.out.println("\nХотите продолжить? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        scanner.close();
    }
}