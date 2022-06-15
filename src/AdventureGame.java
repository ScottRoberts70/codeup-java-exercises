import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class AdventureGame {
    public static void judgeAndJury() {

        //----------USED TO START GAME OVER-------//

        boolean decision = true;
        while (decision) {

            //--------ALL THE VARIABLES-----------//

            int dObjection = 3;
            int objectionIncrease = 5;
            int deppsHealth = 50;
            int heardsHealh = 50;

            //---------START CONVO--------------//
            Scanner sc = new Scanner(System.in);
            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "WELCOME TO THE DEPP  -vs-  HEARD TRIAL!" + ANSI_RESET);
            System.out.println("What is your Name? ");
            String userName = sc.next();
            if (userName.matches(".*[a-z].*")) {
                System.out.printf(ANSI_CYAN + "Thank you %s, welcome to the trial!\n", userName + ANSI_RESET);
            } else {
                System.out.println(ANSI_YELLOW + "Please enter a valid name!" + ANSI_RESET);
                userName = sc.next();
            }

            System.out.println("Do you want to be on the Prosecution [p] or Defense [d]?");
            String sideChoice = sc.next();
            while (!sideChoice.equalsIgnoreCase("d") && !sideChoice.equalsIgnoreCase("p")) {
                slowPrint(ANSI_YELLOW + "Spend the night in jail " + userName + " or Choose [d] or [p]!" + ANSI_RESET);
                sideChoice = sc.next();
            }
            if (sideChoice.equalsIgnoreCase("d")) {
                heardsHealh += 5;  //---give Ms. Herd extra health to counter your health potions!-------//
                System.out.printf("Welcome %s, to Mr. Depp's defense team!\n You have %d Objections, use them wisely !\n", userName, dObjection);
            }
            if (sideChoice.equalsIgnoreCase("p")) {
                System.out.printf("Welcome %s, to Ms. Heard's prosecution team! You have been given 15 extra health !\n", userName);
            }

            System.out.println("Do you want to begin the trial [y] or [n]?");
            String beginChoice = sc.next();
            while (!beginChoice.equalsIgnoreCase("y") && !beginChoice.equalsIgnoreCase("n")) {
                slowPrint(ANSI_YELLOW + userName + " Are you wanting a contempt charge? Answer with [y] or [n]!" + ANSI_RESET);
                beginChoice = sc.next();
            }
            if (beginChoice.equalsIgnoreCase("n")) {
                slowPrint(ANSI_RED + "The Judge over rules and starts the legal battle!" + ANSI_RESET);
            }

            //----------CALL MY ATTACK METHODS----------------//

            while (heardsHealh > 0 && deppsHealth > 0) {
                int prosDamage = proAttack();
                int defDamage = defAttack();

                System.out.println(ANSI_YELLOW + "Do you want to cross-examine or rest? [c] or [r]?" + ANSI_RESET);
                String crossCheck = sc.next();
                while (!crossCheck.equalsIgnoreCase("c") && !crossCheck.equalsIgnoreCase("r")) {
                    slowPrint(ANSI_YELLOW + userName + " Are you wanting a contempt charge? Answer with [c] or [r]!" + ANSI_RESET);
                    crossCheck = sc.next();
                }

                //----------------CONTINUE OR QUIT-------------//

                if (crossCheck.equalsIgnoreCase("r")) {
                    System.out.println("Fine, Rest!");
                    System.exit(0);
                }

                //-------------JURY INFLUENCE POTION----------//

                if (sideChoice.equalsIgnoreCase("d")) {
                    while (dObjection > 0 && heardsHealh > deppsHealth) {
                        slowPrint(ANSI_GREEN + "Do you want to object to increase your favor with the jury by 5? [y] or [n]" + ANSI_RESET);
                        String callObjection = sc.next();
                        if (callObjection.equalsIgnoreCase("n")) break;
                        if (callObjection.equalsIgnoreCase("y")) {
                            deppsHealth += objectionIncrease;
                            dObjection--;
                            slowPrint(ANSI_GREEN + "Mr. Depp's health is now " + deppsHealth + " , " + userName + " has " + dObjection + " objections remaining. \n" + ANSI_RESET);
                            break;
                        }
                    }
                }

                //---------PROSECUTIONS ATTACK-------------//

                heardsHealh -= defDamage;
                if (heardsHealh <= 0) heardsHealh = 0;
                System.out.printf("You're defense team calls a witness and deals" + ANSI_RED_BACKGROUND + ANSI_BLACK + " %d damage." + ANSI_RESET + "\n Ms. Heard has" + ANSI_GREEN_BACKGROUND + ANSI_BLACK + " %d health " + ANSI_RESET + "remaining.\n", defDamage, heardsHealh);


                //------------IF PROSECUTION LOSES--------------//

                if (heardsHealh <= 0) {
                    slowPrint(ANSI_RED + "Ms. Heard has lost. 10 Million to Mr. Depp, and " + userName + " GETS A PAYDAY!\n" + ANSI_RESET);
                    break;
                }

                //---------DEFENSE ATTACK-------------//

                deppsHealth -= prosDamage;
                if (deppsHealth <= 0) deppsHealth = 0;
                System.out.printf("The prosecution calls a witness and deals" + ANSI_RED_BACKGROUND + ANSI_BLACK + " %d damage." + ANSI_RESET + "\n Mr. Depp has" + ANSI_GREEN_BACKGROUND + ANSI_BLACK + " %d health" + ANSI_RESET + "remaining.\n", prosDamage, deppsHealth);

                //------------IF DEFENSE LOSES--------------//

                if (deppsHealth <= 0) {
                    slowPrint(ANSI_RED + "Mr. Depp has lost. 10 Million awarded to Ms. Heard and " + userName + " is  FIRED!\n" + ANSI_RESET);
                }
            }

            //----------REPLAY or ENDGAME---------------------//

            System.out.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "Do you want a re-trial? [y] or [n]" + ANSI_RESET);
            String userContinue = sc.next();
            if (userContinue.equalsIgnoreCase("n")) {
                decision = false;
            }
        }
    }

    //-----------------ATTACK METHODS--------------//
    public static int proAttack() {
        int pAttack = (int) ((Math.random() * 10) + 1);
        return pAttack;
    }

    public static int defAttack() {
        int dAttack = (int) ((Math.random() * 10) + 1);
        return dAttack;
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

    public static void main(String[] args) {
        judgeAndJury();
    }
}


