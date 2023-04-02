package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ClientTester4 {

	public static void main(String[] args) {

		Path p = Paths.get(".");

		try (Stream<Path> matches = Files.find(p, 2,
				(path, BasicFileAttributes) -> String.valueOf(path).endsWith(".txt"));) {
			matches.map(path -> path.getFileName()).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}