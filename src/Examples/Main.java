package Examples;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(92);
        stack.push(81);
        stack.push(37);
        stack.push(45);
        stack.push(12);

//        while (!stack.isEmpty()) {
//            int topElement = stack.pop();
//            System.out.println(topElement);
//        }

        System.out.println(stack.peek());
    }
}