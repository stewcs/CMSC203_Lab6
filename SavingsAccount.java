
public class SavingsAccount extends BankAccount {

	// Initialize Variables.
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;

	// Constructor
	public SavingsAccount(String name, double amount) {
		super(name, amount);									// pass to superclass instructor
		this.accountNumber = super.getAccountNumber()+ "-"+ savingsNumber;	// concatenate account number
		
	}

	// Copy Constructor
	public SavingsAccount(BankAccount oldAccount, double amount) {
		super(oldAccount, amount);											// pass to superclass instructor
		this.savingsNumber = savingsNumber + 1;									// initialize savings number
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;	// initialize account number
	}

	/**
	 * Method for depositing one month of interest.
	 * @param none
	 * @return none
	 */
	public void postInterest() {
		super.deposit(rate * super.getBalance()); // deposit one month of interest
	}

	/**
	 * Method for returning account number
	 * @param none
	 * @return accountNumber | the number of the account.
	 */
	@Override
	public String getAccountNumber()		// override superclass version.
	{
		return accountNumber;
	}

}


