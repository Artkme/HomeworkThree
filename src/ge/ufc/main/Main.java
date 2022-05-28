package ge.ufc.main;


import ge.ufc.rectangle.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        ge.ufc.anotherrectangle.Rectangle rectangle3 = new ge.ufc.anotherrectangle.Rectangle();
        ge.ufc.anotherrectangle.Rectangle rectangle4 = new ge.ufc.anotherrectangle.Rectangle();

        rectangle1.setLength(10);
        rectangle1.setWidth(15);

        rectangle2.setLength(44);
        rectangle2.setWidth(5);

        System.out.println("From ge.ufc.rectangle: " + rectangle1.moreThan(rectangle2));
        System.out.println("From ge.ufc.anotherrectangle: " + rectangle3.moreThan(rectangle3, rectangle4));

    }
}
