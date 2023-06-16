package FunctionalProgramming.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P09ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] sequence = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            boolean divisible = true;

            for (String s : sequence) {
                int divisor = Integer.parseInt(s);
                Predicate<Integer> isDivisible = num -> num % divisor == 0;

                if (!isDivisible.test(i)) {
                    divisible = false;
                    break;
                }
            }

            if (divisible) {
                numbers.add(i);
            }
        }

        // Print the numbers separated by spaces
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i < numbers.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
