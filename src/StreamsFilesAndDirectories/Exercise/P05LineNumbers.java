package StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class P05LineNumbers {
    public static void main(String[] args) {
        String inputPath = "...\\Resources\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\inputLineNumbers.txt";
        String outputPath = "...\\Exercise\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputPath)))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.println(lineNumber + ". " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
