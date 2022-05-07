package Exercises.MyDesperateAttempts;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Stream.of(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int number : numbers) {
            stack.push(number);
        }
        System.out.println(stack.toString().replaceAll("[\\[\\],]",""));
    }
}