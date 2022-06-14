import java.util.Scanner;


public class HighLow {
    public static void guessTheNum () {
        boolean decision = true;
        while (decision) {
            int rndNum;
            rndNum = (int) (Math.random()+1);
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess what the number is: ");
            int userGuess = sc.nextInt();
            if (userGuess < rndNum){
                System.out.println("HIGHER");
            } else if (userGuess > rndNum) {
                System.out.println("LOWER");
            } else {
                System.out.println("GOOD GUESS!");
            }
            System.out.println("would you like to continue? [y] or [n]");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        }
    }
    public static void main(String[] args) {
        guessTheNum();
    }
}

