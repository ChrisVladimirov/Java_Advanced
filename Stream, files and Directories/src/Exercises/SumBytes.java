package Exercises;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        BigInteger sum = BigInteger.ZERO;
        for (byte value : Files.readAllBytes(path)) {
            if (value != 10 && value != 13) {
                sum = sum.add(BigInteger.valueOf(value));
            }
        }
        System.out.println(sum);
    }
}