package Exercises.CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String engineModel = tokens[0];
            String power = (tokens[1]);
            String displacement = "n/a";
            String efficiency = "n/a";

            if (tokens.length == 3) {
                if (Character.isDigit((tokens[2]).charAt(0))) {
                    displacement = tokens[2];
                } else {
                    efficiency = tokens[2];
                }
            } else if (tokens.length == 4) {
                displacement = tokens[2];
                efficiency = tokens[3];
            }
            Engine engine = new Engine(engineModel, power, displacement, efficiency);
            engines.put(engineModel, engine);
        }

        int m = Integer.parseInt(reader.readLine());
        while (m-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String model = tokens[0];
            String engineModel = tokens[1];
            String weight = "n/a";
            String color = "n/a";

            if (tokens.length == 3) {
                if (Character.isDigit(tokens[2].charAt(0))) {
                    weight = tokens[2];
                } else {
                    color = tokens[2];
                }
            } else if (tokens.length == 4) {
                weight = tokens[2];
                color = tokens[3];
            }
            Car car = new Car(model, engines.get(engineModel), weight, color);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
