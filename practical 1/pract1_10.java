import java.util.Scanner;

public class pract1_10 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input lengths of three sides
        System.out.print("Enter the length of side A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter the length of side C: ");
        double sideC = scanner.nextDouble();

        // Check if the input sides can form a triangle
        if (isValidTriangle(sideA, sideB, sideC)) {
            // Calculate the semi-perimeter
            double semiPerimeter = (sideA + sideB + sideC) / 2;

            // Calculate the area using Heron's formula
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

            // Display the result
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid input. The given side lengths cannot form a triangle.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Helper method to check if the given side lengths can form a triangle
    private static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
