package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public double calculate(String expression) {
        parseExpression(expression);
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '^':
                return Math.pow(num1, num2);
            case '/':
                return (double) num1 / num2;
            case '%':
                return Math.floorMod(num1, num2);
            default:
                System.out.println("Знак " + sign + " не поддерживается");
        }
        return 0;
    }

    private void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }
}
