import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        calculator.methodForCalculation();
        System.out.println("Хотите продолжить вычисления? [yes/no]");
        String continueOperation = scanner.nextLine();

        do {
            if ("yes".equals(continueOperation)) {
                calculator.methodForCalculation();
            }
            if ("no".equalsIgnoreCase(continueOperation)) {
                break;
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            continueOperation = scanner.nextLine();
        } while (!"yes".equals(continueOperation) || !"no".equals(continueOperation));
        
        scanner.close();
    }
}