package Exercises.MyDesperateAttempts;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int N = parameters[0];
        int S = parameters[1];
        int X = parameters[2];

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> stack = new ArrayDeque<>(N);

        for (int n : numbers) {
            stack.push(n);
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }


    }
}