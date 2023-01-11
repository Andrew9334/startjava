public class GuessNumber {
    public static void main(String[] args) {
        int guessNumber = 10;
        int min = 0;
        int max = 100;
        int playerNumber = 1;

        if (guessNumber > min && guessNumber <= max) {
            while (true) {
                if (playerNumber < guessNumber) {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                    playerNumber++;
                } else if (playerNumber > guessNumber) {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                    playerNumber--;
                } else if (playerNumber == guessNumber) {
                    System.out.println("Вы победили!");
                    break;
                }
            }
        }
    }
}