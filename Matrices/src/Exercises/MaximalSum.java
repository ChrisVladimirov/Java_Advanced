package Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = readArray(scanner.nextLine(), "\\s+");
        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] matrix = readMatrix(rows, columns, scanner, "\\s+");

        int maxSum = 0;
        System.out.println(findTheMatrix(matrix, maxSum));
    }

    private static String findTheMatrix(int[][] matrix, int maxSum) {
        int sum;
        String bestMatrix = "";
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int column = 0; column < matrix[row].length - 2; column++) {
                sum = 0;
                int el1 = 0; int el4 = 0; int el7 = 0;
                int el2 = 0; int el5 = 0; int el8 = 0;
                int el3 = 0; int el6 = 0; int el9 = 0;

                if (isInBounds(row, column, matrix)) {
                    el1 = matrix[row][column];
                    sum += matrix[row][column];
                }

                if (isInBounds(row, column + 1, matrix)) {
                    el2 = matrix[row][column + 1];
                    sum += el2;
                }

                if (isInBounds(row, column + 2, matrix)) {
                    el3 = matrix[row][column + 2];
                    sum += el3;
                }

                if (isInBounds(row + 1, column, matrix)) {
                    el4 = matrix[row + 1][column];
                    sum += el4;
                }

                if (isInBounds(row + 1, column + 1, matrix)) {
                    el5 = matrix[row + 1][column + 1];
                    sum += el5;
                }

                if (isInBounds(row + 1, column + 2, matrix)) {
                    el6 = matrix[row + 1][column + 2];
                    sum += el6;
                }

                if (isInBounds(row + 2, column, matrix)) {
                    el7 = matrix[row + 2][column];
                    sum += el7;
                }

                if (isInBounds(row + 2, column + 1, matrix)) {
                    el8 = matrix[row + 2][column + 1];
                    sum += el8;
                }

                if (isInBounds(row + 2, column + 2, matrix)) {
                    el9 = matrix[row + 2][column + 2];
                    sum += el9;
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    bestMatrix = String.format("%d %d %d%n%d %d %d%n%d %d %d", el1, el2, el3, el4, el5, el6, el7, el8, el9);
                }
            }
        }
        //return "Sum = " + maxSum + "\n" + bestMatrix;
        return String.format("Sum = %d%n%s",maxSum, bestMatrix);
    }

    public static int[][] readMatrix(int rows, int columns, Scanner scanner, String pattern) {
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine(), pattern);
        }
        return matrix;
    }

    private static int[] readArray(String line, String pattern) {
        return Arrays.stream(line.split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static boolean isInBounds(int row, int column, int[][] matrix) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length;
    }
}
