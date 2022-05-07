package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = reader.readLine().split("\\s+");
        int lowerBound = Integer.parseInt(tokens[0]);
        int upperBound = Integer.parseInt(tokens[1]);
        String command = reader.readLine();

        Predicate<Integer> filter = getFilter(command);
        Consumer<Integer> print = e -> System.out.printf("%d ", e);

        IntStream
                .rangeClosed(lowerBound, upperBound)
                .boxed()
                .filter(filter)
                .forEach(print);
    }

    public static Predicate<Integer> getFilter(String command) {
        return command.equals("odd") ?
                e -> e % 2 == 1 : e -> e % 2 == 0;
    }
}