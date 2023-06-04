package SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        Map<Character, Integer> characterIntegerMap = new TreeMap<>();

        for (char c : input) {

            if (!characterIntegerMap.containsKey(c)){
                characterIntegerMap.put(c, 1);
            } else {
                characterIntegerMap.put(c, characterIntegerMap.get(c) + 1);
            }

        }

        characterIntegerMap.forEach((k, v) -> System.out.printf("%c: %d time/s%n", k, v));
    }
}
