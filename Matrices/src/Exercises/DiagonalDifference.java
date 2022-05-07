package Exercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        fillMatrix(scanner, matrix, n);
        int sum1 = sumPrimaryDiagonal(matrix, n);
        int sum2 = sumSecondaryDiagonal(matrix, n);
        System.out.println(Math.abs(sum1 - sum2));
    }

    private static int sumSecondaryDiagonal(int[][] matrix, int n) {
        int sum = 0;
        for (int row = 0; row < n; row++) {
            sum += matrix[row][n - 1 - row];
        }
        return sum;
    }

    private static int sumPrimaryDiagonal(int[][] matrix, int size) {
        int sum = 0;
        for (int row = 0; row < size; row++) {
            sum += matrix[row][row];
        }
        return sum;
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}
