package IteratorsAndComparators.Exercise.P02Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandInterpreter {
    private ListyIterator listyIterator;

    public void interpretCommands(String[] commands) {
        String command = commands[0];

        switch (command) {
            case "Create":
                List<String> elements = new ArrayList<>();
                if (commands.length > 1) {
                    elements = Arrays.asList(commands).subList(1, commands.length);
                }
                listyIterator = new ListyIterator(elements);
                break;
            case "Move":
                boolean moveResult = listyIterator.move();
                System.out.println(moveResult);
                break;
            case "HasNext":
                boolean hasNextResult = listyIterator.hasNext();
                System.out.println(hasNextResult);
                break;
            case "Print":
                try {
                    listyIterator.print();
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "PrintAll":
                listyIterator.printAll();
                break;
            case "END":
                break;
        }
    }
}
