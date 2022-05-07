package Exercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt");
        Path path2 = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt");

        String output = "thirdFile.txt";
        PrintWriter writer = new PrintWriter(output);
        Files.readAllLines(path1).forEach(writer::println);
        Files.readAllLines(path2).forEach(writer::println);

        writer.close();
    }
}