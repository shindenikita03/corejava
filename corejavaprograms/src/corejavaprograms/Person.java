package corejavaprograms;

public class Person {
//attributes
	String name;
	int age;
	
	//constructor
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	 public static void main(String[] args){
		 Person person = new Person("nikita", 23);
			
			System.out.println("Name:"+ person.name);
			System.out.println("Age:" + person.age);


	 }
 }