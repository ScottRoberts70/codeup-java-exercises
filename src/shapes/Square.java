package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength() {
     this.length = length;
     this.width = length;
    }

    @Override
    public void setWidth() {
    this.width = width;
    this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }
}

