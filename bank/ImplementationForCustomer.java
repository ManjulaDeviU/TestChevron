//Implementation class for Customer class...
package bank;

public class ImplementationForCustomer { 
	
	public static void main(String b[]) throws ArrayStoreException, NumberFormatException{

	try {
	//Creating Objects for the Customer class...
	Customer popuriYaswanth = new Customer();
	popuriYaswanth.getCustomerDetails();
	Customer.calculatingEMI1("ccc", 56.4, 34.5);
	}
	catch(ArrayStoreException e2) {
	      System.out.println("In Array...Exception Block..");
	}
	catch(NumberFormatException e3) {
	      System.out.println(e3);
	      e3.printStackTrace();
	      System.out.println("In Exception Block..");
	}
	catch(CINFEn e6) {
	      System.out.println(e6);
	      e3.printStackTrace();
	      System.out.println("In Exception Block..");
	}
	catch(Exception e4) {
	      System.out.println("In Exception Block..");
	}
	}

} 