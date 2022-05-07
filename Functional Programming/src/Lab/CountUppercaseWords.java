package Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> doesItStartWithACapitalLetter = string -> Character.isUpperCase(string.charAt(0));
        String[] words = scanner.nextLine().split("\\s+");
        String[] filteredWords = Arrays.stream(words).filter(doesItStartWithACapitalLetter).toArray(String[]::new);
        System.out.println(filteredWords.length);
        Arrays.stream(filteredWords).forEach(System.out::println);
    }
}