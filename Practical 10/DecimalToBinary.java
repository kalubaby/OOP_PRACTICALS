import java.util.*;
public class DecimalToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        System.out.println("Binary equivalent: " + dec2Bin(decimal));
        scanner.close();
    }

    public static String dec2Bin(int value) {
        if (value == 0) {
            return "0";
        } else if (value == 1) {
            return "0001";
        } else {
            return dec2Bin(value / 2) + (value % 2);
        }
    }
}
