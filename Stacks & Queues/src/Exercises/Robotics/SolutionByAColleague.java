package Exercises.Robotics;

import java.util.*;
import java.util.stream.Collectors;

public class SolutionByAColleague {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> robots = Arrays.stream(scanner.nextLine().split(";"))
                .collect(Collectors.toList());

        String[] names = new String[robots.size()];
        int[] processTime = new int[robots.size()];

        for (int i = 0; i < robots.size(); i++) {
            String[] tokens = robots.get(i).split("-");
            names[i] = tokens[0];
            int time = Integer.parseInt(tokens[1]);
            processTime[i] = time;
        }
        ArrayDeque<String> queueProduct = new ArrayDeque<>();
        String[] time = scanner.nextLine().split(":");

        String inputProduct;
        while (!"End".equalsIgnoreCase(inputProduct = scanner.nextLine())) {
            queueProduct.offer(inputProduct);
        }

        int hour = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int seconds = Integer.parseInt(time[2]);

        int totalTimeInSeconds = hour * 3600 + minutes * 60 + seconds;

        int[] robotsWork = new int[robots.size()];

        while (!queueProduct.isEmpty()) {
            totalTimeInSeconds++;
            String product = queueProduct.poll();
            int index = -1;

            for (int i = 0; i < robotsWork.length; i++) {
                if (robotsWork[i] > 0) {
                    robotsWork[i]--;
                }
                if (robotsWork[i] == 0 && index == -1) {
                    index = i;
                }
            }
            if (index != -1) {
                robotsWork[index] = processTime[index];
                System.out.println(printStartTimeRobot(names[index], product, totalTimeInSeconds));
            } else {
                queueProduct.offer(product);
            }
        }
    }

    private static String printStartTimeRobot(String name, String product, int totalTimeInSeconds) {

        long hour = (totalTimeInSeconds / 3600) % 24;
        long minutes = (totalTimeInSeconds / 60) % 60;
        long second = totalTimeInSeconds % 60;
        String time = String.format("%02d:%02d:%02d", hour, minutes, second);

        return String.format("%s - %s [%s]", name, product, time);
    }
}