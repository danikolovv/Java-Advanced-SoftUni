package StreamsFilesAndDirectories.Exercise;

import java.io.*;
import java.util.*;

public class P06WordCount {
    public static void main(String[] args) {
        String wordsFilePath = "location\\words.txt";
        String textFilePath = "location\\text.txt";
        String resultsFilePath = "location\\results.txt";

        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader wordsReader = new BufferedReader(new FileReader(wordsFilePath));
             BufferedReader textReader = new BufferedReader(new FileReader(textFilePath));
             PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(resultsFilePath)))) {

            String line;
            while ((line = wordsReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordCountMap.put(word.toLowerCase(), 0);
                }
            }

            while ((line = textReader.readLine()) != null) {
                String[] words = line.split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    String lowercaseWord = word.toLowerCase();
                    if (wordCountMap.containsKey(lowercaseWord)) {
                        int count = wordCountMap.get(lowercaseWord);
                        wordCountMap.put(lowercaseWord, count + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
            sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            for (Map.Entry<String, Integer> entry : sortedEntries) {
                writer.println(entry.getKey() + " - " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
