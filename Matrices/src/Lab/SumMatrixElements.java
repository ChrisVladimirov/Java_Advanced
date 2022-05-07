package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split(", ");
            for (int column = 0; column < tokens.length; column++) {
                matrix[row][column] = Integer.parseInt(tokens[column]);
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(getElementsSum(matrix));
    }

    private static int getElementsSum(int[][] matrix) {
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
}
    /*private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }*/
   /* private static int getElementsSumWithStream(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }*/
/*
public static List<int[]> fundNumberOccurrences(int[][] matrix, int number){
List<int[]> out = new ArrayList<>();
    for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++) {
            int current = matrix[row][column];
            if (current==number){
                out.add(new int[] {row, column});
            }
        }
    }
    return out;
}*/
