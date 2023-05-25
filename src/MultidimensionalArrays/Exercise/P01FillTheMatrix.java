package MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            patternA(matrix);
            print(matrix);
        } else {
            patternB(matrix);
            print(matrix);
        }

//        pattern.equals("A") ? patternA(matrix) : patternB(matrix);

    }

    private static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] patternB(int[][] matrix) {

        int count = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 != 0){
                for (int row = matrix[col].length - 1; row >= 0; row--) {
                    matrix[row][col] = count++;
                }
            } else {
                for (int row = 0; row < matrix[col].length; row++) {
                    matrix[row][col] = count++;
                }
            }
        }
        return matrix;
    }

    private static int[][] patternA(int[][] matrix) {

        int count = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[col][row] = count++;
            }
        }
        return matrix;
    }


}
