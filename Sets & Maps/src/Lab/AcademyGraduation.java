package Lab;

import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> classBook = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] tokens = scanner.nextLine().split("\\s+");
            Double[] grades = new Double[tokens.length];

            for (int j = 0; j < tokens.length; j++) {
                grades[j] = Double.parseDouble(tokens[j]);
            }
            classBook.put(name, grades);
        }

        classBook.entrySet().stream().forEach(entry->{
            double sum = 0;
            for (int i = 0; i < entry.getValue().length; i++) {
                sum += (entry.getValue())[i];
            }
            double avg = sum / entry.getValue().length;

            System.out.println("George is graduated with " + avg);
        });
    }
}
