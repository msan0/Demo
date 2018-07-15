package Bank;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc = new Account("123456789", 1000);
		Account acc2 = new Account("654879123", 2000);
		Account acc3 = new Account("134657894", 3000);
		
		acc.setName("Mayur");
		System.out.println(acc.getName());
		
		acc.makeDeposit(500);
		acc.makeDeposit(600);
		acc.payBill(1000);
		acc.accrue();
		
		System.out.println(acc.toString());

	}

}

class Account implements Iinterest{
	// Properties of Account
	private static int id = 100 ;  	//  Internal ID	
	private String accountNumber;   // ID + random 2 digit number + first two of ssn
	private String name;
	private double balance;
	private String ssn;
	private static final String ifsc = "EQUA1234";
	
	// Constructor
	public Account(String ssn, double initDeposit) {
//		System.out.println("New account created");
		balance = initDeposit;
		this.ssn = ssn;
		id++;
//		System.out.println(id);
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
//		System.out.println(random);
		
		 accountNumber = id + "" + random + ssn.substring(0,2); 
		 System.out.println("Your Account Number is : "+accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill : "+amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit :"+amount);
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance : "+balance);
	}
	
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
		
	}
	
	@Override
	public String toString() {
	
		return "Name : "+ name+"\nAccount Number : "+accountNumber+"\nIFSC code : "+ifsc+"\nBalance : "+balance;
	}
}
