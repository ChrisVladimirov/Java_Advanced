package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SortByAge {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Map<String, Integer> peopleData = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(",\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            peopleData.put(name, age);
        }

        String ageCondition = reader.readLine();
        int delimiter = Integer.parseInt(reader.readLine());
        String format = reader.readLine();

        peopleData.entrySet()
                .stream()
                .filter(getAgeFilter(delimiter, ageCondition))
                .forEach(getFormatter(format));
    }

    private static Predicate<Map.Entry<String, Integer>> getAgeFilter(int age, String ageCondition) {
        if (ageCondition.equals("older")) {
            return e -> e.getValue() >= age;
        }
        return e -> e.getValue() <= age;
    }

    public static Consumer<Map.Entry<String, Integer>> getFormatter(String format) {
        if (format.equals("name")) {
            return entry -> System.out.println(entry.getKey());
        } else if (format.equals("age")) {
            return entry -> System.out.println(entry.getValue());
        }
        return entry -> System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}