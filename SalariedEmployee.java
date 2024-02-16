
public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String first, String last, String ssn, double weeklySal){
		super(first, last, ssn);
		this.weeklySalary = weeklySal;
	}

	public double getWeeklySalary(){
		return weeklySalary;
	}

	public void setWeeklySalary(double salary){
		weeklySalary = salary;
	}
}
