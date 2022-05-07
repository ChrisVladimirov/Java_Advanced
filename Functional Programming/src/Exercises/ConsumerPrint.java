package Exercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String[]> printString = array -> {
            for (String name : names) {
                System.out.println(name);
            }
        };
        printString.accept(names);
    }
}