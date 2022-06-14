import java.util.Scanner;
import java.util.function.DoubleToIntFunction;


//public class MethodsExercises {
//    public static int addition(int num1, int num2) {
//        return num1 + num2;   // If you don't use a return we can use static void instead of int. Using int is better though
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static long multiplication(long num1, long num2) {
//        return num1 * num2;
//    }
//
//    public static double division(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static int modulous(int num1, int num2) {
//        return num1 % num2;
//    }
//public class MethodsExercises {
//    public static int getInteger(int min, int max) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = sc.nextInt();
//        if (userInput > min && userInput < max) {
//            System.out.println(userInput);
//            return userInput;
//        }else{
//            getInteger(1,10);
//        }
//        return userInput;
//    }

//public class MethodsExercises {
//
//    public static void getFactorial(int min, int max) {
//        boolean decision = true;
//        while (decision) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter a number between 1 and 10: ");
//            int num = sc.nextInt();
//            long fact = 1;
//            for (int i = 1; i <= num; i++) {
//                fact = fact * i;
//                if (num >= min && num <= max) {
//                    System.out.println(i + "!" + ":" + fact);
//                }
//            }
//            System.out.println("would you like to continue? [y] or [n]");
//            String userChoice = sc.next();
//            if (userChoice.equalsIgnoreCase("n")) {
//                decision = false;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        getFactorial(1, 10);
//    }
//}


public class MethodsExercises {

    public static void rollTheDice() {
        boolean decision = true;
        while (decision) {
            Scanner sc = new Scanner(System.in);
            System.out.print("How Many Sides of dice do you want?");
            int dieSides = sc.nextInt();
            int die1;
            int die2;
            int roll;
            die1 = (int) (Math.random() * dieSides) + 1;
            die2 = (int) (Math.random() * dieSides) + 1;
            roll = die1 + die2;
            System.out.println("The first die comes up " + die1);
            System.out.println("The second die comes up " + die2);
            System.out.println("Your total roll is " + roll);
            System.out.println("would you like to continue? [y] or [n]");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
        }
    }

    public static void main(String[] args) {
        rollTheDice();
    }
}