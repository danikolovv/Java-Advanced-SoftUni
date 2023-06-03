package Examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleOfMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> population = new HashMap<>();

        population.put("Sofia", 1200000);
        population.put("Plovdiv", 700000);
        population.put("Varna", 600000);
        population.put("Burgas", 500000);

        System.out.println(population.get("Sofia"));

        System.out.println("===");

        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        population.clear();

        population.putIfAbsent(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));

        for (Map.Entry<String, Integer> entry : population.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
