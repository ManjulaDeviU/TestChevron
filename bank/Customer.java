package bank;

//Parent Class----->PriviligedCustomer...
public class Customer {

	//Instance Variables..
	public int customerId;
	private int accountNumber;
	public String customerName;
	public float accountBalance;

	//Constructors...
	public Customer() {
		super();
		System.out.println("In Super Class default Constructor...");
		customerId = 3333;
		accountNumber = 45454;
		customerName = "Saradhi";
	}
	
	//Parameterized Constructors...
	public Customer(int  customerId, int  accountNumber,String customerName) {
		this.customerId = customerId;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	//Parameterized Constructors...
	public Customer(String customerName) {
		this.customerName = customerName;
	}

	//User defined Methods...
	public void getCustomerDetails() throws ArrayIndexOutOfBoundsException, CINFE{
		//Implementation to input the customer details...
		try {
		System.out.println("Inside the getCustomerDetails()....");
		if(condition) {
			Array Statement ; 
			//Get the Customer ID; }
		else {
			False Statement;
			throw  new CINFE("Message");} }//Closing try
	}

	public void displayCustomerDetails() {
		//Implementation to input the customer details...
		System.out.println("Inside the displayCustomerDetails()....");
		System.out.println("Customer Name : " + customerName);
	}

	public float depositCash(int accountNumber, float accountBalance) {
		//Implementation to update the A/C balance after deposting...
		System.out.println("Inside the depositCash()....");
		return 0;
	}

	//Function Overloading..
	public void calculatingEMI(String customerType, float totalLoan) {
		//Implementation to calculate the EMI paid by the customer...
		System.out.println("Inside the calculatingEMI)....");
	}
	
	//Function Overloading..
	public static void calculatingEMI1(String customerType, double totalLoan, double interestRate) {
		//Implementation to calculate the EMI paid by the customer based on the in....
		System.out.println("Inside the calculatingEMI1()....");
	}

	public String toString() {
	   return "Customer Name is  : "+ customerName ; }

} // Class end...