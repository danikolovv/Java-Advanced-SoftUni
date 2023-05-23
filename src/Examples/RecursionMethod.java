package Examples;

import java.util.Scanner;

public class RecursionMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        a(1);
    }

    private static void a (int num) {
        System.out.println(num);
        num++;
        if (num == 10) {
            return;
        }

        a(num);
    }
}
