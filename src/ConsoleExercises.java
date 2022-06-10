import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f",+pi);

//        System.out.println("Enter an integer:");
//        Scanner myObj = new Scanner(System.in);
//
//        int  nextInt = myObj.nextInt();
//        System.out.println("Your Integer is " + nextInt);

        Scanner in = new Scanner(System.in);
//        String string1;
//        String string2;
//        String string3;
//
//        System.out.println("Enter three words and separate each with a blank: ");
//        string1 = in.next();
//        string2 = in.next();
//        string3 = in.next();
//
//        System.out.println(string1 + " \n" + string2 +
//                " \n" + string3);

//error when less than 3 and it will display only the three word if to many.

//        String sentence;
//        System.out.println("enter a sentence:");
//        sentence = in.nextLine();
//        System.out.println("Your sentence was: " +sentence);

        in.useDelimiter("\n");
        System.out.println("Enter the width and length seperated by a space!");
        double length = Double.parseDouble(in.next());
        double width = Double.parseDouble(in.next());
        double height = Double.parseDouble(in.next());

        System.out.println("The length you entered was " +length);
        System.out.println("The width you entered was " +width);
        System.out.println("The area is " +length*width);
        System.out.println("The perimeter is " +((length*2) + (width*2)));
        System.out.println("The volume is: " +((length) * (width))*height);

    }
}