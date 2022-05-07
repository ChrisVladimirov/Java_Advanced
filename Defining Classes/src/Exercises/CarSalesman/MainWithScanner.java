package Exercises.CarSalesman;

import java.util.*;

public class MainWithScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

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

        int m = Integer.parseInt(scanner.nextLine());
        while (m-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
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
