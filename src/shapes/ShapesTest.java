package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Measurable myShape1 = new Rectangle(9, 10);
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape.getArea());



//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Your perimeter is: " + ANSI_RED + box1.getPerimeter()+ANSI_RESET);
//        System.out.println("Your are is : " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Your perimeter is: " + box2.getPerimeter());
//        System.out.println("Your area is : " + box2.getArea());
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
}


