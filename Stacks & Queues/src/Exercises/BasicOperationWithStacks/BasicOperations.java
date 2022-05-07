package Exercises.BasicOperationWithStacks;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int count = 0; count < N; count++) {
            stack.push(scanner.nextInt());
        }

        for (int count = 0; count < S; count++) {
            stack.pop();
        }

        if (stack.contains(X)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}