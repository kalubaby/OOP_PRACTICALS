import java.util.*;
public class pract6_4 {
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;
        int count = 0;

        for (String value : values) {
            if (value == null) {
                throw new NullPointerException("Array element is null");
            }
            try {
                double num = Double.parseDouble(value);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Incorrectly formatted element: " + value);
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        return sum / count;
    }

    public static void main(String[] args) {
        String[] values = {"10", "20", "30", null, "40"};
        
        try {
            double avg = average(values);
            System.out.println("Average: " + avg);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
