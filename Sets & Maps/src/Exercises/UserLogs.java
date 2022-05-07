package Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Map<String, Integer>>info = new TreeMap<>();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String username = data[2].split("=")[1];
            String message = data[1].split("=")[1];
            String ip = data[0].split("=")[1];


            input = scanner.nextLine();
        }
    }
}
