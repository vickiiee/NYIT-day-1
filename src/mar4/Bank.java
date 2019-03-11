package mar4;

public class Bank {

	private Account [] accs;
	private CheckingAccount[] a;
	private SavingsAccount []b;
	private int accNum;
	private int numAccs;
	private int numSav;
	private int numCheck;
	
	
	public Bank(int num) {
		accs = new Account [num*2]; //*2???
		a = new CheckingAccount[num];
		b = new SavingsAccount[num];
		accNum = 101;
		numSav = 0;
		numCheck = 0;
	}

	public void openCheckingAccount(double balance, double creditLimit) {
		//even #: checking
		CheckingAccount a = new CheckingAccount(accNum);
		a.setLimit(creditLimit);
		a.deposit(balance);
		
		System.out.println(a.toString());
		
		accs[numAccs] = (CheckingAccount) a;
		accs[numAccs].deposit(666);
		System.out.println(accs[numAccs].getAccountNumber());
		accNum++;
		
	}

	public void openSavingsAccount(double balance, double interest) {
		//odd #: Savings
		SavingsAccount a = new SavingsAccount(accNum);
		
		a.setInterest(interest);
		a.deposit(balance);
		
		System.out.println(a.toString());
	
		accs[numAccs] = a;
		accNum++;		
	}

	public void printAccounts() {
		for(int i = 0; i< accs.length; i++) {											//FOR LOOP DONT WORK BC IT CANT ACCESS ARRAY METHODS TF
			//System.out.println(accs[i].toString());
			Account a = accs[i];
			//System.out.println(a.toString());
		}
	}

	public void deposit(int accNum, int deposit) {
		for(int i = 0; i < accs.length; i++) {
			int a = accs[i].getAccountNumber();
			if(accs[i].getAccountNumber() == accNum) {
				accs[i].deposit(deposit);
			}
		}
		
	}

	public void withdraw(int accNum, int withdrawal) {
		for(int i = 0; i < accs.length; i++) {
			if(accs[i].getAccountNumber() == accNum) {
				accs[i].withdraw(withdrawal);
			}
		}
	}
}
