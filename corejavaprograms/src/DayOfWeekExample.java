	import java.util.Scanner;

	public class DayOfWeekExample {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a number between 1 and 7:");
	        int day = scanner.nextInt();
	        
	        // Using if-else if ladder
	        System.out.println("Using if-else if ladder:");
	        if (day == 1) {
	            System.out.println("Monday");
	        } else if (day == 2) {
	            System.out.println("Tuesday");
	        } else if (day == 3) {
	            System.out.println("Wednesday");
	        } else if (day == 4) {
	            System.out.println("Thursday");
	        } else if (day == 5) {
	            System.out.println("Friday");
	        } else if (day == 6) {
	            System.out.println("Saturday");
	        } else if (day == 7) {
	            System.out.println("Sunday");
	        } else {
	            System.out.println("Invalid number. Please enter a number between 1 and 7.");
	        }
	        
	        // Using switch-case statement
	        System.out.println("\nUsing switch-case statement:");
	        switch (day) {
	            case 1:
	                System.out.println("Monday");
	                break;
	            case 2:
	                System.out.println("Tuesday");
	                break;
	            case 3:
	                System.out.println("Wednesday");
	                break;
	            case 4:
	                System.out.println("Thursday");
	                break;
	            case 5:
	                System.out.println("Friday");
	                break;
	            case 6:
	                System.out.println("Saturday");
	                break;
	            case 7:
	                System.out.println("Sunday");
	                break;
	            default:
	                System.out.println("Invalid number. Please enter a number between 1 and 7.");
	                break;
	        }

	        scanner.close();
	    }
	}


