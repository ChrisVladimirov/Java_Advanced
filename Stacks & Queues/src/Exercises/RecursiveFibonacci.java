package Exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        memory = new long[N + 1];
        System.out.println(getFibonacci(N));
    }

    private static long getFibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        if(memory[n] != 0){
            return memory[n];
        }
        return memory[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
    }
}