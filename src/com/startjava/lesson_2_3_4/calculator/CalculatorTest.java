package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.print("Введите математическое выражение: ");
                if ("yes".equals(answer)) {
                    try {
                        printResult(Calculator.calculate(scanner.nextLine()));
                    } catch (NumberFormatException e) {
                        System.out.println("Введено не натуральное число");
                    }
                    System.out.println("Хотите продолжить вычисления? [yes/no]");
                    answer = scanner.nextLine();
                }
        }while (!"no".equals(answer));
            scanner.close();
    }

    public static void printResult(double result) {
        if (result % 1 == 0) {
            System.out.println((int) result);
        } else {
            System.out.println(result);
        }
    }
}
