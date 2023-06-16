package Generics.Exercise.P05GenericCountMethodString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            elements.add(element);
        }

        String compareValue = scanner.nextLine();
        int count = CountUtil.countGreaterThan(elements, compareValue);
        System.out.println(count);
    }
}
