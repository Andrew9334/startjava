public class Calculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 3;
        char sign = '-';
        int result = 0;

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
        } else if (sign == '^') {
            for (int i = 1; i <= num2; i++) {
                result = 1;
                result = result * num1;
            }
        }
        System.out.println(num1 + " " + sign + ' ' + num2 + " " + " = " + result);
    }
}