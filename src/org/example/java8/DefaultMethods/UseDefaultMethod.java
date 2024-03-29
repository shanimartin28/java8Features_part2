package org.example.java8.DefaultMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.DefaultMethods.model.Person;

public class UseDefaultMethod {
	public static void main(String args[]){

		List<Person> people = new ArrayList<>();

		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		Predicate<Person> pred = (p) -> p.getAge() > 40;

		displayPeople(people, pred);

	}

	private static void displayPeople(List<Person> people,
			Predicate<Person> pred) {
		System.out.println("Selected:");
		people.forEach(p -> {
			if (pred.test(p))
			{
				// String info = p.getName() + "( " + p.getAge() + ")";				
				System.out.println(p.getPersonInfo());
			}			
		});
	}
	
}