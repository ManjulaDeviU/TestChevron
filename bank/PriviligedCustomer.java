package bank;

//Extended Version of Customer class....
public class PriviligedCustomer extends Customer {

	//Instance Variables....
	int priviligeId;
	public String priviligeType;

	//Constructors...
	public PriviligedCustomer() {
		super("Pari");
		System.out.println("In Sub Class default Constructor...");
	}
	
	//Parameterized Constructors...
	public PriviligedCustomer(String priviligeType) {
		this.priviligeType = priviligeType;
	}

	//User Defined Function...
	public void displayPriviligedCustomerDetails() {
		//Implementation to input the customer details...
		super.accountBalance = 464.7;
		super.displayCustomerDetails();
		System.out.println("Inside the displayPriviligedCustomerDetails()....");
		System.out.println("Privilige Type : " + priviligeType);
	}

	//Overriden method...from super class...
	public void getCustomerDetails() {
		//Implementation to input the customer details...
		System.out.println("Inside the sub class getCustomerDetails()....");
		System.out.println("Re-defining the getCustomerDetails()....");
	}

	//Overriden method...from super class...
	public void getCustomerDetails(String priviligeType) {
		//Implementation to input the customer details...
		System.out.println("Inside the sub class getCustomerDetails()....");
		System.out.println("Re-defining the getCustomerDetails()....");
	}

	//Customer class Function Overriding..
	public void calculatingEMI(String customerType, float totalLoan, float interestRate) {
		//Implementation to calculate the EMI paid by the prcustomer based on the in....
		System.out.println("Inside the calculatingEMI()....");
	}

	//Function Overloading..
	public void calculatingEMI(float interestRate) {
		//Implementation to calculate the EMI paid by the prcustomer based on the in....
		System.out.println("Inside the calculatingEMI()....");
	}

	//Function Overloading..
	public void calculatingEMI(float interestRate, String customerType) {
		//Implementation to calculate the EMI paid by the prcustomer based on the in....
		System.out.println("Inside the calculatingEMI()....");
	}

}


