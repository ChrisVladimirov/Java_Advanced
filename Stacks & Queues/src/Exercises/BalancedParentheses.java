package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        boolean areBalanced = false;

        for (int index = 0; index < input.length(); index++) {
            char currentParenthesis = input.charAt(index);
            if (currentParenthesis == '(' || currentParenthesis == '[' || currentParenthesis == '{') {
                openBrackets.push(currentParenthesis);
            } else if (currentParenthesis == ')' || currentParenthesis == ']' || currentParenthesis == '}') {

                if (openBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                }

                char lastOpenParenthesis = openBrackets.pop();

                if (lastOpenParenthesis == '(' && currentParenthesis == ')') {
                    areBalanced = true;
                } else if (lastOpenParenthesis == '[' && currentParenthesis == ']') {
                    areBalanced = true;
                } else if (lastOpenParenthesis == '{' && currentParenthesis == '}') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        System.out.println(areBalanced ? "YES" : "NO");
    }
}