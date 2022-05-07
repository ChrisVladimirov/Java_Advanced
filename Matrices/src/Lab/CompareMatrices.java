package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstDimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int firstRows = firstDimensions[0];
        int firstColumns = firstDimensions[1];

        int[][] firstMatrix = new int[firstRows][firstColumns];

        for (int i = 0; i < firstRows; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            firstMatrix[i] = numbers;
        }

        int[] secondDimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int secondRows = secondDimensions[0];
        int secondColumns = secondDimensions[1];

        int[][] secondMatrix = new int[secondRows][secondColumns];

        for (int i = 0; i < secondRows; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            secondMatrix[i] = numbers;
        }

        System.out.println(areMatricesEqual(firstMatrix, secondMatrix) ? "equal" : "not equal");
    }

    private static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {//дали съдържат равен брой измерения?
            return false;
        }
        for (int row = 0; row < matrix1.length; row++) {//дали съдържат равен брой колони?
            if (matrix1[row].length != matrix2[row].length) {
                return false;//различни са по брой колони на ред
            }
            for (int column = 0; column < matrix1[row].length; column++) {
                if (matrix1[row][column] != matrix2[row][column]) {//отделният елемент различен ли е?
                    return false;
                }
            }
        }

        return true;
    }
}