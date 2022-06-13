public class MethodsExercises {
    public static int addition(int num1, int num2) {
        return num1 + num2;   // If you don't use a return we can use static void instead of int. Using int is better though
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    public static int modulous(int num1, int num2) {
        return num1 % num2;
    }
    public static void main(String[] args) {
        System.out.println(addition(10, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(10, 5));
        System.out.println(division(10, 5));
        System.out.println(modulous(10, 5));
    }
    // if you divide by zero you get Exception in thread "main" java.lang.ArithmeticException: divide by zero
}

