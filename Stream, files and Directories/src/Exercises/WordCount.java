package Exercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Path pathWords = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path pathText = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        String outputPath = "outputCountWords.txt";

        PrintWriter writer = new PrintWriter(outputPath);
        Map<String, Integer> countWords = new LinkedHashMap<>();

        List<String> lines = Files.readAllLines(pathWords);
        for (String line : lines) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> countWords.put(word, 0)
            );
        }

        for (String line : Files.readAllLines(pathText)) {
            Arrays.stream(line.split("\\s+")).forEach(word -> {
                if (countWords.containsKey(word)) {
                    countWords.put(word, countWords.get(word) + 1);
                }
            });
        }

        for (var word : countWords.entrySet()) {
            writer.println(word.getKey() + " - " + word.getValue());
        }
        writer.close();
    }
}