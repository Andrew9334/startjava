package com.startjava.lesson_2_3_4.calculator;

import jdk.swing.interop.SwingInterOpUtils;

public class Calculator {
    private static int num1;
    private static int num2;
    private static char sign;

    public static double calculate(String expression) {
        parseExpression(expression);
        if (num1 < 0 || num2 < 0) {
            throw new NumberFormatException();
        }
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '^' -> Math.pow(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> {
                System.out.println("Данный знак не поддерживается");
                yield 0;
            }
        };
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
            num1 = Integer.parseInt(partsExpression[0]);
            sign = partsExpression[1].charAt(0);
            num2 = Integer.parseInt(partsExpression[2]);
    }
}
