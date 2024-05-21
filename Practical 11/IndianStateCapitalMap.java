import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndianStateCapitalMap {

    public static void main(String[] args) {
        
        Map<String, String> stateCapitalMap = new HashMap<>();

        stateCapitalMap.put("Gujarat", "Gandhinagar");
        stateCapitalMap.put("Himachal Pradesh", "Shimla");
        stateCapitalMap.put("Jharkhand", "Ranchi");
        stateCapitalMap.put("Karnataka", "Bengaluru");
        stateCapitalMap.put("Kerala", "Thiruvananthapuram");
        stateCapitalMap.put("Madhya Pradesh", "Bhopal");
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Punjab", "Chandigarh");
        stateCapitalMap.put("Rajasthan", "Jaipur")
        stateCapitalMap.put("West Bengal", "Kolkata");

        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a state of India: ");
        String state = scanner.nextLine();

        
        String capital = stateCapitalMap.get(state);

        if (capital != null) {
            System.out.println("The capital of " + state + " is " + capital);
        } else {
            System.out.println("Capital not found for the entered state.");
        }

        
    }
}
