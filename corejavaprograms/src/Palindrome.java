
public class Palindrome {

	    public static void main(String[] args) {
	        System.out.println("Enter a number:");
	        String input = new java.util.Scanner(System.in).nextLine();
	        
	        Palindrome palindrome = new Palindrome();
	        
	        if (palindrome.isPalindrome(input)) {
	            System.out.println(input + " is a palindrome");
	            int sumOfEvenNumbers = palindrome.sumOfEvenDigits(input);
	            if (sumOfEvenNumbers > 25) {
	                System.out.println("and the sum of even numbers is greater than 25");
	            } else {
	           
	            	System.out.println("and the sum of even numbers is less than or equal to 25");
	            }
	        } else {
	            System.out.println(input + " is not a palindrome");
	        }
	    }
	    
	    public boolean isPalindrome(String input) {
	        int length = input.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (input.charAt(i) != input.charAt(length - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public int sumOfEvenDigits(String input) {
	        int sum = 0;
	        for (char c : input.toCharArray()) {
	            int digit = Character.getNumericValue(c);
	            if (digit % 2 == 0) {
	                sum += digit;
	            }
	        }
	        return sum;
	    }
	}

	