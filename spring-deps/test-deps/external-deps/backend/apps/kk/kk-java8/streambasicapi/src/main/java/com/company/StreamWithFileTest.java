package com.company;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithFileTest {

	public static void main(String[] args)  {

		Path path = Paths.get("test.txt");
		try(Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
			lines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
