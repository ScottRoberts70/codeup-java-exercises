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


public class MethodsExercises {
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int num = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++){
            fact=fact*i;
        }
            if (num > min && num < max) {
                System.out.println(" The factorial of  "+num+ " is " + fact);
                return num;
            }

            return getInteger(1,11);
    }


    public static void main(String[] args) {
        getInteger(1, 10);// this is starts the method within the main, even though I have the main after.
    }
}
//    Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24
