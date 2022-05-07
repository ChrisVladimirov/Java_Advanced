package Exercises;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = (scanner.nextLine().split("\\s+"));
        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        String[][] matrix = readMatrix(rows, columns, scanner, "\\s+");

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("\\s+");
            String id = tokens[0];
            if (id.equals("swap")) {
                swapCoordinates(matrix, tokens);
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine();
        }
    }

    private static void swapCoordinates(String[][] matrix, String[] tokens) {
        String temp = "";
        if (tokens.length == 5) {
            //swap 0 0 1 1
            int firstR = Integer.parseInt((tokens[1]));
            int firstC = Integer.parseInt((tokens[2]));

            int secondR = Integer.parseInt((tokens[3]));
            int secondC = Integer.parseInt((tokens[4]));

            if (isInBounds(firstR, firstC, matrix)) {
                temp = temp.concat(matrix[firstR][firstC]);
                if (!isInBounds(secondR, secondC, matrix)) {
                    System.out.println("Invalid input!");
                } else {
                    matrix[firstR][firstC] = matrix[secondR][secondC];
                    matrix[secondR][secondC] = temp;
                    printMatrix(matrix);
                }
            } else {
                System.out.println("Invalid input!");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] arr : matrix) {
            for (String element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static String[] readArray(String line, String pattern) {
        return (line.split(pattern));
    }

    public static String[][] readMatrix(int rows, int columns, Scanner scanner, String pattern) {
        String[][] matrix = new String[rows][columns];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine(), pattern);
        }
        return matrix;
    }

    private static boolean isInBounds(int row, int column, String[][] matrix) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length;
    }
}