public class Main {
	public static void main(String[] args) {
        // Create a regular bank account
        Accounts account1 = new Accounts("Alice", 12345, 500.0);
        account1.displayAccountInfo();
        account1.deposit(200.0);
        account1.withdraw(100.0);
        account1.displayAccountInfo();

        // Create a saving account
        Saving_Accounts savingAccount = new Saving_Accounts("Bob", 67890, 1000.0, 5.0);
        savingAccount.displayAccountInfo();
        savingAccount.deposit(300.0);
        savingAccount.withdraw(100.0); // Should not be allowed
        savingAccount.addMonthlyInterest();
        savingAccount.displayAccountInfo();
    }
}
