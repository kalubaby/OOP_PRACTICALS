import java.util.Scanner;

class Shape {
    protected double dimension1;
    protected double dimension2;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dimension 1:");
        dimension1 = scanner.nextDouble();
        System.out.print("Enter dimension 2:");
        dimension2 = scanner.nextDouble();
    }

    public void displayArea() {
        System.out.println("Area: " + computeArea());
    }

    public double computeArea() {
        return 0.0;
    }
}

class Triangle extends Shape {

    public double computeArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

class Rectangle extends Shape {

    public double computeArea() {
        return dimension1 * dimension2;
    }
}


public class ShapeArea {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter dimensions for Triangle:");
        triangle.getData();
        System.out.print("Area of Triangle: ");
        triangle.displayArea();

        System.out.println("Enter dimensions for Rectangle:");
        rectangle.getData();
        System.out.print("Area of Rectangle: ");
        rectangle.displayArea();
    }
}
