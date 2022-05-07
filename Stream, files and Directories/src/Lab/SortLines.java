package Lab;

import java.io.*;
/*import java.nio.file.Files;
import java.nio.file.Path;*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        List<String> lines = new ArrayList<>();
        String line = reader.readLine();
        while (line != null) {
            lines.add(line);
            line = reader.readLine();
        }
        Collections.sort(lines);
        // System.out.println(String.join(System.lineSeparator(), lines));
        // or:
        // Files.write(Path.of("sorted-lines.out.txt"), lines);
        BufferedWriter writer = new BufferedWriter(new FileWriter("out-test.txt"));
        writer.write(String.join(System.lineSeparator(), lines));
        writer.flush();
        writer.close();
    }
}
