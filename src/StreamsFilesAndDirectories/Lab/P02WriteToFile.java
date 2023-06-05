package StreamsFilesAndDirectories.Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02WriteToFile {
    public static void main(String[] args) throws IOException {
        String pathRead = "C:\\Users\\Dani\\IdeaProjects\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\Resources\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        String pathWrite = "C:\\Users\\Dani\\IdeaProjects\\JavaAdvanced\\src\\StreamsFilesAndDirectories\\Resources\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\outputP02WriteToFile.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        int currentByte = inputStream.read();
        while (currentByte >= 0) {
            char currentSymbol = (char) currentByte;
            if (currentSymbol != '.' && currentSymbol != ',' && currentSymbol != '!' && currentSymbol != '?') {
                outputStream.write(currentSymbol);
            }

            currentByte = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}
