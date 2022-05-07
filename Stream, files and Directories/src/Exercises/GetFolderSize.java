package Exercises;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\Dell\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        int folderSize = 0;

        for (File file : folder.listFiles()) {
            folderSize += file.length();
        }
        System.out.printf("Folder size: %d", folderSize);
    }
}