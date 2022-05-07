package Exercises.BasicOperationWithStacks;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicOperationsFunctionalVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < N; i++) { stack.push(scanner.nextInt()); }
        for (int i = 0; i < S; i++) { stack.pop(); }
        if (stack.isEmpty()) { System.out.println("0");
        } else { System.out.println(stack.contains(X) ? true : Collections.min(stack)); }
    }
}