public class HourlyEmployee extends Employee{
	private double employeeWage;
	private double hoursWorked;

	public HourlyEmployee(String first, String last, String ssn, double wage, double hours){
		super(first, last, ssn);
		this.employeeWage = wage;
		this.hoursWorked = hours;
	}

	public double getEmployeeWage(){
		return employeeWage;
	}

	public void setEmployeeWage(double wage){
		employeeWage = wage;
	}

	public double getHoursWorked(){
		return hoursWorked;
	}

	public void setHoursWorked(double hours){
		hoursWorked = hours;
	}
}
