package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03CountUppercaseWordsSecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> isUppercase = word -> Character.isUpperCase(word.charAt(0));
        words = words.stream().filter(isUppercase).collect(Collectors.toList());

        System.out.println(words.size());
        System.out.println(String.join("\n", words));
    }
}
