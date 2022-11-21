
public class CheckingAccount extends BankAccount{

	public static double fee = 15; // initialize fee to 15

	// Constructor
	public CheckingAccount(String name, double amount) {
		super(name, amount); 									// pass to superclass instructor
		super.setAccountNumber(super.getAccountNumber()+"-10"); // concatenate with 10
	}

	
	
	/**
	 * Method for validating that withdrawing balance is possible.
	 * @param amount | the amount the user wants to withdraw
	 * @return completed | successful withdrawal or not.
	 */
	public boolean withdraw(double amount) {
		boolean completed = true;

		if(super.withdraw(fee + amount)) // withdraw amount
			completed = true;
		else
			completed = false;
		return completed; // return true or false
	}


}


