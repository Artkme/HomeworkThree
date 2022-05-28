package ge.ufc.anotherrectangle;

public class Rectangle {
    private double length;
    private double width;

    protected double perimeter() {
        return 2 * (length + width);
    }

    public int moreThan(Rectangle rectOne, Rectangle rectTwo) {
        return (int) Math.signum(rectOne.perimeter() - rectTwo.perimeter());
    }
}
