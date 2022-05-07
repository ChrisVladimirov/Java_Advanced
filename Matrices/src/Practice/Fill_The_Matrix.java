package Practice;

import java.util.Scanner;

public class Fill_The_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int dimensions = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[dimensions][dimensions];

        printTheMatrix(pattern.equals("A") ?
                fillA(dimensions, matrix) : fillB(dimensions, matrix));
    }

    private static void printTheMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillA(int dimensions, int[][] matrix) {
        int number = 0;
        for (int column = 0; column < dimensions; column++) {
            for (int row = 0; row < dimensions; row++) {
                matrix[row][column] = ++number;
            }
        }
        return matrix;
    }

    private static int[][] fillB(int dimensions, int[][] matrix) {
        int number = 1;
        for (int column = 0; column < dimensions; column++) {
            if (column % 2 == 0) {
                for (int row = 0; row < dimensions; row++) {
                    matrix[row][column] = number++;
                }
            } else {
                for (int row = dimensions - 1; row >= 0; row--) {
                    matrix[row][column] = number++;
                }
            }
        }
        return matrix;
    }
}