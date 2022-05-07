package Exercises.StringMatrixRotation;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotation = scanner.nextLine();
        int angleRotation = Integer.parseInt(rotation.split("[()]+")[1]) % 360;

        ArrayList<String> lineForMatrix = new ArrayList<>();
        int maxLength = 0;

        while (true) {
            String line = scanner.nextLine();
            lineForMatrix.add(line);

            if (line.equals("END")) {
                lineForMatrix.remove(lineForMatrix.size() - 1);
                break;
            }
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        int rows = lineForMatrix.size();
        int columns = maxLength;
        char[][] matrix = new char[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (column < lineForMatrix.get(row).length()) {
                    matrix[row][column] = lineForMatrix.get(row).charAt(column);
                } else {
                    matrix[row][column] = ' ';
                }
            }
        }
        rotate(angleRotation, rows, columns, matrix);
    }

    private static void rotate(int angleRotation, int rows, int columns, char[][] matrix) {
        if (angleRotation == 90) {
            for (int column = 0; column < columns; column++) {
                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(matrix[row][column]);
                }
                System.out.println();
            }
        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0; row--) {
                for (int column = columns - 1; column >= 0; column--) {
                    System.out.print(matrix[row][column]);
                }
                System.out.println();
            }
        } else if (angleRotation == 270) {
            for (int column = columns - 1; column >= 0; column--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][column]);
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    System.out.print(matrix[row][column]);
                }
                System.out.println();
            }
        }
    }
}