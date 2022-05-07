package Exercises.TheEnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String[] dimensions = reader.readLine().trim().split("\\s+");
        final int rows = Integer.parseInt(dimensions[0]);
        final int columns = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(reader.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        Map<Integer, List<Integer>> diagonals = new LinkedHashMap<>();
        for (int group = 0, diagonal = 0, row = rows - 1; row >= 0; row--, diagonal = ++group) {
            for (int column = columns - 1; column >= 0 && column >= group; column--, diagonal++) {
                addValueToDiagonal(diagonals, matrix[row][column], diagonal);
            }

            for (int r = rows - 1 - group - 1; r >= 0 && group < columns; r--, diagonal++) {
                addValueToDiagonal(diagonals, matrix[r][group], diagonal);
            }
        }
        final StringBuilder sb = new StringBuilder();
        diagonals.values().forEach(numbers -> sb.
                append(numbers.stream().map(Objects::toString).collect(Collectors.joining(" ")))
                .append(System.lineSeparator()));

        System.out.print(sb);
    }

    private static void addValueToDiagonal(Map<Integer, List<Integer>> diagonals, int currentElement, int diagonal) {
        diagonals.putIfAbsent(diagonal, new ArrayList<>());
        diagonals.get(diagonal).add(currentElement);
    }
}
