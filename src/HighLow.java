import java.util.Scanner;


public class HighLow {
    public static void guessTheNum() {
        boolean decision = true;
        while (decision) {
            Scanner sc = new Scanner(System.in);
            int rndNum;
            rndNum = (int) ((Math.random() * 10) + 1);
            int tries = 5;
            int i, guess;
            System.out.println(
                    "A number is chosen between 1 to 10.\nGuess the number within 5 trials.");
            for (i = 0; i < tries; i++) {
                System.out.println("Guess the number:");
                guess = sc.nextInt();
                if (rndNum == guess) {
                    System.out.println("GOOD GUESS");
                    System.out.println("Would you like to try again? [y] or [n]");
                    String userChoice = sc.next();
                    if (userChoice.equalsIgnoreCase("n")) {
                        decision = false;
                    }
                } else if (rndNum > guess
                        && i != tries - 1) {
                    System.out.println(
                            "HIGHER than " + guess);
                } else if (rndNum < guess
                        && i != tries - 1) {
                    System.out.println(
                            "LOWER than " + guess);
                }
            }
        }
    }
    public static void main(String[] args) {
        guessTheNum();
    }
}

