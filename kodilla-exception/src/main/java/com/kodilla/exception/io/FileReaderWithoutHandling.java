package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readFile() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(String.valueOf(classLoader.getResourceAsStream("file/names.txt")));
//        Path path = Paths.get(file.getPath());
        Stream<String> fileLines  = Files.lines(Paths.get(file.getPath()));
        fileLines.forEach(System.out::println);

//        if (file.canExecute()) {
//            try {
//                Stream<String> fileLines = Files.lines(path);
//            } catch (IOException e) {
//                System.out.println("Oh no! Something went wrong.");
//            } finally {
//                System.out.println(path);
//            }
//        }
    }
}
