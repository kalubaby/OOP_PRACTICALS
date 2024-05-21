import java.util.*;
class FirstArgumentException extends Exception {
    public FirstArgumentException(String message) {
        super(message);
    }
}

public class pract6_5 {
    public static void main(String[] args) {
        try {
  
            int firstArg = Integer.parseInt(args[0]);
            if (firstArg == 0) {
                throw new FirstArgumentException("First argument is 0");
            }
            
            System.out.println("First argument is not 0");
        } catch (FirstArgumentException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}
