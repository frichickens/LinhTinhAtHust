public class Saving_Accounts extends Accounts {
	protected double annualInterestRate;
	protected String accountType;
	
	public Saving_Accounts(String name, String accountNumber, double initialBalance, double annualInterestRate) {
        super(name, accountNumber, initialBalance);
        this.annualInterestRate = annualInterestRate;
        this.accountType = "Saving Account";
    }
	
	@Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed from a saving account.");
    }
	
	public void addMonthlyInterest() {
        double interest = balance * annualInterestRate / 12;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
	
	@Override
	public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Type: " + accountType);
    }
}
