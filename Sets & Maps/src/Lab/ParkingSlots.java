package Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingSlots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] tokens = command.split(", ");
            String status = tokens[0];
            String licenseNumber = tokens[1];
            boolean location = status.equals("IN") ? parking.add(licenseNumber) : parking.remove(licenseNumber);
            command = scanner.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            parking.forEach((e) -> System.out.printf("%s%n", e));
        }
    }
}