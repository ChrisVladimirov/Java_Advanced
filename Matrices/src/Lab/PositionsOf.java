package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];
        int columns = dimensions[1];

        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < matrix.length; row++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = numbers;
        }

        int searchNumber = scanner.nextInt();
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] == searchNumber) {
                    System.out.println(row + " " + column);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
