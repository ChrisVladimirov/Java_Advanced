package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String[] expressionElements = scanner.nextLine().split("\\s+");

        for (int i = expressionElements.length - 1; i >= 0; i--) {
            String expElement = expressionElements[i];
            stack.push(expElement);
        }

        while (stack.size() > 1) {
            int leftOperand = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int rightOperand = Integer.parseInt(stack.pop());

            int result = operator.equals("+") ?
                    leftOperand + rightOperand : leftOperand - rightOperand;

            stack.push(String.valueOf(result));
        }
        System.out.println(stack.pop());
    }
}
