package Exercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        Consumer<String[]> printSir = s -> {
            for (String name : tokens) {
                System.out.printf("Sir %s%n", name);
            }
        };
        printSir.accept(tokens);
    }
}