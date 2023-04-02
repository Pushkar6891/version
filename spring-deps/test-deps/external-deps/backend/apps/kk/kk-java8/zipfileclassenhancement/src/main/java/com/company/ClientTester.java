package com.company;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ClientTester {

	public static void main(String[] args) {

		try (ZipFile zipFile = new ZipFile("MyFolder1.zip")) {
			Stream<? extends ZipEntry> stream = zipFile.stream();
			stream.forEach(System.out::println);
			System.out.println("--------------------------------------------");

			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry zipEntry = entries.nextElement();
				System.out.println("Directory & File Name:" + zipEntry.getName());
				InputStream inputStream = zipFile.getInputStream(zipEntry);
				BufferedReader bufferedReader = new BufferedReader(
						new InputStreamReader(inputStream, StandardCharsets.UTF_8));
				Stream<String> lines = bufferedReader.lines();
				lines.forEach(System.out::println);

				System.out.println("---------------------------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}