package Generics.Exercise.P06GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Double> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            double element = Double.parseDouble(scanner.nextLine());
            elements.add(element);
        }

        double compareValue = Double.parseDouble(scanner.nextLine());
        int count = CountUtil.countGreaterThan(elements, compareValue);
        System.out.println(count);
    }
}
