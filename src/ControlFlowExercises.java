import java.util.Scanner;


//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }
//    }
//}

//public class ControlFlowExercises {
//   public static void main(String[] args) {
//       int i = 0;
//       do {System.out.println(i);
//            i += 2; ;
//       } while ( i <= 100);
//   }
//}


//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 100;
//        do {System.out.println(i);
//            i -= 5;
//        } while ( i >= -10);
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        long i = 2;
//        do {System.out.println(i);
//            i *= i;
//** another way  i = (long) Math.pow(i, 2) ********// have to cast to long because you went to a string
//        } while ( i <= 1000000);
//    }
//}


//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (int i = 2; i <= -1000000; i*=i){
//            System.out.println(i);
//        }
//    }
//}


//Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15) == 0)
//                System.out.println("fizzbuzz");
//            else if ((i % 3) == 0)
//                System.out.println("fizz");
//            else if ((i % 5) == 0)
//                System.out.println("buzz");
//            else
//                System.out.println(i);
//        }
//    }
//}
//    Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.

public class ControlFlowExercises {

    public static void main(String[] args) {
//        String doThis;
//        do {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter an integer you would like to go up to: ");
//            int num = input.nextInt();
//            System.out.println("number |" + " square |" + " cubed");
//            System.out.println("------ |" + " ------ |" + " -----");
        //------System.out.printf("%-6d  |  %-7d  |  %-5d %n, table, square, cubed}; but you have to make the variables
//            int i = 1;
//            while (i <= num) {
//                System.out.println(i + "      |  " + (i * i) + "     |" + (i * i * i));
//                i++;
//            }
//            System.out.println("would you like to continue? [y] or [n]");
//            doThis = input.next();
//        } while (!doThis.equals("n"));
//    }


        //    Convert given number grades into letter grades.
//
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        boolean decision = true;
        while (decision) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a numeric grade value between (0-100): ");
            int num = sc.nextInt();
            if (num >= 88 && num <= 100) {
                System.out.println("You got an: A");
            } else if (num >= 80 && num <= 87) {
                System.out.println("You got an: B ");
            } else if (num >= 67 && num <= 79) {
                System.out.println("You got an: C");
            } else if (num >= 60 && num <= 66) {
                System.out.println("You got an: D");
            } else if (num >= 0 && num <= 59) {
                System.out.println("You got an: F");
            }
            System.out.println("would you like to continue? [y] or [n]");
            String userChoice = sc.next();
            if (userChoice.equalsIgnoreCase("n")) {
                decision = false;
            }
          }
        }
    }
