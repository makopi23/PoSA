package chapter03;

public class PersonName {
	private String firstName;
	private String lastName;
	
	public PersonName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	String fullName() {
		return String.format("%s %s", firstName, lastName);
	}
}
