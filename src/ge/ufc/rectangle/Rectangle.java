package ge.ufc.rectangle;

public class Rectangle {
    private double length;
    private double width;

    double perimeter() {
        return 2 * (length + width);
    }

    double area() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public int moreThan(Rectangle other) {
        return (int) Math.signum(this.area() - other.area());
    }
}
