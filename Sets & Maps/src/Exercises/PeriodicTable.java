package Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> elements = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String compound = scanner.nextLine();
            String[] chemicalElements = compound.split("\\s+");

            elements.addAll(Arrays.asList(chemicalElements));
        }
        elements.forEach(e -> System.out.print(e + " "));
    }
}
