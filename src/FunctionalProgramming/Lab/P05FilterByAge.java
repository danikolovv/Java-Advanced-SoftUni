package FunctionalProgramming.Lab;

import java.util.Scanner;

public class P05FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String condition = scanner.nextLine();
            int ageInteger = Integer.parseInt(scanner.nextLine());
            String format = scanner.nextLine();

            
        }
    }
}
