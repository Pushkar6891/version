package com.company.questions.techmahindra.eg01filereading;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class FileReading {
    public static void main(String[] args) throws IOException {
        FileReading obj = new FileReading();
        // obj.usingFiles();
        // obj.usingFilesAnCharSet();
    }

    public void usingFiles() throws IOException {
        Path path = Paths.get("cities.txt");
        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void usingFilesAnCharSet() throws IOException {
        Path path = Paths.get("cities.txt");
        try (Stream<String> stream = Files.lines(path, Charset.forName("UTF-8"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void working1() throws IOException {
        InputStream inputStream = new FileInputStream("cities.txt");
        InputStreamReader isReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(isReader);
        StringBuffer sb = new StringBuffer();
        String str;
        while ((str = reader.readLine()) != null) {
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}