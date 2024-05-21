import java.util.Scanner;

public class pract2_4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter elements of the first 3x3 array:");
        int[][] array1 = readArray(scanner);
        
        // Input for the second array
        System.out.println("Enter elements of the second 3x3 array:");
        int[][] array2 = readArray(scanner);
        
        // Prompt user for operation choice
        System.out.println("Choose the operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                int[][] sum = addArrays(array1, array2);
                printArray(sum);
                break;
            case 2:
                int[][] difference = subtractArrays(array1, array2);
                printArray(difference);
                break;
            case 3:
                int[][] product = multiplyArrays(array1, array2);
                printArray(product);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
    
    // Method to read a 3x3 array from user input
    public static int[][] readArray(Scanner scanner) {
        int[][] array = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        return array;
    }
    
    // Method to add two 3x3 arrays
    public static int[][] addArrays(int[][] array1, int[][] array2) {
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return sum;
    }
    
    // Method to subtract two 3x3 arrays
    public static int[][] subtractArrays(int[][] array1, int[][] array2) {
        int[][] difference = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                difference[i][j] = array1[i][j] - array2[i][j];
            }
        }
        return difference;
    }
    
    // Method to multiply two 3x3 arrays
    public static int[][] multiplyArrays(int[][] array1, int[][] array2) {
        int[][] product = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    product[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return product;
    }
    
    // Method to print a 3x3 array
    public static void printArray(int[][] array) {
        System.out.println("Result:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}