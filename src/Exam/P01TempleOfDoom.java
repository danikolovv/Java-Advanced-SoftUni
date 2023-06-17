package Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P01TempleOfDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> tools = parseIntegerList(scanner.nextLine());
        List<Integer> substances = parseIntegerList(scanner.nextLine());
        List<Integer> challenges = parseIntegerList(scanner.nextLine());

        while (!challenges.isEmpty()) {
            int tool = tools.get(0);
            int substance = substances.get(substances.size() - 1);
            int result = tool * substance;

            if (challenges.contains(result)) {
                challenges.remove(Integer.valueOf(result));
                tools.remove(0);
                substances.remove(substances.size() - 1);
            } else {
                tool++;
                substance--;
                if (substance == 0) {
                    substances.remove(substances.size() - 1);
                } else {
                    substances.set(substances.size() - 1, substance);
                }
                tools.remove(0);
                tools.add(tool);
            }

            if (substances.isEmpty() && !challenges.isEmpty()) {
                System.out.println("Harry is lost in the temple. Oblivion awaits him.");
                printList("Tools", tools);
                if (!substances.isEmpty()) {
                    printList("Substances", substances);
                }
                printList("Challenges", challenges);
                return;
            }
        }

        System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        printList("Tools", tools);
        if (!substances.isEmpty()) {
            printList("Substances", substances);
        }
        printList("Challenges", challenges);
    }

    private static List<Integer> parseIntegerList(String input) {
        List<Integer> list = new ArrayList<>();
        Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .forEach(list::add);
        return list;
    }

    private static void printList(String title, List<Integer> list) {
        if (list.isEmpty()) {
            return;
        }
        System.out.print(title + ": ");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println(list.get(list.size() - 1));
    }
}
