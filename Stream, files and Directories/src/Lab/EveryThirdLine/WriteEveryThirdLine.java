package Lab.EveryThirdLine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        FileReader reader = new FileReader(path);

        Scanner scanner = new Scanner(reader);

        PrintStream printStream = new PrintStream("every-third-line-out.txt");

        int lineNumber = 1;
        while (scanner.hasNext()) {
            if (lineNumber % 3 == 0) {
                printStream.println(scanner.nextLine());
            } else {
                scanner.nextLine();
            }
            lineNumber++;
        }
    }
}
