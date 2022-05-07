package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(N, N, scanner, "\\s+");

        System.out.println(Arrays.toString(createDiagonal(N, matrix)).replaceAll("[\\[\\],]", ""));
        System.out.println(Arrays.toString(createDiagonal1(N, matrix)).replaceAll("[\\[\\],]", ""));
    }

    private static int[] createDiagonal1(int n, int[][] matrix) {
        int[] result = new int[n];

        for (int row = 0; row < n; row++) {
            result[row] = matrix[n - row - 1][row];
        }
        return result;
    }

    private static int[] createDiagonal(int n, int[][] matrix) {
        int[] result = new int[n];

        for (int row = 0; row < n; row++) {
            result[row] = matrix[row][row];
        }
        return result;
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
