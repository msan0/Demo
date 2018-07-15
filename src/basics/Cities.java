package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array.
		
		String[] cities = {"New York","San Francisco","Miami","Los Angeles"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		// Declare the array
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		
		System.out.println(countries[2]);
		
		
		System.out.println("************");
		// Declare and defined the array (only size)
		
				String[] states = new String[5];
				states[0] = "California";
				states[1] = "New York";
				states[2] = "Texas";
				states[3] = "New Jersey";
				states[4] = "Nevada";
				
				int i = 0;
			
				// Do Loop: enters the loop THEN tests the condition	
				do {
					
				System.out.println("STATE : "+states[i]);
				i = i + 1;
				
				}while(i < 5);
				
				// While Loop: Tests the condition first THEN enters the loop
				int n = 0;
				boolean stateFound = false;
				while(!stateFound) {
					String state = states[n];
				System.out.println("states");
					if(state == "Nevada") {
						System.out.println("State Found!");
						stateFound = true;
					}
					System.out.println("STATE at : "+n+" : "+states[n]);
					n++;
				}
				
				
				// For Loop : Best structure for iterating through array
				System.out.println("\nPrinting with for loop\n");
				for(int x = 0; x < 5; x++) {
					System.out.println(states[x]);
				}
	}

}
