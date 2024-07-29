package Assignments;
import java.util.Scanner;
public class UniqueNumberChecker {



public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int number = scanner.nextInt();
    scanner.close();

    if (isUnique(number)) {
        System.out.println(number + " is a Unique number.");
    } else {
        System.out.println(number + " is not a Unique number.");
    }
}

public static boolean isUnique(int num) {
    
    String str = String.valueOf(num);
    boolean[] visited = new boolean[10]; 

    for (int i = 0; i < str.length(); i++) {
        int digit = str.charAt(i) - '0'; 
        if (visited[digit]) {
            return false; 
        }
        visited[digit] = true; 
    }

    return true; 
}
}






    
    