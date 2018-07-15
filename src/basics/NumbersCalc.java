package basics;

public class NumbersCalc {
	
	static void printName() {
		System.out.println("My name is Mayur");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers : " +numberA + " And " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product, product); 
		return product;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printName();
		
	//	int numA = 20;
	//	int numB = 30;
		
		addNumbers(20,30);
		
		System.out.println("The product of numbers is "+multiplyNumbers(50, 10));

	}

}
