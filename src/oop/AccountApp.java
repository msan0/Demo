package oop;

public class AccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba = new BankAccount();
		
		ba.increaseRate();
		ba.setRate();
		ba.setTerm(5);
		
		// Polymorphism: It changes	where we are pointing
		InterfaceRate irate = new BankAccount();
		irate.increaseRate();
		irate.setRate();

	}
	
	

}
