package Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ListOfPredicatesSolvedWithBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int upperBound = Integer.parseInt(reader.readLine());
        int[] factors = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Integer[] boxedFactors = Arrays.stream(factors).boxed().toArray(Integer[]::new);
        IntStream divisible = IntStream.rangeClosed(1, upperBound);

        Predicate<Integer> check = number -> {
            for (int factor : boxedFactors) {
                if (factor == 0) {
                    continue;
                }
                if (number % factor != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int n : divisible.toArray()) {
            if (check.test(n)) {
                System.out.printf("%d ", n);
            }
        }
    }
}