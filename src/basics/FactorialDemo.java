package basics;

public class FactorialDemo {

	public static void main(String[] args) {
		// Factorial
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		System.out.println("Factorial : "+fact(5));
		int[] numbers = {10,20,30,40,150};
		
		System.out.println("Minimum number is : "+min(numbers));
		
		System.out.println("Maximum number is : " +max(numbers));
		
		System.out.println("Average of the elements of the array is :"+avg(numbers));

	}
	
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		
		System.out.println(n);
		return (fact(n - 1) * n); 
	} 
	
	// 3 Functions that return min, max and average of an array
	
	public static int min(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int max(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int avg(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i <arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum is : "+sum);
		return sum/arr.length;
	}
		
		
	}
	


