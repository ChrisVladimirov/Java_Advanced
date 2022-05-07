package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(rows, 0, scanner, "\\s+");

        int[] coordinates = readArray(scanner.nextLine(), "\\s+");
        int wrongValue = matrix[coordinates[0]][coordinates[1]];

        List<int[]> updatedValues = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == wrongValue) {
                    updatedValues
                            .add(new int[]{row, column, getClosestElementsSum(row, column, matrix, wrongValue)});
                }
            }
        }

        for (int[] updatedValue : updatedValues) {
            matrix[updatedValue[0]][updatedValue[1]] = updatedValue[2];
        }
        printMatrix(matrix);
    }

    private static int getClosestElementsSum(int row, int column, int[][] matrix, int wrongValue) {
        int sum = 0;

        if (isInBounds(row, column + 1, matrix) && matrix[row][column + 1] != wrongValue) {
            sum += matrix[row][column + 1];
        }
        if (isInBounds(row, column - 1, matrix) && matrix[row][column - 1] != wrongValue) {
            sum += matrix[row][column - 1];
        }
        if (isInBounds(row + 1, column, matrix) && matrix[row + 1][column] != wrongValue) {
            sum += matrix[row + 1][column];
        }
        if (isInBounds(row - 1, column, matrix) && matrix[row - 1][column] != wrongValue) {
            sum += matrix[row - 1][column];
        }

        return sum;
    }

    private static boolean isInBounds(int row, int column, int[][] matrix) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length;
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

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
