package org.example.java8.MethodReferences;

import java.util.ArrayList;
import java.util.List;

import org.example.java8.MethodReferences.model.Person;

public class StaticMethodReference {
	public static void main(String args[]){
		 
		List<Person> people = new ArrayList<>();
		 
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Lucky", 7));
		people.add(new Person("Mike", 73));
		// Indsæt kode
 
		//people.sort compareAges
		//...println(p)); for each :-)
		people.sort(StaticMethodReference::compareAges);
		people.forEach((p)->System.out.println(p));
	}

	public static int compareAges(Person p1, Person p2){
		Integer age1=p1.getAge();
		return age1.compareTo(p2.getAge());
	}
	
}
