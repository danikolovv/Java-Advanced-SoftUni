package IteratorsAndComparators.Exercise.P02Collection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandInterpreter commandInterpreter = new CommandInterpreter();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commands = input.split("\\s+");
            commandInterpreter.interpretCommands(commands);
            input = scanner.nextLine();
        }
    }
}
