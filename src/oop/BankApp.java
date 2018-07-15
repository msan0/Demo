package oop;

public class BankApp {

	public static void main(String[] args) {
		// Create a new bank account >> Instantiate an object
		
		BankAccount account1 = new BankAccount();
	//	account1.name = "Mayur";
	// 	With Encapsulation : Public API Method.
		account1.setName("Mayur");
		System.out.println(account1.getName());
	//	account1.accountNumber = 123456789;
		account1.setAccountNumber(123456789);
		System.out.println(account1.getAccoutNumber());
	//	account1.balance = 5000;
		account1.setAddress("Prague");
		System.out.println(account1.getAddress());
		
		account1.setSsn(123457499);
		System.out.println(account1.getSsn());
		
		account1.setBalance(5000);
		System.out.println(account1.getBalance());
		account1.deposit(5000);
		account1.withdraw(2000);
		account1.getStatus();
		
		account1.setRate();
		account1.increaseRate();
		
		
		// Polymorphism through overloading	
		
		BankAccount account3 = new BankAccount("Random User");
		account3.checkBalance();
		
		BankAccount account2 = new BankAccount("Random", 5000);
		account2.checkBalance();
	

	}

}
