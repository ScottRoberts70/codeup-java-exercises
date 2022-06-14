import java.util.Scanner;


public class AdventureGame {
    public static void judgeAndJury() {
        boolean decision = true;
        while (decision) {
            int deppsHealth = 100;
            int heardsHealh = 100;
            int objection = 3;
            int objectionIncrease = 5;
            Scanner sc = new Scanner(System.in);
            System.out.println("Would you like to go to trial [y] or [n]?");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            } else {
                System.out.println("Do you want to be on the Prosecution [p] or Defense [d]?");
                String sideChoice = sc.next();
                if (sideChoice.equalsIgnoreCase("d")) {
                    System.out.println("Welcome to Mr. Depp's defense team!");
                }
                    if (sideChoice.equalsIgnoreCase("p")) {
                        System.out.println("Welcome to Ms. Heard's prosecutors side!");
                    }
                    System.out.println("Do you want to begin the trial [y] or [n]?");
                    String beginChoice = sc.next();
                    if (beginChoice.equalsIgnoreCase("n")) {
                        System.out.println("The Judge over rules and starts the legal battle!");
                    }
                while (heardsHealh > 0 && deppsHealth > 0) {
                    int prosDamage = proAttack();
                    int defDamage = defAttack();
                    heardsHealh -= defDamage;
                    System.out.printf("You're defense team calls a witness and deals %d damage.\nMs. Heard has %d health remaining.\n", defDamage, heardsHealh);
                    if (heardsHealh <= 0) {
                        System.out.println("Ms. Heard is ordered to pay 10Mil to Mr. Depp.");
                        break;
                    }
                    deppsHealth -= prosDamage;
                    System.out.printf("The prosecution calls a witness and deals %d damage to the defense.\nMr. Depp has %d health remaining.\n", prosDamage, deppsHealth);
                    while (objection > 0 && heardsHealh > deppsHealth) {
                        System.out.println("Do you want to object to increase your health by 5? [Y/N]");
                        String callObjection = sc.next();
                        if (callObjection.equalsIgnoreCase("n")) break;
                        if (callObjection.equalsIgnoreCase("y")) {
                            deppsHealth += objectionIncrease;
                            objection--;
                            System.out.printf("Mr. Depp's health is now %d. You have %d objections remaining.", deppsHealth, objection);
                            break;
                        }
                    }
                    if (deppsHealth <= 0) {
                        System.out.println("Mr. Depp has lost.\n");
                        break;
                    }
                }

                }
            }
        }



    public static int proAttack() {
        int pAttack = (int) ((Math.random() * 10) + 1);
        return pAttack;
    }

    public static int defAttack() {
        int dAttack = (int) ((Math.random() * 10) + 1);
        return dAttack;
    }

    public static void main(String[] args) {
        judgeAndJury();
    }
}


