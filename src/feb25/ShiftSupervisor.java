package feb25;

//VIckie Wu
//Feb24
public class ShiftSupervisor extends Employee {

	private double annualSalary;
	private double bonus;

	public ShiftSupervisor() {
		// TODO Auto-generated constructor stub
	}

	public ShiftSupervisor(String name, String id, String hd, double sal, double bonus) {
		super(name, id, hd);
		this.annualSalary = sal;
		this.bonus = bonus;
	}

	public double getSalary() {
		return annualSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setSalary(double num) {
		annualSalary = num;
	}

	public void setBonus(double num) {
		bonus = num;
	}
	
	public String toString() {
		 return "Name: " + getName() + "\n"
				+ "Employee Number: " + getEmployeeNumber() + "\n"
				+ "Hire Date: " + getHireDate() + "\n"
				+ "Annual Salary: $" + getSalary() + "\n"
				+ "Production bonus: $" + getBonus();
	}
}
