package Exercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Stream;

public class SetsOfElements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] parameters = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = parameters[0];
        int m = parameters[1];

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
        firstSet.retainAll(secondSet);

        firstSet.forEach((e) -> System.out.print(e + " "));
    }
}
