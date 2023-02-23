package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public double calculate(String expression) {
        double result = 0;
        parseExpression(expression);
        switch (sign) {
            case '+':
                result = Math.addExact(num1, num2);
                break;
            case '-':
                result = Math.subtractExact(num1, num2);
                break;
            case '*':
                result = Math.multiplyExact(num1, num2);
                break;
            case '^':
                result = (int) Math.pow(num1, num2);
                break;
            case '/':
                result = Math.floorDiv(num1, num2);
                break;
            case '%':
                result = Math.floorMod(num1, num2);
                break;
            default:
                System.out.println("Знак " + sign + " не поддерживается");
        }
        return result;
    }

    private void parseExpression(String expression) {
        String[] partsExpression = expression.split(" ");
        num1 = Integer.parseInt(partsExpression[0]);
        sign = partsExpression[1].charAt(0);
        num2 = Integer.parseInt(partsExpression[2]);
    }
}
