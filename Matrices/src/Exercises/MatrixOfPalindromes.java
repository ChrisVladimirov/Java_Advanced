package Exercises;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        String[][] matrix = new String[rows][columns];

        char firstLetter = 'a';
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                String palindrome = "" + firstLetter + (char) (firstLetter + column) + firstLetter;
                matrix[row][column] = palindrome;
            }
            firstLetter = (char) (firstLetter + 1);
        }
        printMatrix(matrix, rows, columns);
    }

    private static void printMatrix(String[][] matrix, int rows, int columns) {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print((matrix[row][column] + " "));
            }
            System.out.println();
        }
    }
}
