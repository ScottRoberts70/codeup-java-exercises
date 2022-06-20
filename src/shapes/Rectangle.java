package shapes;

public class Rectangle {

    protected double length;

    protected double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return (this.length * this.width);
    }

    public double getPerimeter(){
        return (this.length * 2) + (this.width *2);
    }

}
