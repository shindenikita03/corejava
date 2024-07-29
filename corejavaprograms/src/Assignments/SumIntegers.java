package Assignments;
import java.util.Scanner;
public class SumIntegers{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    
    System.out.println("Enter numbers to sum. To stop, enter a non-integer value:");

    while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            sum += number;
        } else {
            System.out.println("Error: Non-integer value encountered.");
            break;
        }
    }

    System.out.println("Total sum: " + sum);
    scanner.close();
}
}

