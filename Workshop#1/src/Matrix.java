import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matrix<T> {
    private int rows;
    private int columns;
    private T[][] matrix;

    public Matrix(int rows, int columns, T[][] matrix) {
        this.setRows(rows);
        this.setColumns(columns);
        this.setMatrix(matrix);
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public Matrix() {
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    @SuppressWarnings("unchecked")
    public static <T> void fillMatrix(Scanner scanner, T[][] matrix, int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                matrix[row][col] = (T) scanner.nextLine();
            }
        }
    }

    private boolean isInBounds(int row, int column, T[][] matrix) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length;
    }

    public static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine());
        }
        return matrix;
    }

    private static Object[] readArray(String line, String pattern) {
        return Arrays.stream(line.split(pattern)).toArray();
    }

    public List<int[]> fundNumberOccurrences(int[][] matrix, int number) {
        List<int[]> out = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                int current = matrix[row][column];
                if (current == (number)) {
                    out.add(new int[]{row, column});
                }
            }
        }
        return out;
    }

    private static int getElementsSumWithStream(int[][] matrix) {
        return Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum();
    }

    public void printMatrix(Matrix[][] matrix) {
        for (Matrix[] arr : matrix) {
            for (Matrix element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int[] readArray(String line) {
        return Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    public void setMatrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T[][] getMatrix() {
        return matrix;
    }
}
