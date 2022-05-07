package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String currentURL = "";

        ArrayDeque<String> history = new ArrayDeque<>();        //stack
        ArrayDeque<String> forwardPages = new ArrayDeque<>();   //queue

        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (!history.isEmpty()) {
                    forwardPages.addFirst(currentURL);
                    currentURL = history.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else if (line.equals("forward")){
                if (forwardPages.isEmpty()){
                    System.out.println("no next URLs");
                    line = scanner.nextLine();
                    continue;
                }else {
                    currentURL = forwardPages.poll();
                }
            }
            else {
                if (!currentURL.equals("")) {
                    history.push(currentURL);
                }
                currentURL = line;
                forwardPages.clear();
            }
            System.out.println(currentURL);
            line = scanner.nextLine();
        }
    }
}
