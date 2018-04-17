//Main class....
//http://docs.oracle.com/javase/tutorial/index.html

public class ImplementationOfBank {

	//Instance Variables...
	private int bankIFSCCode;
	private String bankName;
	private String bankBranchLocation;
	public static String goveringBodyForBanks;
	
	//No Argument constructor...
	public ImplementationOfBank() {
		super();
		System.out.println("In No Argument constructor...");
	}

	//Parameterized constructor...
	public ImplementationOfBank(int bankIFSCCode, String bankName) {
		this.bankIFSCCode = bankIFSCCode;
		this. bankName = bankName;
		System.out.println("In Parameterized constructor...");
	}

	//Functionalities...
	public int openingSavingsBankAccount(String customerName, int 						         		     customerAge) {

	      System.out.println("In openingSavingsBankAccount()...");
	      System.out.println("Business Logic for Opening Bank A/C...");

	     return 1;
	}

	public void displayingSavingsBankAccountDetails(String 						     customerName) {

	      System.out.println("In displayingSavingsBankAccountDetails()...");
	      System.out.println("Business Logic for Displaying Bank A/C 							 Details...");
	}

	public static void main(String [] bahubali) {

	//Creating Objects...
	Bank HSBC = new Bank();
	HSBC.openingSavingsBankAccount("Parinika", 5);
	}

}
