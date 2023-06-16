package IteratorsAndComparators.Exercise.P04Froggy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersInput = scanner.nextLine().split(", ");
        List<Integer> numbers = new ArrayList<>();
        for (String number : numbersInput) {
            numbers.add(Integer.parseInt(number));
        }

        Lake lake = new Lake(numbers);

        // Print frog jumps
        printFrogJumps(lake);
    }

    private static void printFrogJumps(Lake lake) {
        StringBuilder jumps = new StringBuilder();
        for (int number : lake) {
            jumps.append(number).append(", ");
        }
        jumps.delete(jumps.length() - 2, jumps.length()); // Remove trailing comma and space
        System.out.println(jumps);
    }
}
