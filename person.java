
public class person {	
	public String firstName;
	public String lastName;
	
	public person() {
		firstName = "Hello";
		lastName = "Kitty";
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public static void main(String args[]) {

		

		System.out.println("Person program was run");
	}
}