public class Accounts {
	protected String name;
	protected int accountNumber;
	protected double balance;
	public int fee = 5000;
	
	public Accounts(String name, int accountNumber, double initBalance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = initBalance;
	}
	
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && balance >= 50000+fee) {
            balance -= (amount+fee);
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
	
}
