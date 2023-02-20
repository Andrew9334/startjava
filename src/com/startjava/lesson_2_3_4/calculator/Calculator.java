package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int num1;
    private int num2;
    private char sign;

    public void calculate(String expression) {
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
                return;
        }

        if (result == (int) result) {
            System.out.printf("%s = %d", expression, (int) result);
        } else {
            System.out.printf("%s = %f", expression, result);
        }
    }

    private void parseExpression(String expression) {
        String[] parseExpression = expression.split(" ");
        num1 = Integer.parseInt(parseExpression[0]);
        sign = parseExpression[1].charAt(0);
        num2 = Integer.parseInt(parseExpression[2]);
    }
}
