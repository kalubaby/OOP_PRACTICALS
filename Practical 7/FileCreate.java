import java.io.*;
import java.util.*;

public class FileCreate {
    public static void main(String[] args) {
        String fileName = "Practical7.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int num = random.nextInt(200);
                writer.write(num + " ");
            }

            writer.close();

            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            String[] tokens = line.split(" ");

            List<Integer> numbers = new ArrayList<>();
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token));
            }

            reader.close();

            Collections.sort(numbers);

            System.out.println("Data in increasing order:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
