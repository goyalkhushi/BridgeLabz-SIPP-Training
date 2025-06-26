package level1;

public class BankAccount {
	
	static String bankName="XYZ";
	static int totalAccounts=0;
	
	final int accountNumber;
	
	String accountHolderName;
	double balance;
	
	BankAccount(String accountHolderName,int accountNumber,double balance){
		this.accountHolderName=accountHolderName;
		this.accountNumber = accountNumber;  
		this.balance=balance;
		totalAccounts++;
		
	}
	
	static void getTotalAccounts() {
		System.out.println("Total Number of accounts: " +totalAccounts);
	}

	
	void displayInfo() {
			System.out.println("Bank Name: " + bankName);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	}
	
	public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount("John Doe", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Jane Smith", 1002, 8000.0);

       //instanceof will check the object is  an instance of class 
        if (acc1 instanceof BankAccount) {
            System.out.println("\nAccount 1 Details:");
            acc1.displayInfo();
        }

        if (acc2 instanceof BankAccount) {
            System.out.println("\nAccount 2 Details:");
            acc2.displayInfo();
        }
        BankAccount.getTotalAccounts();
    }
	
}



