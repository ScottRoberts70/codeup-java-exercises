import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean decision = true;
        while (decision) {
            Scanner input = new Scanner(System.in);
            System.out.println("Say something to Bob: ");
            String answer = input.nextLine();
            if (answer.endsWith("?")) {
                System.out.println("Sure");
            } else if (answer.endsWith("!")) {
                System.out.println("Whoa chill out!");
            } else if (answer.isEmpty()) {
                System.out.println("Fine by the way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Keep talking to Bob? [y] or [n]");
            String userChoice = input.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        }
    }
}

