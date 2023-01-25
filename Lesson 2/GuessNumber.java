import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void game() {
        int num = 0;
        int min = 1;
        int max = 100;
        Random random = new Random();
        int hiddenNum = random.nextInt(max - min) + min;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(player1.getName() + " введите число: ");
            num = scanner.nextInt();
            if (num < hiddenNum) {
                System.out.println("Загаданное число больше");
            } else if (num > hiddenNum) {
                System.out.println("Загаданое число меньше");
            } else if (num == hiddenNum) {
                System.out.println("Выиграл " + player1.getName());
                break;
            }

            System.out.println(player2.getName() + " введите число: ");
            num = scanner.nextInt();
            if (num < hiddenNum) {
                System.out.println("Загаданное число больше");
            } else if (num > hiddenNum) {
                System.out.println("Загаданое число меньше");
            } else if (num == hiddenNum) {
                System.out.println("Выиграл " + player2.getName());
                break;
            }
        }
    }
}
