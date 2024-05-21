import java.io.*;

public class RemoveString {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage: java RemoveStringFromFile <string_to_remove> <filename>");
            return;
        }
        String stringToRemove = args[0];
        String filename = args[1];

        try {
            File file = new File(filename);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(stringToRemove, "");
                stringBuilder.append(line).append("\n");
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(stringBuilder.toString());
            writer.close();

            System.out.println("Occurrences of '" + stringToRemove + "' removed from the file: " + filename);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
	
