package Exercises.RawData;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Exercises.RawData.Vehicle> cars = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];

            if (!cars.containsKey(model)) {
                cars.put(model, new Exercises.RawData.Vehicle());
            }

            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            Exercises.RawData.Engine engine = new Exercises.RawData.Engine(engineSpeed, enginePower);
            cars.get(model).setEngine(engine);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            Exercises.RawData.Cargo cargo = new Exercises.RawData.Cargo(cargoType, cargoWeight);
            cars.get(model).setCargo(cargo);

            Exercises.RawData.Tyre tyre;
            double tyre1Pressure = Double.parseDouble(tokens[5]);
            int tyre1Age = Integer.parseInt(tokens[6]);
            tyre = new Exercises.RawData.Tyre(tyre1Pressure, tyre1Age);
            cars.get(model).getTyres().add(tyre);

            double tyre2Pressure = Double.parseDouble(tokens[7]);
            int tyre2Age = Integer.parseInt(tokens[8]);
            tyre = new Exercises.RawData.Tyre(tyre2Pressure, tyre2Age);
            cars.get(model).getTyres().add(tyre);

            double tyre3Pressure = Double.parseDouble(tokens[9]);
            int tyre3Age = Integer.parseInt(tokens[10]);
            tyre = new Exercises.RawData.Tyre(tyre3Pressure, tyre3Age);
            cars.get(model).getTyres().add(tyre);

            double tyre4Pressure = Double.parseDouble(tokens[11]);
            int tyre4Age = Integer.parseInt(tokens[12]);
            tyre = new Exercises.RawData.Tyre(tyre4Pressure, tyre4Age);
            cars.get(model).getTyres().add(tyre);

            cars.get(model).setModel(model);
        }
        String command = scanner.nextLine();
        List<Exercises.RawData.Vehicle> fragileVehicles = new ArrayList<>();
        List<Exercises.RawData.Vehicle> flammableVehicles = new ArrayList<>();
        Predicate<Exercises.RawData.Vehicle> pressurePredicate = vehicle -> {
            for (int index = 0; index < vehicle.getTyres().size(); index++) {
                var currentTyre = vehicle.getTyres().get(index);
                if (currentTyre.getPressure() < 1) {
                    return true;
                }
            }
            return false;
        };
        Predicate<Exercises.RawData.Vehicle> enginePowerPredicate = vehicle -> vehicle.getEngine().getPower() > 250;
        if (command.equals("fragile")) {
            for (var entry : cars.entrySet()) {
                Exercises.RawData.Vehicle vehicle = entry.getValue();
                if (vehicle.getCargo().getType().equals("fragile")) {
                    if (pressurePredicate.test(vehicle)) {
                        fragileVehicles.add(vehicle);
                    }
                }
            }
        } else {
            for (var entry : cars.entrySet()) {
                Exercises.RawData.Vehicle vehicle = entry.getValue();
                if (vehicle.getCargo().getType().equals("flamable")) {
                    if (enginePowerPredicate.test(vehicle)) {
                        flammableVehicles.add(vehicle);
                    }
                }
            }
        }
        if (command.equals("fragile")) {
            fragileVehicles.stream().forEach(veh -> System.out.println(veh.getModel()));
        } else {
            flammableVehicles.stream().forEach(veh -> System.out.println(veh.getModel()));
        }
    }
}