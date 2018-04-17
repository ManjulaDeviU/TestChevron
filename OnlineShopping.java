//Main Class...
public class OnlineShopping {

	//Craeting/defining varaibles/state/attributes/properties...
	//1. Instance/Object varaibles..
	String customerName;
	private int productIdentificationNumber;
	private int customertIdentificationNumber;
	static String paymentGateway;  //Class varibale..
	
	//Default Constructor..
	/*OnlineShopping() {
		super(Object);
	}*/

	OnlineShopping() {
		System.out.println(" In Simple Constructor.....");
		customerName = "xyz";
		productIdentificationNumber = 7777;
		customertIdentificationNumber = 6464;
	}
	//Paramter Constructor..
	OnlineShopping(String x,int y,int z) {
		System.out.println(" In Default Constructor.....");
		this.x = x;
		y = y;
		z = z;
	}
	
	//Methods....
	public void printingObjectValues() {
	System.out.println("Customer Name...." + customerName );
        System.out.println("Customer ID...." + customertIdentificationNumber );
	}

	public void searchingForProduct() {
	//private int productIdentificationNumber;	
	System.out.println("In searchingForProduct()....");
	}

	public void orderingForProduct() {
	//private int productIdentificationNumber;	
	System.out.println("In orderingForProduct()....");
	}
}
