package basics;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle ;
		bookTitle = "The Lord of the Rings.";
		
		if(bookTitle.contains("Rings")) {
			System.out.println("Found the word Rings");
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}

	}

}
