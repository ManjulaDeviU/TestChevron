public class User {

	//Variables,Properties,attributes...
	protected int clientId;
	private String clientName;

	public User() {
		clientId = 3535;
		clientName = "ABC";
		System.out.println("In Constructor...");
	}

	public User(int clientId) {
		this.clientId = clientId;
		System.out.println("In Overloaded Constructor...");
	}


	//User defined Functions..
	public int onlineChequeDeposit(int chequeNo) {
		//Processing logic of online Cheque Deposit goes here...
	                  System.out.println("Processing logic of online Cheque Deposit using 			                          Cheque No...");
	         
	         return 0;
	}
	
	//Function Overloading...
	public int onlineChequeDeposit(int chequeNo, int accountNo) {
		//Processing logic of online Cheque Deposit goes here...
	         System.out.println("Processing logic of online Cheque Deposit goes here");
	         System.out.println("Using Cheque No and Account No...");

	         return 0;
	}

	//Function Overloading...
	public int onlineChequeDeposit(int chequeNo, int accountNo, int amount) {
		//Processing logic of online Cheque Deposit goes here...
	         System.out.println("Processing logic of online Cheque Deposit goes here");
	         System.out.println("Using Cheque No, Account No and amount...");

	         return 0;
	}
	
}//End of Super Class.


//Implementing Inheritance...
class CourierService extends User {

	//Properties of CourierService class...
	private String courierServiceName;

	//Overriden Methods of User class...
	public int onlineChequeDeposit(int chequeNo, int accountNo, int amount) {
	        //Processing logic of online Cheque Deposit goes here...
	        super.onlineChequeDeposit(44,34,5);
	        super.clientId = 4646;

	         System.out.println("In Sub Class....");
	         System.out.println("Processing logic of online Cheque Deposit goes here");
	         System.out.println("Using Cheque No, Account No and amount...");

	         return 0;
	}

public static void main(String []ups) {
		//Creating Objects...
		
		//User Amazon;
		User Amazon = new User();
		Amazon.onlineChequeDeposit(3434);
		System.out.println(Amazon.clientId);

		/*Amazon.clientId = 4444;  //Customize the client id..
		System.out.println(Amazon.clientId);*/

		User Flipkart = new User(4567);
		Flipkart.onlineChequeDeposit(456,3535);
		System.out.println(Flipkart.clientId);

		//Object creation for sub classes...
		CourierService blueDart = new CourierService();
		blueDart.onlineChequeDeposit(12,455,23);	
	}
}//End of Sub Class..