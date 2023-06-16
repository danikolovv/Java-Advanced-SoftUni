package StreamsFilesAndDirectories.Exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class P02SumBytes {
    public static void main(String[] args) {
        String path = "...\\Resources\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            BigInteger sum = BigInteger.ZERO;
            while ((line = reader.readLine()) != null) {
                line = line.trim(); // Remove leading and trailing whitespace
                for (char ch : line.toCharArray()) {
                    sum = sum.add(BigInteger.valueOf((int) ch));
                }
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
