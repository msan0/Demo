package oop;

public class BankAccount implements InterfaceRate{
	
	// Instance Variables
	private String name;
	private String address;
	private int accountNumber;
	private int ssn;
	private double balance = 0;
	
	// Static >> belongs to the CLASS, not the object instance.
	// Final >> is like a constant, Often static and final go together.
	private static final String isfc = "EQUA1234"; 
	
	// Constructor definition: unique methods
		// 1. They are used to define or setup or initialize properties of an object.
		// 2. Constructors are called IMPLICITLY upon instantiation.
		// 3. It has same name as class name.
		// 4. Constructors have no return type
	
	BankAccount(){
		System.out.println("New Account Created.");
	}
	
	BankAccount(String name){}
	
	// Overloading is calling same method with different arguments.
	
	BankAccount(String name, double initDeposit){
		
		// initDeposit, name, msg are local variables.
			
		String msg = null;
		
		if(initDeposit < 1000) {
			msg = "Error : Your balance is low";
		}
		else {
			msg = "Thank you for your initial deposit of $"+initDeposit;
		}
		System.out.println(msg);
		balance = balance + initDeposit;
		
		
	}
	
	// Getters and Setters
	
	// Allow user to define the name
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getAccoutNumber() {
		return accountNumber;
	}
	
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	
	public int getSsn() {
		return ssn;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Interface methods
	
	public void setRate() {
		System.out.println("Setting rate");
	}
	
	public void increaseRate() {
		System.out.println("Increamenting rate");
	}
	
	// Define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	void checkBalance() {
		System.out.println("Balance : $"+balance);
	} 
	
	void getStatus() {
		System.out.println("Name : "+name+" , Account Number : "+ accountNumber+" , Balance : $"+balance);
	}
	
	// Private: can only be called within the class.
	private void showActivity(String activity) {
		System.out.println("Your recent activity : "+activity);
		System.out.println("Your new balance is : $"+balance);
	}
	
	public void setTerm(int year) {
		System.out.println("Setting the term to : "+ year +" years");
	}
	
}
