package SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> deckOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> deckTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));


        int rounds = 50;
        while (rounds-- > 0) {
            if (deckOne.isEmpty() || deckTwo.isEmpty()) {
                break;
            }

            Iterator<Integer> firstIterator = deckOne.iterator();
            int firstCard = firstIterator.next();
            firstIterator.remove();

            Iterator<Integer> secondIterator = deckTwo.iterator();
            int secondCard = secondIterator.next();
            secondIterator.remove();

            if (firstCard > secondCard) {

                deckOne.add(firstCard);
                deckOne.add(secondCard);

            } else if (firstCard < secondCard){
                deckTwo.add(firstCard);
                deckTwo.add(secondCard);

            }
        }

        String output = "Draw!";
        if (deckOne.size() < deckTwo.size()) {
            output = "Second player win!";
        } else if (deckOne.size() > deckTwo.size()) {
            output = "First player win!";
        }
        System.out.println(output);
    }
}
