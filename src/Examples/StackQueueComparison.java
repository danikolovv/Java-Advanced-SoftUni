package Examples;

import java.util.ArrayDeque;
import java.util.Scanner;

public class StackQueueComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println("===");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
