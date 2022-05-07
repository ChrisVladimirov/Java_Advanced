package Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        Set<Character> separators = Set.of(',', '!', '?', '.');

        int nextByte = inputStream.read();
        PrintStream printStream = new PrintStream("C:\\Users\\Dell\\Desktop" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\output.txt");

        while (nextByte > 0) {
            char symbol = (char)(nextByte);
            if (!separators.contains(symbol)){
                printStream.print(symbol);
            }
            nextByte = inputStream.read();
        }
    }
}
