package com.company.junit5.util;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

/**
 * @TempDir(TempDirectory Extension) example in JUnit 5
 * @author KK JavaTutorials
 */
public class SharedTempDirectoryTest {

	@TempDir
	static Path sharedTempDir;

	@BeforeAll
	static void beforeAll() {
		System.out.println(sharedTempDir);
	}

	/**
	 * @TempDir as a Method Parameter
	 * @param tempDir
	 * @throws IOException
	 */
	@Test
	void testWithTempDir(@TempDir Path tempDir) throws IOException {

		Path numbersPath = tempDir.resolve("numberstest.txt");

		List<String> numberList = Arrays.asList("100", "200", "300");
		Files.write(numbersPath, numberList);

		assertAll(() -> assertTrue(Files.exists(numbersPath), "File should exist"),
				() -> assertLinesMatch(numberList, Files.readAllLines(numbersPath)));
	}

	/**
	 * @TempDir on an Instance Field
	 * @throws IOException
	 */
	@Test
	void testAsSharedTempDir1() throws IOException {
		Path numbersPath = sharedTempDir.resolve("mynumbers.txt");

		List<String> numberList = Arrays.asList("10", "20", "30");
		Files.write(numbersPath, numberList);

		assertAll(() -> assertTrue(Files.exists(numbersPath), "File should exist"),
				() -> assertLinesMatch(numberList, Files.readAllLines(numbersPath)));
	}

	/**
	 * @TempDir on an Instance Field
	 * @throws IOException
	 */
	@Test
	void testAsSharedTempDir2() throws IOException {
		Path path = sharedTempDir.resolve("names.txt");

		List<String> nameList = Arrays.asList("KK", "PK", "SK");
		Files.write(path, nameList);
		assertLinesMatch(nameList, Files.readAllLines(path));
	}

	@AfterAll
	static void afterAll() {
		System.out.println(sharedTempDir.getFileName());
	}
}