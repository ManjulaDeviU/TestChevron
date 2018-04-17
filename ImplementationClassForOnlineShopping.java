//Domain Specific Class....
/* Scenario1 : 
Same .java file having the main class and the implementation class...*/

/* Scenario 2 : Class and main method with in the same class and saved in 
                       single.java file.

/* Scenario 3 : Two separate .java files having the main class and the 	        implementation class. */

//Main Class...
abstract class OnlineShopping {

	//Creating/defining varaibles/state/attributes/properties...
	//1. Instance/Object variables..
	private String customerName;
	//private final int productIdentificationNumber;
	private int productIdentificationNumber;
	private int customertIdentificationNumber;
	static String paymentGateway;  //Class varibale..

	//Methods....
	public void searchingForProduct() {
	//private int productIdentificationNumber;

	productIdentificationNumber = productIdentificationNumber + 5;	
	System.out.println(productIdentificationNumber);

	System.out.println("In searchingForProduct()....");
	}

	public void orderingForProduct() {
	//private int productIdentificationNumber;	
	System.out.println("In orderingForProduct()....");
	}

	//Overloaded Function....
	public void orderingForProduct(String x, String y){
	//public void orderingForProduct() {
	//private int productIdentificationNumber;	
	System.out.println("In Overloaded orderingForProduct()....");
	}

	// Object/Instance Methods....
	public void printingObjectValues() {
	System.out.println("Customer Name...." + customerName );
        System.out.println("Customer ID...." + customertIdentificationNumber );
	}
	
	//Abstract Method...
	public abstract void paymentProcessingThroughGateway();
	//public void trackingTheOrder();
	//public void shippingMode();
}

class CourierServices extends OnlineShopping {

	//1. Instance/Object varaibles..
	private String courierName;
	private String paymentGateway;  //Class varibale..

	//Overriding the super class method....
	public void searchingForProduct() {
	      System.out.println("In searchingForProduct() in Sub class....");
	}

	//Overriden...
	public void paymentProcessingThroughGateway() {
	 System.out.println("In paymentProcessingThroughGateway() in Sub class....");
	}

	//Overlaoded.....
	public void paymentProcessingThroughGateway(int id) {
	 System.out.println("In paymentProcessingThroughGateway() in Sub class....Overloaded");
	}
}


public class ImplementationClassForOnlineShopping {
	public static void main(String a[]) {
	
	//Creating Objects/variables of class type to access the methods....
	int x;
	//Calling the constructor to initiliaze,instantiate the memory/varaible.
	//OnlineShopping flipkart = new OnlineShopping(); 
	//OnlineShopping amazon = new OnlineShopping(); 
	//OnlineShopping snapdeal = new OnlineShopping(); 

	//Invoke the methods accordingly....
	//static concept understanding....
	//OnlineShopping.orderingForProduct(); 
	//flipkart.orderingForProduct();
	//flipkart.orderingForProduct("cvcv", "dcgcddg");
	//flipkart.searchingForProduct();


	CourierServices blueDart = new CourierServices();
	blueDart.searchingForProduct();

	blueDart.paymentProcessingThroughGateway();
	blueDart.paymentProcessingThroughGateway(222);
	}
}






