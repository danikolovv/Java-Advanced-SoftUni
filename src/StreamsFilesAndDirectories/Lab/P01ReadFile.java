package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P01ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dani\\IdeaProjects\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\Resources\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {
            System.out.print(Integer.toBinaryString(currentByte) + " ");
            currentByte = inputStream.read();
        }

        inputStream.close();
    }
}
