package com.company;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ClientTester7 {

	public static void main(String[] args) {
		Path start = Paths.get("/usr/bin");
		try (Stream<Path> walk = Files.walk(start, Integer.MAX_VALUE, FileVisitOption.FOLLOW_LINKS)) {
			walk.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}