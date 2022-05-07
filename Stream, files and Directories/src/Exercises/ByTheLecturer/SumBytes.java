package Exercises.ByTheLecturer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SumBytes {
    public static void main(String[] args) {
        Path path = Path.of("C:\\Users\\Dell\\Desktop" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources (2).zip" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources" +
                "\\Exercises Resources\\input.txt");
        List<String> lines = new ArrayList<>();
        try{
            lines = Files.readAllLines(path);
        } catch (IOException io){
            System.out.println("Another error with reading file.");
        }

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String line : lines){
                writer.write(line.toUpperCase(Locale.ROOT));
                writer.newLine();
            }
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
