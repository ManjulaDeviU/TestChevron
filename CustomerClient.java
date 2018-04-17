//Designing class for Customer Object...

//Appropriate import section...
import java.lang.*; //Default package imported
	                //Packages : Collection of Interfaces and Classes.
	                //Total No. of packages supported for Java : 6

//Class Section
class Customer {

	//Variables for the Customer...
	public String customerName;
	private int customerId;
	public String customerAddress;
	String customerBloodGroup;

	//Default No Argument Constructor...
	public Customer() {
	customerName = "M.Srimathi";
	customerId = 777;
	customerAddress = "T.Nagar";
	}

	public Customer(String customerName, int customerId, String customerAddress) {
	this.customerName = customerName;
	this.customerId = customerId;
	this.customerAddress = customerAddress;
	}

	//User Defined Functions...
	public int monthlyBillingAmountOfCustomer() {
	//Business Logic for calculating the montly billing amount for customers...
	System.out.println("In monthlyBillingAmountOfCustomer()...." );
	return 0;
	}

	//Overloaded monthlyBillingAmountOfCustomer()
	public int monthlyBillingAmountOfCustomer(int dataPlan) {
	//Business Logic for calculating the montly billing amount for customers based on Data Plan...
	System.out.println("In monthlyBillingAmountOfCustomer()....based on Data Plan..." );
	return 0;
	}

	//Overloaded monthlyBillingAmountOfCustomer()..based on Data Plan + Location....
	public int monthlyBillingAmountOfCustomer(int dataPlan, String Location) {
	//Business Logic for calculating the montly billing amount for customers based on Data Plan+Location...
	System.out.println("In monthlyBillingAmountOfCustomer()....based on Data Plan + Location..." );
	return 0;
	}

	public int annualProfitOfCustomer() {
	//Business Logic for calculating the annual profit amount for customers...
	System.out.println("In annualProfitOfCustomer()...." );
	return 0;
	}

	public void displayCustomerDetails() {
	//Business Logic for displaying customers details...
	System.out.println(" Customer Name is : " + customerName);
	System.out.println(" Customer ID is : " + customerId);
	System.out.println(" Customer Address is : " + customerAddress);
	}

}//Closing the Main Class...

/*Customer Example : M.Srimathi[M.Srimathi,777,T.Nagar], Satish, S.Srimathi[S.Srimathi,000,T.Nagar]
		Purnash extends Murali[V.Murali,4646,T.Nagar] */


//Implementation Class for Customer class...
public class CustomerClient {

	public static void main(String a[]) {

	//Object creation for Customer...
	Customer mSrimathi = new Customer(); //Special function called as constructor...is called...
	mSrimathi.monthlyBillingAmountOfCustomer();
	mSrimathi.displayCustomerDetails();

	Customer sSrimathi = new Customer("S.Srimathi", 4576, "J,Nagar");
	sSrimathi.annualProfitOfCustomer();
	sSrimathi.displayCustomerDetails();
	}

}//Closing the implementation class...


