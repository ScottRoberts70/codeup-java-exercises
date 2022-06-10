import java.util.Scanner;


//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
//    }
//}

//public class ControlFlowExercises {
//   public static void main(String[] args) {
//       int i = 0, n = 100;
//       do {System.out.println(i);
//            i = i + 2; ;
//       } while ( i <= n);
//   }
//   }
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 100, n = -10;
//        do {System.out.println(i);
//            i = i - 5; ;
//        } while ( i >= n);
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        long i = 2;
//        do {System.out.println(i);
//            i = i * i;
//        } while ( i <= 1000000);
//    }
//}


//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (int i =
//        do {System.out.println(i);
//            i = i - 5; ;
//        } while ( i >= n);
//    }
//}

//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }
//    }
//}
//Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
public class ControlFlowExercises {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }
}
