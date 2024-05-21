import java.util.Scanner;

public class pract2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Find the length of the common prefix
        int commonLength = 0;
        //"apple" and "appe" hoi to minlength 4 thay
        int minLength = Math.min(str1.length(), str2.length());
        //0<4 && a==a ; 1<4 && p==p ; 2<4 && p==p;3<4 && l!=p etle execution  atki jase
        while (commonLength < minLength && str1.charAt(commonLength) == str2.charAt(commonLength)) 
        {
            commonLength++;
        }

        // Extract and display the common prefix
        //0 thi 3 sudhini string bnavse etle ke "app"
        String commonPrefix = str1.substring(0, commonLength);
        if (!commonPrefix.isEmpty()) {
            System.out.println("The largest common prefix is: " + commonPrefix);
        } else {
            System.out.println("There is no common prefix.");
        }
    }
}