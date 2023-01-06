public class GuessTheNumber {
    public static void main(String[] args) {
        int guessNumber = 20;
        int playerNumber = 10;

        if (guessNumber > 0 && guessNumber <= 100) {
            while (true) {
                if (playerNumber == guessNumber) {
                    System.out.println("Вы победили!");
                } else if(playerNumber < guessNumber) {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                } else if(playerNumber > guessNumber) {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                }
                break;
            }
        }
    }
}