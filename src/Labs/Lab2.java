package Labs;

public class Lab2 {

	public static void main(String[] args) {
		// Create a student
		
		Student s = new Student("Mayur", "123456789");
		s.enroll("English");
		s.enroll("History");
		
		s.showCourses();
		s.checkBalance();
		s.payTuition(600);
		s.checkBalance();
		System.out.println(s.toString());
	

	}

}


class Student{
	
	// Properties
	
	private static int id = 1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String course = "" ;
	private static final int costOfCourse = 800;
	private int balance = 0 ;
	
	
	public Student(String name, String ssn) {
		id++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserId();
		
	}
	
	
	
	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	private void setEmail() {
		email = name.toLowerCase()+"."+id +"@gmail.com";
		System.out.println("Your email is : "+email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int random = (int)(Math.random() * ((max - min)));
		random = random + min;
		System.out.println(random);
		userId = id +""+ random + ssn.substring(5);
		System.out.println("UserId :"+userId);
	}
	
	public void enroll(String course) {
		this.course = this.course + "\n"+ course;
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		System.out.println("Payment : "+amount);
		balance = balance - amount;
		
		
	}
	
	public void checkBalance() {
		System.out.println("Balance :"+balance);
	}
	
	public void showCourses() {
		System.out.println("Courses :"+course);
	}
	@Override
	public String toString() {
		return "Name : "+name + "\nCourses : "+course+"\nBalance : "+balance;
	}
}

