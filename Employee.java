public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNum;

	public Employee(String first, String last, String ssn){
		this.firstName = first;
		this.lastName = last;
		this.socialSecurityNum= ssn;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String first){
		firstName = first;
	}

	public String getLastName(){
		return lastName;
	}

	public void setLastName(String last){
		lastName = last;
	}

	public String getSocialSecurityNum(){
		return socialSecurityNum;
	}
	
	public void setSocialSecurityNum(String ssn){
		socialSecurityNum = ssn;
	}
}
