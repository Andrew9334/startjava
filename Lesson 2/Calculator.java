public class Calculator {

    public void calculate(int num1, char sign, int num2) {
        int result = 0;

        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '^':
                for (int i = 1; i <= num2; i++) {
                    result *= num1;
                }
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Введено недопустимое выражение");
        }
        
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}