package org.example.java8.DefaultMethods.interfaces;

public interface PersonInterface {
	
	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	default String getPersonInfo(){
		return this.getName()+" -"+this.getAge()+" years old-";
	}
}
