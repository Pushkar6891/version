package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class ClientTester8 {

	public static void main(String[] args) throws IOException {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"))) {
			Stream<String> lines = bufferedReader.lines();
			lines.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}