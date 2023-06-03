package SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> guests = new TreeSet<>();
        Set<String> coming = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("PARTY")) {

            if (input.length() == 8) {
                guests.add(input);
            }

            input = scanner.nextLine();
        }

        while (!input.equals("END")) {

            guests.remove(input);
            coming.add(input);

            input = scanner.nextLine();
        }

        System.out.println(guests.size());

        for (String guest : guests) {
            System.out.println(guest);
        }

    }
}
