package FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> prices = Arrays.stream(scanner.nextLine().split(", "))
                                .map(Double::parseDouble)
                                .collect(Collectors.toList());

        UnaryOperator<Double> addVat = price -> price * 1.2;

        System.out.println("Prices with VAT:");
        prices.forEach(price -> System.out.printf("%.2f%n", addVat.apply(price)));
    }
}
