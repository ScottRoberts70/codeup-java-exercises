package util;

import java.util.Scanner;

public class Input {


    private Scanner scanner = new Scanner(System.in);



    public String getString() {
        scanner.nextLine();
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Please enter [y] or [n]");
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }


    public int getInt(int min, int max) {
        System.out.println("Please enter an integer between 1 and 10!");
        int enterInt = scanner.nextInt();
        while (enterInt < min || enterInt > max) {
            System.out.println("Please try again!");
            return getInt();
        }
        return enterInt;
    }


    public int getInt() {
        System.out.println("Please enter an integer!");
        int enterAInt = scanner.nextInt();
        return enterAInt;
    }


    double getDouble(double min, double max) {
        System.out.println("Please enter an integer between 1 and 10 with a decimal!");
        double enterDbl = scanner.nextDouble();
        while (enterDbl < min || enterDbl > max) {
            System.out.println("Please try again!");
            return getDouble();
        }
        return enterDbl;
    }


    double getDouble() {
        System.out.println("Please enter a integer!");
        double enterAdub = scanner.nextDouble();
        return enterAdub;
    }


    public static void main(String[] args) {
        Input input = new Input ();
        System.out.println(input.getInt());
        System.out.println(input.getInt(1, 10));
        System.out.println(input.getDouble(1, 10));
        System.out.println(input.getDouble());
        System.out.println(input.yesNo());
    }
}









