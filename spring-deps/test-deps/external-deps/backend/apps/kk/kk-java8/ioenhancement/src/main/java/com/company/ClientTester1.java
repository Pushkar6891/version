package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ClientTester1 {

    public static void main(String[] args) {
        Stream<Path> list = null;
        Stream<Path> list2 = null;
        try {
            list = Files.list(Paths.get("."));
            list.forEach(System.out::println);

            System.out.println("--------------------------------------------------");
            Files.list(Paths.get("src/main/java/com/company")).filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (list != null)
                list.close();
            if (list2 != null)
                list2.close();
        }
    }

}