package Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> brochure = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            brochure.putIfAbsent(shop, new LinkedHashMap<>());
            brochure.get(shop).put(product, price);

            input = scanner.nextLine();
        }

        brochure.keySet()
                .stream()
                .forEach(key -> {
                    Map<String, Double> assortment = brochure.get(key);
                    System.out.printf ("%s-> %n", key);
                    assortment.entrySet().forEach(key_->{
                        System.out.printf("Product: %s, Price: %.1f%n",key_.getKey(), key_.getValue());
                    });
                });
    }
}
