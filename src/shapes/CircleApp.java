package shapes;


import com.sun.jdi.PathSearchingVirtualMachine;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        while (true) {

        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.println(circle.getRadius());
        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());
        if (input.yesNo()){

        }
//        System.out.println(input.yesNo());
        }
    }

}

