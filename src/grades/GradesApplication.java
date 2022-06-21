package grades;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student mike = new Student("Mike");
        mike.addGrade(95);
        mike.addGrade(92);
        mike.addGrade(94);
        students.put("mfriend2", mike);

        Student justin = new Student("Justin");
        justin.addGrade(78);
        justin.addGrade(82);
        justin.addGrade(90);
        students.put("jwelsh89", justin);

        Student joey = new Student("Joey");
        mike.addGrade(90);
        mike.addGrade(83);
        mike.addGrade(72);
        students.put("joeyDiaz69", joey);

        Student sam = new Student("Sam");
        mike.addGrade(82);
        mike.addGrade(80);
        mike.addGrade(78);
        students.put("sammy24", sam);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students :\n");
        students.forEach((key, value) -> System.out.printf(" | " + key));

        System.out.println("\nWhat student would you like to see more information on? ");
        String choice = scanner.next();

        while (!students.containsKey(choice)) {
            System.out.println("Sorry,  no student with a GitHub username of " + choice);
            System.out.println("Do you want to begin the trial [y] or [n]?");
            String beginChoice = scanner.next();

            while (!beginChoice.equalsIgnoreCase("y") && !beginChoice.equalsIgnoreCase("n")) {
                slowPrint(ANSI_YELLOW + "Please answer with [y] or [n]!" + ANSI_RESET);
                beginChoice = scanner.next();
            }
            if (beginChoice.equalsIgnoreCase("n")) {
                break;
            }
        }
    }













    static void slowPrint(String output) {
        for (int i = 0; i < output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(30);
            } catch (InterruptedException e) {
            }
        }

    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

}
