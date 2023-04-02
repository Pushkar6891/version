package com.java8.eg0064;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		
			List<String> list = Arrays.asList("Carter","James","Davis","Zorra","Barry","Zola");
			
			Comparator<String> comp = Comparator.comparingInt(String::length);
			Collections.sort(list, comp);
			list.forEach(System.out::println);
		
	}

}