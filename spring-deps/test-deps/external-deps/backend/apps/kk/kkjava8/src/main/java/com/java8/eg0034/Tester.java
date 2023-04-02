package com.java8.eg0034;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {

		List<String> cities = new ArrayList<>();
		cities.add("Mumbai");
		cities.add("Kolkata");
		cities.add("Delhi");
		cities.add("Chennai");

		// Stream of String to Stream of Path
		Stream<Path> map = cities.stream().map(citi -> Paths.get(citi));
		map.forEach(System.out::println);

		System.out.println();

		List<City> cityList = new ArrayList<>();

		List<String> cities_upper = new ArrayList<>();
		cities_upper.add("Delhi");
		cities_upper.add("Mumbai");
		cities_upper.add("Chennai");

		List<String> cities_lower = new ArrayList<>();
		cities_lower.add("Bhopal");
		cities_lower.add("Indore");
		cities_lower.add("Patna");
		cities_lower.add("Bhubaneshwar");

		City cities_tier1 = new City(1, cities_upper);
		City cities_tier2 = new City(2, cities_lower);

		cityList.add(cities_tier1);
		cityList.add(cities_tier2);

		Stream<String> flatMapStream = cityList.stream().flatMap(city -> city.getCities().stream());
		flatMapStream.forEach(System.out::println);
	}

}
