package Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        LinkedHashMap<String, String> emailsData = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();
            if (!email.endsWith("us") && !email.endsWith("com") && !email.endsWith("uk")) {
                emailsData.put(name, email);
            }
            name = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry :
                emailsData.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
