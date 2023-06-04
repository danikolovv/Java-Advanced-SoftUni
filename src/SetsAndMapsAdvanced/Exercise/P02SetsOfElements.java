package SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputs = scanner.nextLine().split("\\s+");

        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);

        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < N; i++) {
            String firstRow = scanner.nextLine();
            firstSet.add(firstRow);
        }

        for (int i = 0; i < M; i++) {
            String secondRow = scanner.nextLine();
            secondSet.add(secondRow);
        }

        firstSet.retainAll(secondSet);
        System.out.println(String.join(" ", firstSet));

    }
}
