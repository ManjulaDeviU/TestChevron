public class Customer {
	
	//Variables for Class...
	private int customerId;
	private String customerName;

	//User Defined Functions....
	public int  onlineChequeDeposit() {
		System.out.println("In onlineChequeDeposit function....");

		return 0;
	}

	public static void main(String ar[]) {

		//Creating Objects....
		Customer Vikas = new Customer();
		Vikas.onlineChequeDeposit();
	}

}//Closing the Class definition....