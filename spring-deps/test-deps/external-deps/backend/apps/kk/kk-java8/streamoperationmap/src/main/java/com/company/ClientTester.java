package com.company;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTester {

	public static void main(String[] args) {

		List<String> uris = new ArrayList<>();
		uris.add("C:\\Myfile1.txt");
		uris.add("D:\\Myfile2.txt");
		uris.add("C:\\Myfile3.txt");

	//	Stream<Path> map = uris.stream().map(uri -> Paths.get(uri));
		Stream<Path> map = uris.stream().map(Paths::get);
		map.forEach(System.out::println);

		System.out.println("-------------------------");

		List<Detail> details = new ArrayList<>();

		List<String> parts1 = new ArrayList<>();
		parts1.add("Part_1");
		parts1.add("Part_2");
		parts1.add("Part_3");

		List<String> parts2 = new ArrayList<>();
		parts2.add("Part_1");
		parts2.add("Part_2");
		parts2.add("Part_3");
		parts2.add("Part_4");
		Detail detail1 = new Detail(1001, parts1);
		Detail detail2 = new Detail(1002, parts2);

		details.add(detail1);
		details.add(detail2);

		Stream<String> flatMapStream = details.stream().flatMap(detail -> detail.getParts().stream());
		flatMapStream.forEach(System.out::println);
	}

}
