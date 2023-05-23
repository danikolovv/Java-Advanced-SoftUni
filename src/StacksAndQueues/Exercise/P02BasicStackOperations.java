package StacksAndQueues.Exercise;

import java.util.*;

public class P02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(numbers[0]);
        int s = Integer.parseInt(numbers[1]);
        int x = Integer.parseInt(numbers[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println(0);
        } else if (stack.contains(x)){
            System.out.println(true);
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
