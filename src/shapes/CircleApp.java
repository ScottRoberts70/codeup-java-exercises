package shapes;


import com.sun.jdi.PathSearchingVirtualMachine;
import util.Input;

import java.util.IllegalFormatCodePointException;

public class CircleApp {

    public static void main(String[] args) {
        int count = 0;
        while (true) {
            Input input = new Input();
            Circle circle = new Circle(input.getDouble());
            Double rad = circle.getRadius();
            System.out.println("The radius of your circle is " + rad);
            Double circum = circle.getCircumference();
            System.out.println("The circumference is " +circum);
            Double area = circle.getArea();
            System.out.println("The area of your circle is :" +area);
            count++;
            if (input.yesNo() == false) {
                System.out.println("You have made " + count + " circles!");
                break;
            }
        }
    }

}

