package ru.spbu.arts;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;


public class FilesCollector implements FileVisitor<Path>{

    List<String> Collection = new ArrayList<>();

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        System.out.println("Заходим в каталог " + dir.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        System.out.println("Найден файл " + file.toString());
        Collection.add(file.toString());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc){
        System.out.println("Найден файл " + file.toString() + " с ошибкой");
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        System.out.println("Выходим из каталога " + dir.toString());
        return FileVisitResult.CONTINUE;
    }

    public List<String> getAllFiles(){
        return Collection;
    }


}
