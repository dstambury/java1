//Author: Daniel E. Stambury


package pckg;

public class Name {
	
	//variables
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name(String fn, String mn, String ln) {
		firstName = fn;
		middleName = mn;
		lastName = ln;
	}//end constructor
	
	public String getFirstName() {
		return firstName;
	}//end getFirstName getter
	
	public void setFirstName(String fn) {
		firstName = fn;
	}//end setFirstName setter
	
	public String getMiddleName() {
		return middleName;
	}//end getMiddleName getter
	
	public void setMiddleName(String mn) {
		middleName = mn;
	}//end setMiddleName setter
	
	public String getLastName() {
		return lastName;
	}//end getLastName getter
	
	public void setLastName(String ln) {
		lastName = ln;
	}//end setLastName setter

	public String toString() {
		String result;
		if (middleName != " ") {
			result = firstName + " " + middleName + " " + lastName;
		} else {
			result = firstName + " " + lastName;

		}//end if-else statement
		return result;
	}//end toString method
}//end Name class
