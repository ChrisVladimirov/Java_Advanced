package Lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Objects;

public class NestedFolders {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Dell\\Desktop" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        ArrayDeque<File> files = new ArrayDeque<>();
        files.offer(file);

        PrintStream printStream = new PrintStream("nested-out.txt");

        while (!files.isEmpty()) {
            File innerFile = files.poll();
            printStream.println(innerFile.getName());
            for (File f : Objects.requireNonNull(innerFile.listFiles())) {
                if (f.isDirectory()) {
                    files.offer(f);
                } else {
                    printStream.println(f.getName());
                }
            }
        }
    }
}
