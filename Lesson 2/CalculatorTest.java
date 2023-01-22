import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                System.out.print("Введите первое число ");
                int num1 = scanner.nextInt();
                System.out.print("Введите знак математической операции: ");
                char sign = scanner.next().charAt(0);
                System.out.print("Введите второе число: ");
                int num2 = scanner.nextInt();
                int result = 1;
                calculator.calculate(num1, sign, num2);
            } else {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
            }
            answer = scanner.nextLine();
        } while (!"no".equals(answer));

        scanner.close();
    }
}
