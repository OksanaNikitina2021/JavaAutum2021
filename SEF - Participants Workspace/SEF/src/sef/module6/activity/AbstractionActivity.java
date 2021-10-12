package sef.module6.activity;

public class AbstractionActivity {

    public static void main(String[] args) {
        Shape square = new Square(5);

        System.out.println("--- Print the information for square ---");
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Perimeter of Square: " + square.calculatePerimeter());

        square.setColor("Black");
        System.out.println("Square color: " + square.getColor());

        Shape rectangle = new Rectangle(5, 6);

        System.out.println("--- Print the information for rectangle ---");
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());

        rectangle.setColor("Orange");
        System.out.println("Rectangle color: " + rectangle.getColor());
    }
}
