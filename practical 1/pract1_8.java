import java.util.Scanner;

public class pract1_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to be withdrawn: ");
        int amount = scanner.nextInt();

        int[] denominations = {100, 50, 10, 5, 2, 1};
        int[] notesCount = new int[6];

        for (int i = 0; i < denominations.length; i++) {
            notesCount[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Currency notes distribution:");

        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " : " + notesCount[i] + " notes");
        }
 
    }
}
