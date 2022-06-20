package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("Your perimeter is: " + box1.getPerimeter());
        System.out.println("Your are is : " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Your perimeter is: " + box2.getPerimeter());
        System.out.println("Your area is : " + box2.getArea());
    }
}


