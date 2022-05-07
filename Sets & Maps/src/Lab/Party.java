package Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> VIP = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            String regex = "[0-9]*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(regex);
            if (matcher.find()) {
                VIP.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }

        String guest = scanner.nextLine();
        while (!guest.equals("END")) {

            if (VIP.contains(guest)) {
                VIP.remove(guest);
            } else regular.remove(guest);
            guest = scanner.nextLine();
        }

        if (VIP.isEmpty()) {
            printRegular(regular);
        } else {
            System.out.println(VIP.size());
            VIP.forEach((e) -> System.out.printf("%s%n", e));
        }
    }

    private static void printRegular(Set<String> regular) {
        System.out.println(regular.size());
        regular.forEach((e) -> System.out.printf("%s%n", e));
    }
}