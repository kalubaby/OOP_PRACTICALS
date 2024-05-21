import java.util.Scanner;

public class pract1_9 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int originalNumber = scanner.nextInt();

        // Check if the input is a five-digit number
        if (isValid(originalNumber)) {
            // Process each digit and add 1
            int newNumber = 0;
            int multiplier = 1;

            while (originalNumber > 0) {
                int digit = (originalNumber % 10) + 1;
                newNumber += digit * multiplier;
                originalNumber /= 10;
                multiplier *= 10;
            }

            // Display the result
            System.out.println("New number: " + newNumber);
        } else {
            System.out.println("Invalid input. Please enter a five-digit number.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Helper method to check if the input is a five-digit number
    private static boolean isValid(int number) {
        String strNumber = Integer.toString(number);
        return strNumber.length() == 5;
    }
}
