package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private static int num1;
    private static int num2;
    private static char sign;

    public static double calculate(String expression) {
        parseExpression(expression);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '^' -> Math.pow(num1, num2);
            case '/' -> Math.floorDiv(num1, num2);
            case '%' -> Math.floorMod(num1, num2);
            default -> 0;
        };
    }

    private static void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        try {
            try {
                if (sign != Character.MATH_SYMBOL) {
                    sign = partsExpression[1].charAt(0);
                }
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Введен неверный знак математического выражения");
            }
            if ((num1 % 1 == 0.0 && num2 % 1 == 0.0) || (num1 < 0 || num2 < 0)) {
                num1 = Integer.parseInt(partsExpression[0]);
                num2 = Integer.parseInt(partsExpression[2]);
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Введите натуральное число");
        }
    }
}
