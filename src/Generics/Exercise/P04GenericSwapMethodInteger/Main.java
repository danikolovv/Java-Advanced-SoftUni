package Generics.Exercise.P04GenericSwapMethodInteger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Generics.Exercise.P04GenericSwapMethodInteger.PrintUtil.printElements;
import static Generics.Exercise.P04GenericSwapMethodInteger.SwapUtil.swapElements;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int element = Integer.parseInt(scanner.nextLine());
            elements.add(element);
        }

        String swapCommand = scanner.nextLine();
        String[] swapIndexes = swapCommand.split(" ");
        int index1 = Integer.parseInt(swapIndexes[0]);
        int index2 = Integer.parseInt(swapIndexes[1]);

        swapElements(elements, index1, index2);
        printElements(elements);
    }
}
