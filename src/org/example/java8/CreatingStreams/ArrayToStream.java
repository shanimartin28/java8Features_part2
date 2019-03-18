package org.example.java8.CreatingStreams;

 
import java.util.Arrays;
import java.util.stream.Stream;

import org.example.java8.CreatingStreams.model.Person;

public class ArrayToStream {
	public static void main(String args[]){

		Person[] people = {
				new Person("Joe", 48), 
				new Person("Mary", 30),
				new Person("Mike", 73)};
//	original version
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].getInfo());
		}
//	version using Stream interface	
//  Indsæt kode

	Stream<Person> stream1 = Arrays.stream(people);
	//stream1.forEach(x -> System.out.println(x));
	stream1.forEach(x -> System.out.println(x.getInfo()));

//	version using Arrays interface
//  Indsæt kode
	System.out.println(Arrays.asList(people));
	for (int i = 0; i < Arrays.asList(people).size(); i++) {
		System.out.println(Arrays.asList(people).get(i).getInfo());
	}

	}
}