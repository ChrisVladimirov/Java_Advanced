/*
package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Double> mapWithVAT = str ->
                Double.parseDouble(str) * 1.2;
        Arrays.stream(scanner.nextLine().split(", "))
                .map(mapWithVAT)
                .forEach(e -> System.out.printf("%.2f"));
    }
}
*/
