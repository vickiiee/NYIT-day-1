package mar25;

//Vickie Wu
//Mar 25

/**
 * This program demonstrates how the BankAccount class throws custom exceptions.
 */

public class AccountTest3 {
	public static void main(String[] args) {
		// Force a NegativeStartingBalance exception.
		try {
			BankAccount3 account = new BankAccount3(-100.0);
			account.deposit(-100.0);
			account.withdraw(-100.0);
		} catch (NegativeDeposit e) {
			System.out.println(e.getMessage());
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		} catch (NegativeWithdraw e) {
			System.out.println(e.getMessage());
		} catch (WithdrawExceedsBalance e) {
			System.out.println(e.getMessage());
		}
		/*
		 * throws exception (in which ever method calls it ) only once in each try/catch
		 * statements any exceptions thrown in bankaccount class must be in catch
		 * blocks!
		 */

		try {
			BankAccount3 account = new BankAccount3(100.0);
			account.deposit(-100.0);
			account.withdraw(-100.0);
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		} catch (NegativeDeposit e) {
			System.out.println(e.getMessage());
		} catch (NegativeWithdraw e) {
			System.out.println(e.getMessage());
		} catch (WithdrawExceedsBalance e) {
			System.out.println(e.getMessage());
		}

		try {
			BankAccount3 account = new BankAccount3(100.0);
			account.deposit(100.0);
			account.withdraw(-100.0);
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		} catch (NegativeDeposit e) {
			System.out.println(e.getMessage());
		} catch (NegativeWithdraw e) {
			System.out.println(e.getMessage());
		} catch (WithdrawExceedsBalance e) {
			System.out.println(e.getMessage());
		}

		try {
			BankAccount3 account = new BankAccount3(100.0);
			account.deposit(-80.0);
			account.withdraw(-900.0);
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		} catch (NegativeDeposit e) {
			System.out.println(e.getMessage());
		} catch (NegativeWithdraw e) {
			System.out.println(e.getMessage());
		} catch (WithdrawExceedsBalance e) {
			System.out.println(e.getMessage());
		}

	}
}