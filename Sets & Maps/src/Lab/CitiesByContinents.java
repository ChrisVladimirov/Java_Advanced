package Lab;

import java.util.*;

public class CitiesByContinents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, List<String>>> myMap = new LinkedHashMap<>();

        while (N-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!myMap.containsKey(continent)) {
                myMap.put(continent, new LinkedHashMap<>() {{
                    put(country, new ArrayList<>() {{
                        add(city);
                    }});
                }});
            } else {
                if (!myMap.get(continent).containsKey(country)) {
                    myMap.get(continent).put(country, new ArrayList<>() {{
                        add(city);
                    }});
                } else {
                    myMap.get(continent).get(country).add(city);
                }
            }
        }

        myMap.keySet().stream()
                .forEach(continent -> {
                    Map<String, List<String>> countries = myMap.get(continent);
                    System.out.printf("%s:%n", continent);
                    countries.entrySet().forEach(country -> {
                        System.out.printf("%s -> %s%n", country.getKey().replaceAll("[\\[\\],]", ""), String.join(", ",country.getValue()));
                    });
                });
    }
}