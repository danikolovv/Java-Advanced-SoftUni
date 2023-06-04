package SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String[] inputs = input.split("-");

            String name = inputs[0];
            String number = inputs[1];

            phonebook.put(name, number);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                String phoneNumber = phonebook.get(input);
                System.out.printf("%s -> %s%n", input, phoneNumber);
            } else {
                System.out.printf("Contact %s does not exist.%n", input);
            }

            input = scanner.nextLine();
        }


//        while (!input.equals("stop")) {
//            String finalInput = input;
//            phonebook.forEach((k, v) -> {
//                if (phonebook.containsKey(finalInput)) {
//                    String phoneNumber = phonebook.get(finalInput);
//
//                    System.out.printf("%s -> %s", finalInput, phoneNumber);
//                } else {
//                    System.out.printf("Contact %s does not exist.%n", finalInput);
//                }
//            });
//
//            input = scanner.nextLine();
//        }

    }
}
