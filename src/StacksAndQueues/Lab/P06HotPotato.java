package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class P06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = scanner.nextInt();

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String name : names){
            queue.offer(name);
        }

        while (queue.size() > 1){
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }
            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last " + queue.poll());
    }
}
