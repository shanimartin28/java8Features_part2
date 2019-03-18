package org.example.java8.FilterCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.example.java8.FilterCollection.model.Person;

public class PredicateInnerClass {
	public static void main(String args[]){
		 
		List<Person> people = new ArrayList<>();
 
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Predicate<Person> pred=new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getAge()>40;
			}
		};
		System.out.println("People older than 40:");
		for(Person person:people){
			//if.... Indsæt kode
			if(person.getAge()>40){
				System.out.println(person.getAge() + " ");
			}else{
				System.out.println(person.getAge() + " ");
			}
		}
	}
}
