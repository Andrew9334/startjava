public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 14;
        int powValue = 3;
        char sign = '^';
        int result = 0;
        int count = 3;
        int resultPow = 1;

        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '%') {
            result = num1 % num2;
        }

        if (sign == '^') {
            while (count != 0) {
                resultPow = resultPow * num1;
                count--;
            }
            System.out.println(num1 + " " + sign + ' ' + powValue + " " + " = " + resultPow);
        } else {
            System.out.println(num1 + " " + sign + ' ' + num2 + " " + " = " + result);
        }
    }
}