package StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int sum = 0;
        int operator = 1;

        for (String token : tokens) {
            if (token.equals("+")) {
                operator = 1;
            } else if (token.equals("-")) {
                operator = -1;
            } else {
                int num = Integer.parseInt(token);
                int result = operator * num;
                sum += result;
            }
        }

        System.out.println(sum);
    }
}
