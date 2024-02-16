public class BaseEmployee extends Employee{
	private double baseSalary;

	public BaseEmployee(String first, String last, String ssn, double salary){
		super(first, last ,ssn);
		this.baseSalary = salary;
	}

	public double getBaseSalary(){
		return baseSalary;
	}

	public void setBaseSalary(double salary){
		baseSalary = salary;
	}
}
