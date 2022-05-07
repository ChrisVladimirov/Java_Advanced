package Exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        Files.readAllLines(path)
                .forEach(e -> {
                    try {
                        writer.write(e.toUpperCase());
                        writer.newLine();
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                });
        writer.close();
    }
}