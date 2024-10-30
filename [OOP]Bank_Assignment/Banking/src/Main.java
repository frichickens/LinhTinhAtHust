import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
        // Create a regular bank account
		Banking_System Bank_Sys = new Banking_System();
        
        Accounts user1 = new Accounts("Skibdi Toilet","1020393920102",32000000);
        Accounts user2 = new Accounts("Zhong Xina","1010101010101",50000000);
        Accounts user3 = new Accounts("Camavinga","202021010302",100000000);
        Saving_Accounts user4 = new Saving_Accounts("Bob", "67890", 1000.0, 5.0);
        
        Bank_Sys.addCustomer(user1);
        Bank_Sys.addCustomer(user2);
        Bank_Sys.addCustomer(user3);
        Bank_Sys.addCustomer(user4);
        
        ArrayList<Accounts> Accounts = Bank_Sys.getCustomers();
        System.out.println("INNFORMATION OF USERS: " + "\n");
        for (Accounts Acc : Accounts){
            Acc.displayAccountInfo();
            System.out.println();
        }
        
    }
}
