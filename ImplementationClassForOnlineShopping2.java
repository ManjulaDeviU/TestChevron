public class ImplementationClassForOnlineShopping2 {
	public static void main(String a[]) {
	
	//Creating Objects/variables of class type to access the methods....
	int x;
	//Calling the constructor to initiliaze,instantiate the memory/varaible.
	/*OnlineShopping amazon = new OnlineShopping(); 
	amazon.printingObjectValues();
	amazon.searchingForProduct();
	amazon.orderingForProduct();*/

	//OnlineShopping flipkart = new OnlineShopping();
	OnlineShopping deal = new OnlineShopping("sesha", 5555,9999);
	
	/*flipkart.printingObjectValues();
	flipkart.customerName="Seshagiri";
	System.out.println("the Changed Valued : "+ flipkart.customerName);
	flipkart.printingObjectValues();*/
	//flipkart.searchingForProduct();
	//flipkart.orderingForProduct();

	deal.printingObjectValues();
 
	}
}
