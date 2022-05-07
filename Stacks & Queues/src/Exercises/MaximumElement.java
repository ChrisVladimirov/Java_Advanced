package Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 0; count < n; count++) {
            String command = scanner.nextLine();
            switch (command) {
                case "2":
                    stack.pop();
                    break;
                case "3":
                    if (!stack.isEmpty()) {
                        System.out.println(Collections.max(stack));
                    }
                    break;
                default:
                    int pushElement = Integer.parseInt(command.split(" ")[1]);
                    stack.push(pushElement);
                    break;
            }

        }
    }
}