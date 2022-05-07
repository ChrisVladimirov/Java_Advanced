package Exercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tokens = input.split(", ");
        int N = Integer.parseInt(tokens[0]);
        String type = tokens[1];

        int[][] matrix = new int[N][N];

        printMatrix(type.equals("A") ? fillPatternA(matrix, N) : fillPatternB(matrix, N));
    }

    private static int[][] fillPatternB(int[][] matrix, int n) {
        int startNumber = 1;
        for (int column = 0; column < n; column++) {
            if (column % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    matrix[row][column] = startNumber++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][column] = startNumber++;
                }
            }
        }
        return matrix;
    }

    private static int[][] fillPatternA(int[][] matrix, int n) {
        int startNumber = 1;
        for (int column = 0; column < n; column++) {
            for (int row = 0; row < n; row++) {
                matrix[row][column] = startNumber++;
            }
        }
        return matrix;
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
