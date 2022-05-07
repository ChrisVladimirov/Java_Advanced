package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(8, 8, scanner);
        List<int[]> queens = trouvezLesReines(matrix, 'q');

        defineValidQueen(queens);
    }

    private static int[] defineValidQueen(List<int[]> queens) {

        return new int[0];
    }


    public static List<int[]> trouvezLesReines(int[][] matrix, char symbol) {
        List<int[]> desReines = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int current = matrix[row][column];
                if (current == symbol) {
                    desReines.add(new int[]{row, column});
                }
            }
        }
        return desReines;
    }

    public static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine());
        }
        return matrix;
    }

    private static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }
}
