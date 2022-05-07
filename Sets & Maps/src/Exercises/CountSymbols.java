package Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Character, Integer> myMap = new TreeMap<>();
        String text = scanner.nextLine();

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            if (!myMap.containsKey(currentSymbol)) {
                myMap.put(currentSymbol, 1);
            } else {
                myMap.put(currentSymbol, myMap.get(currentSymbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
