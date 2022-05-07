package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] evenNumbers = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).filter(e -> e % 2 == 0).toArray();

        String functionalOutput = Arrays.stream(evenNumbers).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(functionalOutput);
        String sortedNumbers = Arrays.stream(evenNumbers).sorted().mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(sortedNumbers);
    }
}