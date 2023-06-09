package FunctionalProgramming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class P03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        List<String> storage = new ArrayList<>();
        for (String word : words) {
            Predicate<String> firstLetter = letter -> Character.isUpperCase(letter.charAt(0));

            boolean check = firstLetter.test(word);
            if (check) {
                storage.add(word);
            }
        }
        System.out.println(storage.size());
        storage.forEach(System.out::println);
    }
}
