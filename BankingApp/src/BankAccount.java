public class BankAccount {
	    private double balance;

	    
	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    
	    public void withdraw(double amount) throws InsufficientFundsException {
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
	        }
	        balance -= amount;
	        System.out.println("Withdrawal successful. New balance: " + balance);
	    }

	    
	    public double getBalance() {
	        return balance;
	    }
	}


