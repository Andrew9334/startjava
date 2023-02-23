package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("Введите математическое выражение: ");
                double result = calculator.calculate(scanner.nextLine());
                System.out.println(format(result));
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        scanner.close();
    }

    public static String format (double result) {
        if (result == (int) result) {
            return String.format("%d", (int) result);
        } else {
            return String.format("%s", result);
        }
    }
}
