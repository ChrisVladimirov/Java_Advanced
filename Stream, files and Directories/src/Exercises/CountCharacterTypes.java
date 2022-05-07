package Exercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (Exception io) {
            System.out.println("Another error with reading file");
        }
        Map<String, Integer> occurrences = new HashMap<>();
        occurrences.put("vowels", 0);
        occurrences.put("consonants", 0);
        occurrences.put("punctuations", 0);

        for (String line : lines) {
            for (char symbol : line.toCharArray()) {
                if (symbol == ' ') {
                    continue;
                } else if (isVowel(symbol)) {
                    occurrences.put("vowels", occurrences.get("vowels") + 1);
                } else if (isPunctuational(symbol)) {
                    occurrences.put("punctuations", occurrences.get("punctuations") + 1);
                } else {
                    occurrences.put("consonants", occurrences.get("consonants") + 1);
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("Exercises/output_task4.txt"));
        writer.write("Vowels: " + occurrences.get("vowels"));
        writer.newLine();
        writer.write("Consonants: " + occurrences.get("consonants"));
        writer.newLine();
        writer.write("Punctuation: " + occurrences.get("punctuations"));

        writer.close();
    }

    private static boolean isPunctuational(char symbol) {
        return symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'o' || symbol == 'u' || symbol == 'i' || symbol == 'e';
    }
}