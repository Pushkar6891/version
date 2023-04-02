package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ClientTester5 {

	public static void main(String[] args) {

		readAllLinesFromFile();
		System.out.println("------------------------");
		readAllLinesFromFileWithCharset();
		System.out.println("------------------------");
		newBufferedReader();
		System.out.println("------------------------");
		newBufferedReaderWithCharset();
	}

	private static void readAllLinesFromFile() {
		Path path = Paths.get("data.txt");
		try {
			List<String> readAllLines = Files.readAllLines(path);
			readAllLines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readAllLinesFromFileWithCharset() {
		Path path = Paths.get("data.txt");
		try {
			List<String> readAllLines = Files.readAllLines(path, Charset.forName("UTF-8"));
			readAllLines.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void newBufferedReader() {
		Path path = Paths.get("data.txt");
		try {
			BufferedReader br = Files.newBufferedReader(path);
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void newBufferedReaderWithCharset() {
		Path path = Paths.get("data.txt");
		try {
			BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"));
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
