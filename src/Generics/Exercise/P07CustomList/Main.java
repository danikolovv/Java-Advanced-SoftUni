package Generics.Exercise.P07CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String commandType = tokens[0];

            switch (commandType) {
                case "Add":
                    String element = tokens[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(tokens[1]);
                    customList.remove(indexToRemove);
                    break;
                case "Contains":
                    String elementToCheck = tokens[1];
                    boolean contains = customList.contains(elementToCheck);
                    System.out.println(contains);
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String elementToCompare = tokens[1];
                    int count = customList.countGreaterThan(elementToCompare);
                    System.out.println(count);
                    break;
                case "Max":
                    String maxElement = customList.getMax();
                    System.out.println(maxElement);
                    break;
                case "Min":
                    String minElement = customList.getMin();
                    System.out.println(minElement);
                    break;
                case "Print":
                    customList.print();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
