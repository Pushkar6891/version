package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamsTest {

	public static void main(String[] args) {

		List<Product> productList = Arrays.asList(new Product(23, "potatoes"), new Product(14, "orange"),
				new Product(13, "lemon"), new Product(23, "bread"), new Product(13, "sugar"));
		// 1.Creating parallelStream from collection
		Stream<Product> streamOfCollection = productList.parallelStream();
		boolean isParallel1 = streamOfCollection.isParallel();
		System.out.println(isParallel1);
		boolean bigPrice = streamOfCollection.map(product -> product.getPrice() * 12).anyMatch(price -> price > 200);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println(bigPrice);

		// 2.Creating parallel Stream from IntStream,LongStream and DoubleStream
		System.out.println("-------------------------------------------------------------------------------");
		IntStream intStreamParallel = IntStream.range(1, 150).parallel();
		boolean isParallel2 = intStreamParallel.isParallel();
		System.out.println(isParallel2);

		// 3.Convert stream from parallel sequential mode
		System.out.println("-------------------------------------------------------------------------------");
		IntStream intStreamSequential = intStreamParallel.sequential();
		boolean isParallel3 = intStreamSequential.isParallel();

		System.out.println(isParallel3);

	}

}
