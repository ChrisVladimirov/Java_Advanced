package Exercise.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box<Double> box = new Box<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            double text = Double.parseDouble(scanner.nextLine());
            box.add(text);
        }
        double element = Double.parseDouble(scanner.nextLine());
        System.out.println(box.countGreaterThan(element));
    }
}
