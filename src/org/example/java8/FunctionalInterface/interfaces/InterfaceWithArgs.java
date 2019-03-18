package org.example.java8.FunctionalInterface.interfaces;

@FunctionalInterface
public interface InterfaceWithArgs {
	
	public int calculate(int value1, int value2);	
	public default int hundred(int value1, int value2){
		return calculate(value1,value2*100);
	}
}
