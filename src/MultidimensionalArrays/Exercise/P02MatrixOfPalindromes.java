package MultidimensionalArrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = new String[input[0]][input[1]];

        generate(matrix);
        print(matrix);
    }

    private static void print(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void generate(String[][] matrix) {

        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                char outerletter = (char) ('a' + row);
                char middleLetter = (char) ('a' + row + col);
                matrix[row][col] = "" + outerletter + middleLetter + outerletter;
            }
        }
    }
}
