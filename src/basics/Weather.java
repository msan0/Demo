package basics;

public class Weather {

	public static void main(String[] args) {
		// This program will give us suggestions of what to wear based on the weather (temperature) and sun condition
		
		int tempearture = 20;
		String sunCondition = "sunny";
		
		if(tempearture > 80) {
			System.out.println("It's pleasent, wear shorts and t-shirts.");
		}
		else if((tempearture > 60) && (sunCondition == "sunny")) {
			System.out.println("It's a little cooler, perhaps wear a long sleeve shirt and jeans.");
			System.out.println("Wear sun glasses");
			
		}
		else if((tempearture > 50) || (sunCondition == "overcast")){
			System.out.println("This is cool day, make sure you wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day, bring a sweater.");
		}
		System.out.println("The program is ending.");

	}

}
