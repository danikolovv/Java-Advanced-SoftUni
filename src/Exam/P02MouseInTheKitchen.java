package Exam;

import java.util.Scanner;

public class P02MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split(",");
        int rows = Integer.parseInt(dimensions[0].trim());
        int cols = Integer.parseInt(dimensions[1].trim());

        char[][] cupboard = new char[rows][cols];
        int mouseRow = -1;
        int mouseCol = -1;
        int cheeseCount = 0;

        for (int i = 0; i < rows; i++) {
            String row = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                cupboard[i][j] = row.charAt(j);
                if (cupboard[i][j] == 'M') {
                    mouseRow = i;
                    mouseCol = j;
                } else if (cupboard[i][j] == 'C') {
                    cheeseCount++;
                }
            }
        }

        boolean trapped = false;
        boolean allCheeseEaten = false;
        boolean dangerCommandReceived = false;

        while (true) {
            String direction = scanner.nextLine();
            if (direction.equals("danger")) {
                dangerCommandReceived = true;
                break;
            }

            int newRow = mouseRow;
            int newCol = mouseCol;

            switch (direction) {
                case "up":
                    newRow--;
                    break;
                case "down":
                    newRow++;
                    break;
                case "left":
                    newCol--;
                    break;
                case "right":
                    newCol++;
                    break;
            }

            if (!isValidPosition(newRow, newCol, rows, cols)) {
                break;
            }

            char newPosition = cupboard[newRow][newCol];

            if (newPosition == '@') {
                continue; // Wall, skip this move
            } else if (newPosition == 'C') {
                cheeseCount--;
                cupboard[mouseRow][mouseCol] = '*';
                cupboard[newRow][newCol] = 'M';
                mouseRow = newRow;
                mouseCol = newCol;

                if (cheeseCount == 0) {
                    allCheeseEaten = true;
                    break;
                }
            } else if (newPosition == 'T') {
                trapped = true;
                cupboard[mouseRow][mouseCol] = '*';
                cupboard[newRow][newCol] = 'M';
                break;
            } else {
                cupboard[mouseRow][mouseCol] = '*';
                cupboard[newRow][newCol] = 'M';
                mouseRow = newRow;
                mouseCol = newCol;
            }
        }

        if (trapped) {
            System.out.println("Mouse is trapped!");
        } else if (allCheeseEaten) {
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        } else if (dangerCommandReceived) {
            System.out.println("Mouse will come back later!");
        } else {
            System.out.println("No more cheese for tonight!");
        }

        printCupboard(cupboard);
    }

    private static boolean isValidPosition(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private static void printCupboard(char[][] cupboard) {
        for (char[] row : cupboard) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
