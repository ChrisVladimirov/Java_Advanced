package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CrossFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = numbers[0];
        int columns = numbers[1];

        List<List<Integer>> matrix = new ArrayList<>();
        fillMatrix(matrix, rows, columns);

        String command = scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            String[] destroyCoordinates = command.split("\\s+"); // 3 4 1
            int dRow = Integer.parseInt(destroyCoordinates[0]);
            int dColumn = Integer.parseInt(destroyCoordinates[1]);
            int dRadius = Integer.parseInt(destroyCoordinates[2]);

            //destroy up <-> down
            for (int currentRow = dRow - dRadius; currentRow <= dRow + dRadius; currentRow++) {
                if (isInMatrix(currentRow, dColumn, matrix)) {
                    matrix.get(currentRow).remove(dColumn);
                }
            }
            //destroy left <-> right
            for (int currentColumn = dColumn + dRadius; currentColumn > -dColumn - dRadius; currentColumn--) {
                if (isInMatrix(dRow, currentColumn, matrix)) {
                    matrix.get(dRow).remove(currentColumn);
                }
            }
            matrix.removeIf(List::isEmpty);
            command = scanner.nextLine();
        }
        printMatrix(matrix);
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int number = 1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col = 0; col < cols; col++) {
                matrix.get(row).add(number++);
            }
        }
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (int element : row ) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static String[] readArray(String line) {
        return (line.split("\\s+"));
    }

    private static boolean isInMatrix(int row, int col, List<List<Integer>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}