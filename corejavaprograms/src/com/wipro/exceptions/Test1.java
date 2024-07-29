package com.wipro.exceptions;

public class Test1 {
	
	public static void main (String[] args) {
	 int x = 20;
	 int y= 0;
 try {
	 int z = x/y;
	 System.out.println("division is:" + z);
 }
	 
	 catch(ArithmeticException pq)
		{
			System.out.println("don't enter zero as denominator");
		}
         System.out.println("rest statements will be executed");
 }

}