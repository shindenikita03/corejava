package com.Training;

public class Demo3 {
		public void isVoteEligible(int age) {
			if ((age>=18) && (age<=50)){
				System.out.println("is person eligible");
			 }
			else {
				System.out.println("person not eligible");
			}
			
			}
		public void checkEvenOdd( int number) {
			if (number % 2 == 0) {
				System.out.println(number + " is even number");
			}else {
				System.out.println(number + "is odd number");
			}
		}
		public void checkDivisibility( int number) {
			if( number %2 ==0) {
				System.out.println("is divisible by 2 ");
			}
			else if (number %5 == 0)  {
				System.out.println("is divisible by 5");
				
			}
			else {
				System.out.println("invalid");
			}
		}

		
		
public static void main(String[] args) {
	Demo3 ob = new Demo3(); 
	int number = 47;
	//ob.isVoteEligible(age) 
	//ob.checkEvenOdd(number);
	ob.checkDivisibility(number);
	
	
	
	
	
	
}
		

}
