package level2;

public class ATM {
	
	String accountholder;
	String Accountnumber;
	double balance;
	
	
	public ATM(String accountholder,String Accountnumber,double balance) {
		this.accountholder=accountholder;
		this.Accountnumber=Accountnumber;
		this.balance=balance;
		
	}
	

	public void displayinfo() {
		System.out.println("Account Holder:" +accountholder);
		System.out.println("Account Number:" +Accountnumber);
		System.out.println("Account Balance:" +balance);
		
	}
	
	public void deposit(int amount) {
		 if (amount > 0) {
	            balance += amount;
	            System.out.println("₹" + amount + " deposited successfully.");
	        } 
		 else {
	            System.out.println("Deposit amount must be positive.");
	        }
	}
	
	public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } 
        else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }
	
	
	public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

	
	public static void main(String[] args) {
		 ATM account = new ATM("Khushi Goyal", "1234567890", 5000.0);
		 account.displayinfo();
	     System.out.println();
	     
	     account.deposit(2000);
	     account.displayBalance();
	     account.withdraw(3000);
	     account.displayBalance();
	     


		
	}
	

}
