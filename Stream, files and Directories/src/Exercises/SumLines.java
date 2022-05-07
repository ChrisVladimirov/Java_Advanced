package Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Path path1 = Path.of(path);

        Consumer<char[]> sumTheLine = charArray -> {
            int sum = 0;
            for (char symbol : charArray) {
                sum += symbol;
            }
            System.out.println(sum);
        };
        Files.readAllLines(path1).stream()
                .map(String::toCharArray)
                .forEach(sumTheLine);
    }
}