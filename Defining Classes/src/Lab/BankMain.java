package Lab;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] tokens = scanner.nextLine().split("\\s+");
            input = scanner.nextLine();
        }
    }
}
