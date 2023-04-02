package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class ClientTester3 {

	public static void main(String[] args) {

		Path path = Paths.get("data.txt");

		try (Stream<String> lines = Files.lines(path).onClose(() -> System.out.println("File closed"))) {
			Optional<String> optional = lines.filter(s -> s.contains("line15")).findFirst();
			if (optional.isPresent()) {
				System.out.println(optional.get());
			} else
				System.out.println("No data found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}