

public class EmployeeDriver {
	public static void main(String[] args){
		SalariedEmployee joe = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
		HourlyEmployee stephanie = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
		HourlyEmployee mary = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
		CommissionEmployee nicole = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
		SalariedEmployee renwa = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
		BaseEmployee mike = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
		CommissionEmployee mahnaz = new CommissionEmployee("Manhaz", "Vaziri", "777-77-7777", 22, 40000);

		System.out.println("\nSalaried Employees:");
		System.out.println(joe.getFirstName() + " " + joe.getLastName() + ", SSN: " 
			+ joe.getSocialSecurityNum() + ", Weekly Salary: $" + joe.getWeeklySalary());
		System.out.println(renwa.getFirstName() + " " + renwa.getLastName() + ", SSN: "
			 + renwa.getSocialSecurityNum() + ", Weekly Salary: $" + renwa.getWeeklySalary());

		System.out.println("\nHourly Employees:");
		System.out.println(stephanie.getFirstName() + " " + stephanie.getLastName() + ", SSN: " 
			+ stephanie.getSocialSecurityNum() + ", Wage: $" + stephanie.getEmployeeWage() 
			+ ", Hours Worked: " + stephanie.getHoursWorked());
		System.out.println(mary.getFirstName() + " " + mary.getLastName() + ", SSN: " 
			+ mary.getSocialSecurityNum() + ", Wage: $" + mary.getEmployeeWage() 
			+ ", Hours Worked: " + mary.getHoursWorked());

		System.out.println("\nCommision Employees:");
		System.out.println(nicole.getFirstName() + " " + nicole.getLastName() + ", SSN: "
			 + nicole.getSocialSecurityNum() + ", Com Rate: " + nicole.getCommisionRate() 
			 + "%, Gross Salary: $" + nicole.getGrossSales());
		System.out.println(mahnaz.getFirstName() + " " + mahnaz.getLastName() + ", SSN: "
			 + mahnaz.getSocialSecurityNum() + ", Com Rate: " + mahnaz.getCommisionRate() 
			 + "%, Gross Salary: $" + mahnaz.getGrossSales());

		System.out.println("\nBase Employees:");
		System.out.println(mike.getFirstName() + " " + mike.getLastName() + ", SSN: "
			 + mike.getSocialSecurityNum() + ", Base Salary: $" + mike.getBaseSalary());
	}
}
