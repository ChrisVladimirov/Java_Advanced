package Lab.EveryThirdLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ASimplerSolution {
    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        Path path = Paths.get(fileName);
        List<String> lines = Files.readAllLines(path);

        for (int i = 0; i < lines.size(); i++) {
            if ((i + 1) % 3 == 0) {
                System.out.println(lines.get(i));
            }
        }
    }
}
