package org.example.java8.FunctionalInterface;

import org.example.java8.FunctionalInterface.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {
		SimpleInterface i=() -> System.out.println("Bestseller");
		i.doSomething();
	}

}
