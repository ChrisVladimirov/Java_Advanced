package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = readArray(scanner.nextLine(), ", ");
        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] matrix = readMatrix(rows, columns, scanner, ", ");

        int maxSum = 0;
        int bestRow = 0;
        int bestColumn = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[row].length - 1; column++) {
                int el1 = matrix[row][column];
                int el2 = matrix[row][column + 1];
                int el3 = matrix[row + 1][column];
                int el4 = matrix[row + 1][column + 1];

                int sum = el1 + el2 + el3 + el4;
                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = row;
                    bestColumn = column;
                }
            }
        }
        System.out.print(matrix[bestRow][bestColumn] + " ");
        System.out.println(matrix[bestRow][bestColumn + 1]);
        System.out.print(matrix[bestRow + 1][bestColumn] + " ");
        System.out.println(matrix[bestRow + 1][bestColumn + 1]);
        System.out.println(maxSum);
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
}
