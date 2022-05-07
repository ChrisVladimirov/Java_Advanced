package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        String command = scanner.nextLine();
        while (!command.equals("print")) {

            if (command.equals("cancel")) {
                System.out.println(queue.isEmpty() ? "Printer is on standby" : "Canceled " + queue.pollFirst());
            } else {
                queue.offer(command);
            }
            command = scanner.nextLine();
        }
        queue.forEach(System.out::println);
    }
}