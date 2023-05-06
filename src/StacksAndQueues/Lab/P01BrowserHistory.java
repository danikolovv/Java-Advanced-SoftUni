package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P01BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<String> history = new ArrayDeque<>();

        String currentInput = scanner.nextLine();

        while (!currentInput.equals("Home")){
            if (currentInput.equals("back")) {
                if (history.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    history.pop();
                    System.out.println(history.peek());
                }
            } else {
                history.push(currentInput);
                System.out.println(history.peek());
            }

            currentInput = scanner.nextLine();
        }
    }
}
