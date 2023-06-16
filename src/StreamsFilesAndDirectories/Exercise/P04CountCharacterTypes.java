package StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class P04CountCharacterTypes {
    public static void main(String[] args) {
        String inputPath = "...\\Resources\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "...\\Exercise\\output.txt";

        int vowelsCount = 0;
        int symbolsCount = 0;
        int punctuationCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputPath)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char ch : line.toCharArray()) {
                    if (Character.isLetter(ch)) {
                        ch = Character.toLowerCase(ch);
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                            vowelsCount++;
                        } else {
                            symbolsCount++;
                        }
                    } else if (ch == '!' || ch == ',' || ch == '.' || ch == '?') {
                        punctuationCount++;
                    }
                }
            }

            writer.println("Vowels: " + vowelsCount);
            writer.println("Other symbols: " + symbolsCount);
            writer.println("Punctuation: " + punctuationCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
