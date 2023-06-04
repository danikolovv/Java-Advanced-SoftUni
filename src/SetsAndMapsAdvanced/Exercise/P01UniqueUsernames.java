package SetsAndMapsAdvanced.Exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Set<String> inputsSet = new LinkedHashSet<>();

        for (int i = 0; i < num; i++) {
            String input = scanner.nextLine();

            inputsSet.add(input);
        }

        inputsSet.forEach(System.out::println);
    }
}
