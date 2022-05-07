package Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperBound = Integer.parseInt(scanner.nextLine());
        int[] factors = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
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