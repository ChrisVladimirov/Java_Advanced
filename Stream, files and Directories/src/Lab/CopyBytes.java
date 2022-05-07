package Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        PrintStream printStream = new PrintStream("copy-bytes-out.txt");
        int nextByte = inputStream.read();

        while (nextByte != -1) {
            if (nextByte == ' ') {
                printStream.print((char) nextByte);
            } else if (nextByte == 10) {
                printStream.println();
            } else {
                printStream.print(nextByte);
            }
            nextByte = inputStream.read();
        }
    }
}
