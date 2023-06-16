package Generics.Exercise.P08CustomListSorter;

import java.util.Scanner;

public class CommandInterpreter {
    public static void interpretCommands() {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];

            switch (command) {
                case "Add":
                    String element = commandParts[1];
                    customList.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandParts[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String containsElement = commandParts[1];
                    boolean contains = customList.contains(containsElement);
                    System.out.println(contains);
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String greaterElement = commandParts[1];
                    int countGreaterThan = customList.countGreaterThan(greaterElement);
                    System.out.println(countGreaterThan);
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
                case "Sort":
                    Sorter.sort(customList);
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
