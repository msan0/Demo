package oop;

 class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
		
	}
	
	void emailid() {
		System.out.println("The email is : " + email);
	}
	
	void phoneNumber(){
		System.out.println("The phone number is : "+ phone);
	}
}
public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Random";
		person1.email = "abcd@gmail.com";
		person1.phone = "123456789";
		
		// Abstraction
		person1.walk();
		person1.emailid();
		person1.phoneNumber();
	/*	// Person
		// attributes, variables
		String name = "Mayur";
		String email = "mayur@gmail.com";
		String phone = "987654321";
		
		// Action, Activity, Behavior
		
	//	System.out.println(name + " is walking");
		
		walking(name);
		emailid(email);
		phoneNumber(phone);
	
	}
	// Enhance by adding function to minimize the code.
	public static void walking(String name ) {
		System.out.println(name + " is walking.");
	}
	
	static void emailid(String email) {
		System.out.println("Email address is : "+email);
	}
	
	static void phoneNumber(String phone) {
		System.out.println("The phone number is : " + phone);
	}
*/
}

}