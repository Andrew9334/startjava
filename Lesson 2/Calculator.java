import java.util.Scanner;

public class Calculator {

    public void methodForCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int num1 = scanner.nextInt();
        System.out.println("Введите знак математической операции: ");
        String sign = scanner.next();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        switch (sign) {
            case "+":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "^":
                System.out.println(num1 + " ^ " + num1 + " = " + (num1 * num1));
                System.out.println(num2 + " ^ " + num2 + " = " + (num2 * num2));
                break;
            case "/":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("Введено недопустимое выражение");
                break;
        }
    }
}


