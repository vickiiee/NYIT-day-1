package mar11;

//Vickie Wu
//March 11

public class CommissionEmployee extends Employee{
	
	private int sale;
	private double percent;

	public CommissionEmployee(String first, String last, String ssn, int sale, double percent) {
		super(first, last, ssn);
		this.sale = sale;
		this.percent = percent;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return sale*percent;
	}

	public String toString() {
		return "Commision Employee:\n"+firstName+" "+lastName+
                "\nsocial security number: "+ socialSecurityNumber + "\nGross sales: " + sale + "\nCommision Rate " + percent + "\nTotal Earnings: " + earnings()+ "\n";
		
	}
}
