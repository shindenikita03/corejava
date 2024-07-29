package com.wipro.exceptions;

public class ExceptionHandling {
public static void main(String[]args) {
	System.out.println(divideNumbers(4,2));
	System.out.println(divideNumbers(4,0));
}
public static String divideNumbers(int a, int b) {
	try {
	int c= a/b;
	return "Result:"+c;
	}
	catch(ArithmeticException ae)
	{
	
	return "Error: Division by zero not allowed.";
	}
}

}

