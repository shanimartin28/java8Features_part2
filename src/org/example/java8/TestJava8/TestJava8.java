package org.example.java8.TestJava8;

public class TestJava8 {

	public static void main(String[] args) {

		// An instance of a functional interface using a lambda expression
		TestInterface tester = () -> System.out.println("Java 8  works :->!");
		tester.test();

	}

}
