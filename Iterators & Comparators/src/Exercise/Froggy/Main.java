package Exercise.Froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] stones = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        Lake lake = new Lake(stones);
        String command = reader.readLine();
        while (!command.equals("END")) {
            String[] tokens = command.split("[, ]+");
            lake.setNumbers(Arrays.stream(tokens).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
            command = reader.readLine();
        }
        String output = "";
        for (int i = 0; i < lake.getNumbers().size(); i += 2) {
            output = output.concat(lake.getNumbers().get(i) + ", ");
        }
        for (int i = 1; i < lake.getNumbers().size(); i += 2) {
            output = output.concat(lake.getNumbers().get(i) + ", ");
        }
        System.out.println(output.substring(0, output.length() - 2));
    }
}