import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока ");
        String namePlayer1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока ");
        String namePlayer2 = scanner.nextLine();

        Player player1 = new Player(namePlayer1);
        Player player2 = new Player(namePlayer2);

        GuessNumber guessNumber = new GuessNumber(player1, player2);
        String answer = "yes";

        do {
            if ("yes".equals(answer)) {
                guessNumber.play();
            }
            System.out.println("Хотите продолжить? [yes/no]");
            answer = scanner.nextLine();
        } while (!"no".equals(answer));

        scanner.close();
    }
}
