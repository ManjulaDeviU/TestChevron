//Main Class...
//public abstract class Banks {
public class Banks implements Comparable{

	//Instance Variables...
	protected int bankIFSCCode;
	protected String bankName;
	protected String bankBranchLocation;
	protected static String goveringBodyForBanks;
	protected String accountType;
	
	//No Argument constructor...
	public Banks() {
		super();
		System.out.println("In No Argument constructor...");
	}

	//Abstract Method...
	//public abstract void processingHomeLoans();

	//Parameterized constructor...
	public Banks(int bankIFSCCode, String bankName) {
		this.bankIFSCCode = bankIFSCCode;
		this.bankName = bankName;
		System.out.println("In Parameterized constructor...");
	}

	/*public Banks(int bankCode, String bankname) {
		bankIFSCCode = 353535;
		bankName = "ICICI Bank";
		System.out.println("In Parameterized constructor 1...");
	}*/

	//Parameterized constructor...
	public Banks(String bankBranchLocation, int bankIFSCCode) {
		this.bankIFSCCode = bankIFSCCode;
		this. bankBranchLocation = bankBranchLocation;
		System.out.println("In Parameterized constructor...");
	}


	//Functionalities...
	public final int openingSavingsBankAccount(String customerName, 
						int customerAge) {

	      System.out.println("In openingSavingsBankAccount()...");
	      System.out.println("Account Holder Name : " + customerName);

	     return 2;
	}

	//Functionalities...Overloading
	public int openingSavingsBankAccount(String customerName) {

	      System.out.println("In openingSavingsBankAccount()...");
	      System.out.println("Account Holder Name : " + customerName);

	     return 001;
	}

	//Function Overloading...
	public void displayingSavingsBankAccountDetails(String customerName) 		{
	 System.out.println("In displayingSavingsBankAccountDetails()...");
	 System.out.println("Business Logic for Displaying Bank A/C Details...");
	}

	//Function Overloading...
	public void displayingSavingsBankAccountDetails() {

	      System.out.println("In displayingSavingsBankAccountDetails()...");
	      System.out.println("Bank Name : " + bankName);
	      System.out.println("Bank IFSC Code : " + bankIFSCCode);
	      //System.out.println("Bank Location : " + bankBranchLocation);
	}

	//Exception Specific Method...
	public void calculatingSimpleInterest() throws ArithmeticException {
	
	   int principleAmount = 1000;
	   int duration = 2;
  	   int simpleInterest = 0;
	   int rateOfInterest = 5;

	   simpleInterest = (principleAmount * duration * rateOfInterest ) / 0;
	   System.out.println("SI For The Bank ia  : " + simpleInterest);

	}

	//Method for Comparing the Banks Objects based on bankIFSCCode...
	public int compareTo(Object o1) {
        		if (this.bankIFSCCode == ((Banks)o1).bankIFSCCode)
            			return 0;
        		else if ((this.bankIFSCCode) > ((Banks)o1).bankIFSCCode)
            			return 1;
        		else
            			return -1;
    	}

	//Overriding the toString...
	public String toString() {
		return bankName + " " + bankIFSCCode;
	}
}//End of Main Class....


//Extended Bank Class...
class PrivateBank extends Banks implements CommonFacilities {

	//Instance Variables...
	private int rateOfInterest;
	
	//No Argument constructor...
	public PrivateBank() {
		super();
		System.out.println("In No Argument constructor...");
	}

	//Parameterized constructor...
	public PrivateBank(int rateOfInterest) {
	     this.rateOfInterest = rateOfInterest;
	      System.out.println("In Sub Class Parameterized constructor 1...");
	}

	public void displayingPBAccountDetails() {
	     super.displayingSavingsBankAccountDetails();
	     System.out.println("ROI For PB : " + rateOfInterest);
	}
	
	//Function Overloading....
	public int openingSavingsBankAccount(int aadharCardNo)  throws 
		AadharCardNumberNotFoundException{

	    //System.out.println("In Sub Class openingSavingsBankAccount()...");
	    //System.out.println("Account Holder ANO : " + aadharCardNo);
	     
	     int ano;
	     ano = aadharCardNo;
	     
	if(ano == 454545)
		System.out.println("Valid Aadhar No....");
	else
	     	throw new AadharCardNumberNotFoundException("Aadhar Card Number Not Valid");

	     return 3;
	}

	//Functionalities...Overriding...
	public int openingSavingsBankAccount(String customerName) {
	
	      super.displayingSavingsBankAccountDetails("XYZ");
	      System.out.println("In openingSavingsBankAccount()...");
	      System.out.println("Account Holder Name : " + customerName);

	     return 001;
	}

	public final int openingSavingsBankAccount() {

	      System.out.println("In openingSavingsBankAccount()...");
	      System.out.println("Account Holder Name : ");

	     return 2;
	}

	public boolean processingHomeLoans() { return true;}
	public boolean processingHomeLoans(String docs) { return true; }
	public boolean processingHomeLoans(String docs, int customerAge)
	{ return true; }
}


//Extended Class...
class PostOffice extends Banks {

	//Extended Variables..
	private String postOfficeAccountType;
	private int limitAmountForRD;

 	//Parameterized constructor...
	public PostOffice(String postOfficeAccountType, int limitAmountForRD) 	{
	        this.postOfficeAccountType = postOfficeAccountType;
	        this.limitAmountForRD = limitAmountForRD;
	        System.out.println("In Sub Class Parameterized constructor 2...");
	}
	
	//Functionalities...
	public int openingSavingsPostOfficeAccount(String customerName, 
						  int customerAge) 
	{
	      System.out.println("In openingSavingsPOAccount()...");
	      System.out.println("Business Logic for Opening PO A/C...");

	     return 1;
	}

	public void displayingPostOfficeAccountDetails() {

	      //super.displayingSavingsBankAccountDetails();
	      super.accountType = "MIS";
	      System.out.println("In displayingPOAccountDetails()...");
	      System.out.println("Account Type : " + super.accountType);
	      System.out.println("PO Account Type : " + postOfficeAccountType);
	      System.out.println("Limit Amount in RD : " + limitAmountForRD);
	 }

	public void processingHomeLoans() { }

}