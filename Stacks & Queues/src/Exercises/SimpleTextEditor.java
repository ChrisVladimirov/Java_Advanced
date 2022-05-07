/*
package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder blankText = new StringBuilder();

        int N = scanner.nextInt();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "1":
                    stack.push(blankText.toString());
                    blankText.append(tokens[1]);
                    break;
                case "2":
                    stack.push(blankText.toString());
                    int count = Integer.parseInt(tokens[1]);

                    for (int j = blankText.length() - 1; j >= 0; j--) {
                        char currentEl = blankText.charAt(j);
                        int asInt = (int)currentEl;
                        blankText.delete(indexOf(asInt), );
                    }
                    break;
                case "3":
                    int index = Integer.parseInt(tokens[1]);
                    System.out.println(blankText.charAt(index - 1));
                    break;
                case "4":
                    System.out.println(stack.pop());
                    break;
            }
        }
    }
}
*/
