public class CommunicationCustomer {

	//Variables...data....state...attributes...
	protected String customerName;
	protected int customerAge;
	protected float customerBillingAmount;

	//Functions...behaviours....methods...
	public void subscribingDataPlan() {

		//Business login for subscribing data plan goes here...
		System.out.println(" In subscribingDataPlan()...");
	}

	public String customerActivation() {

		//Business login for Activating specific customer goes here...
		/* 1. Customer Creation....
		     2. Selecting the package...
		     3. Creation of Billing id..
		     4. Validation of order...*/
		System.out.println(" In customerActivation()...");
		return ("Hello") ;
	}

	public static void main(String []args) {
	
		CommunicationCustomer Asha = new CommunicationCustomer();
		//int x = 10;
		String returnValue = Asha.customerActivation();
		Asha.subscribingDataPlan();

		//Customer Salman = new Customer();
		
	}

}

