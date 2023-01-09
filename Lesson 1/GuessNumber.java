public class GuessNumber {
    public static void main(String[] args) {
        int guessNumber = 10;
        int playerNumber = 50;

        if (guessNumber > 0 && guessNumber <= 100) {
            while (true) {
                if (playerNumber < guessNumber) {
                    System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                    playerNumber += playerNumber / 2;
                    if (playerNumber < guessNumber) {
                        System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                        while (playerNumber != guessNumber) {
                            playerNumber++;
                        }
                    }
                    if (playerNumber > guessNumber) {
                        System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                        while (playerNumber != guessNumber) {
                            playerNumber--;
                        }
                    }
                    if (playerNumber == guessNumber) {
                        System.out.println("Вы победили!");
                        break;
                    }
                } else if (playerNumber > guessNumber) {
                    System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                    playerNumber -= playerNumber / 2;
                    if (playerNumber < guessNumber) {
                        System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
                        while (playerNumber != guessNumber) {
                            playerNumber++;
                        }
                    }
                    if (playerNumber > guessNumber) {
                        System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
                        while (playerNumber != guessNumber) {
                            playerNumber--;
                        }
                    }
                    if (playerNumber == guessNumber) {
                        System.out.println("Вы победили!");
                        break;
                    }
                }
            }
        }
    }
}