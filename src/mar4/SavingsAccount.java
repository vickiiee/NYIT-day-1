package mar4;

public class SavingsAccount extends Account{

	private double interest;
	private double bal;
	
	public SavingsAccount(int accNum) {
		super(accNum);
		
	}
	
	public void addInterest() {
		bal = getBalance()+getBalance()*interest;
	}
	
	public void setInterest(double interest) {
		this.interest =  interest;
	}
	
	

}
