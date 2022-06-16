package shapes;

public class Circle {

private double radius;

    public Circle(double radius){
    this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
    return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference(){
        return Math.PI * 2 * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public static void main(String[] args) {





    }
}
