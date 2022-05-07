package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String s : tokens) {
            stack.push(Integer.parseInt(s));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
