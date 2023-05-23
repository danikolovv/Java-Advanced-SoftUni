package StacksAndQueues.Exercise;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int number : numbers){
            stack.push(number);
        }

        for (Integer integer : stack) {
            System.out.print(stack.pop() + " ");
        }

//        while (!stack.isEmpty()){
//            System.out.print(stack.pop() + " ");
//        }
    }
}
