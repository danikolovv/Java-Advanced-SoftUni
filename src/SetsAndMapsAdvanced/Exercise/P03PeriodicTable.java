package SetsAndMapsAdvanced.Exercise;

import java.util.*;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Set<String> stringSet = new TreeSet<>();

        for (int i = 0; i < number; i++) {
            String[] inputs = scanner.nextLine().split("\\s+");

            Collections.addAll(stringSet, inputs);
        }

        System.out.println(String.join(" ", stringSet));
    }
}
