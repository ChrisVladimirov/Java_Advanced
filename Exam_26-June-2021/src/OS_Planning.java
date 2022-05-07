import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OS_Planning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> tasks = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> threads = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int fatalTask = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int killer = 0;
//Enqueue
        for (Integer task : tasks) {
            stack.push(task);
        }
        for (Integer thread : threads) {
            queue.offer(thread);
        }

        boolean flag = false;
//Allot
        for (Integer currentThread : queue) {
            for (Integer currentTask : stack) {
                if (currentTask == fatalTask) {
                    killer = currentThread;
                    flag = true;
                } else {
                    if (currentTask <= currentThread) {
                        stack.pop();
                    }
                    queue.poll();
                }
                break;
            }
            if (flag) {
                break;
            }
        }

        System.out.printf("Thread with value %d killed task %d%n", killer, fatalTask);
        queue.forEach(e -> System.out.print(e + " "));
    }
}
