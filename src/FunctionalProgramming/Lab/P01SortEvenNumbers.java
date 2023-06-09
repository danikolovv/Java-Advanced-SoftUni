package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                                .split(", "))
                                .map(Integer::parseInt)
                                .filter(n -> n % 2 == 0)
                                .collect(Collectors.toList());

        String replace = numbers.toString().replace("[", "").replace("]", "");
        System.out.println(String.join(", ", replace));

        Collections.sort(numbers);

        System.out.println(String.join(", ", replace));
    }
}
