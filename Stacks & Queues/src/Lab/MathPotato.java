package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        int cycle = 1;
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }

    private static boolean isPrime(int number) {
        if (number <= 3) return number > 1;

        if ((number % 2 == 0) || (number % 3 == 0)) return false;

        int count = 5;

        while (Math.pow(count, 2) <= number) {
            if (number % count == 0 || number % (count + 2) == 0) return false;

            count += 6;
        }

        return true;
    }
}
