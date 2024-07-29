
public class Main {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000); 

        try {
            System.out.println("Attempting to withdraw $500...");
            account.withdraw(500); 
            System.out.println("Attempting to withdraw $600...");
            account.withdraw(600); 
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Remaining balance: " + account.getBalance());
    }
}

