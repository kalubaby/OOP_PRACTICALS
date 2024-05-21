import java.io.*;

public class FileCount {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileStatistics <filename>");
            return;
        }

        String filename = args[0];

        try {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;

                lineCount++;
            }

            bufferedReader.close();

            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
