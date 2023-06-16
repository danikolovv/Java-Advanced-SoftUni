package StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class P01SumLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Kaloyan\\Desktop\\java-advanced\\src\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try (
                FileReader fileReader = new FileReader(path)) {
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                char[] chars = line.toCharArray();
                long sum = 0;
                for (char c : chars) {
                    sum += c;
                }
                System.out.println(sum);
            }


        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
