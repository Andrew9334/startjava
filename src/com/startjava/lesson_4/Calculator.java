package com.startjava.lesson_4;

import java.text.DecimalFormat;

public class Calculator {
    private static int num1;
    private static int num2;
    private static char sign;

    public void calculate(String expression) {
        double result = 0;
        writeToArrayExpression(expression);
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
        String df = new DecimalFormat("#0.0").format(result);
        if (df.equals(df)) {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + (int) result);
        } else {
            System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
        }
    }

    private static void writeToArrayExpression(String expression) {
        String[] stringArr = expression.split(" ");
        num1 = Integer.parseInt(stringArr[0]);
        sign = stringArr[1].charAt(0);
        num2 = Integer.parseInt(stringArr[2]);
    }
}
