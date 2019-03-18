package org.example.java8.AggregatingStreams;

import java.util.ArrayList;
import java.util.List;

public class CountItems {
	public static void main(String args[]){

		System.out.println("Creating list");
		List<String> strings = new ArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			strings.add("Item " + i);
		}
		
//		strings.stream()
//			.parallel()
//			.forEach(str -> System.out.println(str));
		
		// we want actually to count items
		//Indsæt kode

		Long count = strings.stream().mapToLong(e -> 1L).sum();

		long count2 = strings.stream().parallel().count(); // In cases of large amount of data

		System.out.println("Count: " + count);
		System.out.println("count2: " + count2);
	
	}
	
}