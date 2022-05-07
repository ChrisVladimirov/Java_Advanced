package Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("Party!")) {
            String action = command.split("\\s+")[0];//Remove || Double
            String clarifier = command.split("\\s+")[1]; //Length || StartsWith || EndsWith
            String parameter = command.split("\\s+")[2]; //addition

            Predicate<String> predicate = getPredicate(clarifier, parameter);

            switch (action) {
                case "Remove":
                    guests.removeIf(predicate);
                    break;
                case "Double":
                    for (int i = 0; i < guests.size(); i++) {
                        String guest = guests.get(i);
                        if (predicate.test(guest)) {
                            guests.add(i++, guest);
                        }
                    }
            }
            command = scanner.nextLine();
        }
        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            Collections.sort(guests);
            System.out.printf("%s are going to the party!", String.join(", ", guests));
        }
    }

    private static Predicate<String> getPredicate(String clarifier, String parameter) {
        switch (clarifier) {
            case "StartsWith":
                return name -> name.startsWith(parameter);
            case "EndsWith":
                return name -> name.endsWith(parameter);
            case "Length":
                return name -> name.length() == Integer.parseInt(parameter);
            default:
                return name -> false;
        }
    }
}