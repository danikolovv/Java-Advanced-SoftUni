package StreamsFilesAndDirectories.Exercise;

import java.io.*;

public class P07MergeTwoFiles {
    public static void main(String[] args) {
        String inputOneFilePath = "location\\inputOne.txt";
        String inputTwoFilePath = "location\\inputTwo.txt";
        String outputFilePath = "location\\output.txt";

        try (BufferedReader inputOneReader = new BufferedReader(new FileReader(inputOneFilePath));
             BufferedReader inputTwoReader = new BufferedReader(new FileReader(inputTwoFilePath));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(outputFilePath)))) {

            String line;
            while ((line = inputOneReader.readLine()) != null) {
                writer.println(line);
            }

            while ((line = inputTwoReader.readLine()) != null) {
                writer.println(line);
            }

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
