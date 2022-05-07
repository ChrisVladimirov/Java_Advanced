package Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> studentGrades = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();

            studentGrades.put(name, grades);
        }

        for (var entry : studentGrades.entrySet()) {
            double avg = Arrays.stream(entry.getValue()).average().orElse(0);
            DecimalFormat formatter = new DecimalFormat("0.###############");
            System.out.printf("%s is graduated with %s%n", entry.getKey(), formatter.format(avg));
        }
    }
}
