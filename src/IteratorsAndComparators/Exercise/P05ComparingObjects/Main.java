package IteratorsAndComparators.Exercise.P05ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] personData = input.split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            String town = personData[2];
            Person person = new Person(name, age, town);
            people.add(person);
            input = scanner.nextLine();
        }

        int personIndex = scanner.nextInt();
        Person selectedPerson = people.get(personIndex - 1);

        int equalCount = 0;
        int notEqualCount = 0;
        for (Person person : people) {
            if (person.compareTo(selectedPerson) == 0) {
                equalCount++;
            } else {
                notEqualCount++;
            }
        }

        if (equalCount > 1) {
            System.out.printf("%d %d %d%n", equalCount, notEqualCount, people.size());
        } else {
            System.out.println("No matches");
        }
    }
}
