public class CommissionEmployee extends Employee{
	private int commissionRate;
	private double grossSales;

	public CommissionEmployee(String first, String last, String ssn, int commission, double g_sales){
		super(first, last, ssn);
		this.commissionRate = commission;
		this.grossSales = g_sales;
	}

	public int getCommisionRate(){
		return commissionRate;
	}

	public void setCommisionRate(int rate){
		commissionRate = rate;
	}

	public double getGrossSales(){
		return grossSales;
	}
}
