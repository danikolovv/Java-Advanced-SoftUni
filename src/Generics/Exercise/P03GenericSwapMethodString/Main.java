package Generics.Exercise.P03GenericSwapMethodString;

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

        String swapCommand = scanner.nextLine();
        String[] swapIndexes = swapCommand.split(" ");
        int index1 = Integer.parseInt(swapIndexes[0]);
        int index2 = Integer.parseInt(swapIndexes[1]);

        swapElements(elements, index1, index2);
        printElements(elements);
    }

    static <T> void swapElements(List<T> elements, int index1, int index2) {
        if (index1 < 0 || index1 >= elements.size() || index2 < 0 || index2 >= elements.size()) {
            return; // Invalid indexes, do nothing
        }

        T temp = elements.get(index1);
        elements.set(index1, elements.get(index2));
        elements.set(index2, temp);
    }

    static <T> void printElements(List<T> elements) {
        for (T element : elements) {
            System.out.println(element.getClass().getName() + ": " + element.toString());
        }
    }
}
