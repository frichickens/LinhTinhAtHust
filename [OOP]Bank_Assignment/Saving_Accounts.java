public class Saving_Accounts extends Accounts {
	private double annualInterestRate;
	
	public Saving_Accounts(String name, int accountNumber, double initialBalance, double annualInterestRate) {
        super(name, accountNumber, initialBalance);
        this.annualInterestRate = annualInterestRate;
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
}
