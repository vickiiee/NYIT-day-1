package mar4;

public class CheckingAccount extends Account{

	private double overDraftLim;
	private int a;
	
	public CheckingAccount(int accNum) {
		super(accNum);
		this.a = accNum;
		// TODO Auto-generated constructor stub
	}

	public void setLimit(double lim) {
		overDraftLim = lim;
	}

	
	/*
	 * (non-Javadoc)
	 * @see mar4.Account#getAccountNumber()
	 * THIS METHOD SHOULDNT BE HERE, WTF
	 */
	public int getAccountNumber() {
		return a;
	}
	
}
