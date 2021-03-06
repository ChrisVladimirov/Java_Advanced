package Exercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class LineNumbers {
    public static int countRow = 1;

    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt");
        String outputPath = "output.txt";
        PrintWriter writer = new PrintWriter(outputPath);
        Files.readAllLines(path)
                .forEach(line -> writer.println(countRow++ + ". " + line));
        writer.close();
    }
}