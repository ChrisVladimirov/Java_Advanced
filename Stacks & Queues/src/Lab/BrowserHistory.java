package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String currentURL = "";

        ArrayDeque<String> history = new ArrayDeque<>();

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!history.isEmpty()) {
                    currentURL = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentURL.equals("")) {
                    history.push(currentURL);
                }
                currentURL = line;
            }
            System.out.println(currentURL);
            line = scanner.nextLine();
        }
    }
}