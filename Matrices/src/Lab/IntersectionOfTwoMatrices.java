package Lab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, columns, scanner);
        char[][] secondMatrix = readMatrix(rows, columns, scanner);

        char[][] result = getMatricesIntersection(firstMatrix, secondMatrix);
        printMatrix(result);
    }

    public static char[][] readMatrix(int rows, int columns, Scanner scanner) {
        char[][] matrix = new char[rows][columns];

        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int column = 0; column < tokens.length; column++) {
                matrix[row][column] = tokens[column].charAt(0);
            }
        }
        return matrix;
    }

    private static char[][] getMatricesIntersection(char[][] first, char[][] second) {
        char[][] out = new char[first.length][];
        for (int row = 0; row < first.length; row++) {
            out[row] = new char[first[row].length];
            for (int column = 0; column < first[row].length; column++) {
                out[row][column] = first[row][column] == second[row][column] ?
                        first[row][column] : '*';
            }
        }
        return out;
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] arr : matrix) {
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}