import java.util.ArrayList;
public class Banking_System {
	protected ArrayList<Accounts> accounts;
	public Banking_System() {
		accounts = new ArrayList<Accounts>();
	}
	
	public void addCustomer(Accounts customer) {
		accounts.add(customer);
	}
	
	public void removeCustomer(Accounts customer) {
		accounts.remove(customer);
	}
	
	public ArrayList<Accounts> getCustomers(){
        return accounts;
    }
}
