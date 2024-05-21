import java.util.*;

 public class AreaCalculator {
  
    public double area(double side) {
        return side * side;
    }

    public double area(double length, double width) {
        return length * width;
    }

    public double area(double base, double height, String shape) {
            return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        double squareArea = calculator.area(5.0);
        System.out.println("Area of square with side 5.0: " + squareArea);

        double rectangleArea = calculator.area(4.0, 6.0);
        System.out.println("Area of rectangle with length 4.0 and width 6.0: " + rectangleArea);

        double triangleArea = calculator.area(3.0, 4.0, "triangle");
        System.out.println("Area of triangle with base 3.0 and height 4.0: " + triangleArea);
    }
}
