import java.util.Scanner;
  public class pract2_8 
  {
     public static boolean isValidPassword(String password) 
      {
        // Rule 1: Password must have at least eight characters
        if (password.length() < 8) 
            return false;
        
        // Rule 2: Password consists of only letters and digits
        for (char ch : password.toCharArray()) 
        {
            if (!Character.isLetterOrDigit(ch)) 
                return false;
        }
        
        // Rule 3: Password must contain at least two digits
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        // Check if the entered password is valid
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
            System.out.println("enter valid password and its length should be 8 or it only contains letters and digits or it should contain at least 2 digits");
        }
    }
}