package com.Training;

public class Demo2 {
	public int Adddition( int a, int b) {
		
		System.out.println("Nikita");
		return (a+b); 
		
	}
public int Substraction( int a, int b) {
		
		System.out.println("Nikita");
		return (a-b); 
}

public int Multiplication( int a, int b) {

	
	System.out.println("Nikita");
	return (a*b); 
}
public int Division( int a, int b) {
	
	System.out.println("Nikita");
	return (a/b); 
}
public static void main(String[] args) {
	System.out.println("anything");
	  Demo2 ob = new Demo2();
		System.out.println( ob.Adddition(3,5));
		System.out.println( ob.Substraction(3,5));
		System.out.println( ob.Multiplication(3,5));
		System.out.println( ob.Division(3,5));

}
}
