Import java.util.*;

abstract class Shape {
    abstract double area();
}
class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double area() {
        return 0.5 * base * height;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class ShapeMain {
    public static void pract5_1(String[] args) {
        Triangle triangle = new Triangle(5, 4);
        System.out.println("Area of Triangle: " + triangle.area());

        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Area of Rectangle: " + rectangle.area());

        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.area());
    }
}

