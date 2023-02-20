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
                String expression = scanner.nextLine();
                calculator.calculate(expression);
            }
            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));
        scanner.close();
    }
}
