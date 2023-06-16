package IteratorsAndComparators.Exercise.P06StrategyPattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<Person> nameSortedSet = new TreeSet<>(new NameComparator());
        Set<Person> ageSortedSet = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < n; i++) {
            String[] personData = scanner.nextLine().split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            Person person = new Person(name, age);
            nameSortedSet.add(person);
            ageSortedSet.add(person);
        }

        printSet(nameSortedSet);
        printSet(ageSortedSet);
    }

    private static void printSet(Set<Person> set) {
        for (Person person : set) {
            System.out.println(person);
        }
    }
}
