package ru.spbu.arts;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Primer {
    public static void main(String[] args) throws IOException {
        Path startingDir = Paths.get("D:/Semester1");
        FilesCollector visitor = new FilesCollector();
        Files.walkFileTree(startingDir, visitor);
        FilesCollector fc = new FilesCollector();
        Files.walkFileTree(startingDir, fc);
        List<String> allfiles = fc.getAllFiles();
        for(int i = 0; i < allfiles.size(); i++) {
            System.out.println(allfiles.get(i));
        }


    }
}
