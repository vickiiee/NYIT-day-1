package mar11;

//Vickie Wu
//March 11

public class SalariedEmployee extends Employee{
	
	private double weeklySalary;

	public SalariedEmployee(String first, String last, String ssn, double wage) {
		super(first, last, ssn);
		weeklySalary = wage;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earnings() {
		return weeklySalary;
	}

	public String toString() {
		return "Salaried Employee:\n"+firstName+" "+lastName+
                "\nsocial security number: "+ socialSecurityNumber + "\nWeekly salary: " + earnings()+ "\n";
		
	}
}
