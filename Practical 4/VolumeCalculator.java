import java.util.*;

 public class VolumeCalculator {

    public double volume(double side) {
        return side * side * side;
    }

    public double volume(double length, double width, double height) {
        return length * width * height;
    }

    
   public double volume(double radius, String shape) {
        if (shape.equalsIgnoreCase("sphere")) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        } else {
            System.out.println("Invalid shape. Volume calculation not supported for " + shape + ".");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        double cubeVolume = calculator.volume(5.0);
        System.out.println("Volume of cube with side 5.0: " + cubeVolume);

        double rectangularCubeVolume = calculator.volume(4.0, 6.0, 3.0);
        System.out.println("Volume of rectangular cube with length 4.0, width 6.0, and height 3.0: " + rectangularCubeVolume);

        double sphereVolume = calculator.volume(3.0, "sphere");
        System.out.println("Volume of sphere with radius 3.0: " + sphereVolume);
    }
}
