//Implementation class for Customer class...
package bank;
import associates.AssociatesDetails;

public class ImplementCustomer { 
	
	public static void main(String b[]) {
	
	/*
	//Creating Objects for the Customer class...
	//Customer popuriYaswanth = new Customer();
	Customer popuriYaswanth = new Customer("Yawanth");
	popuriYaswanth.displayCustomerDetails();

	Customer Parinika = new Customer("Parinika");
	Parinika.displayCustomerDetails();

	//Associates class object creation...
	/*AssociatesDetails yaswanth = new AssociatesDetails();
	yaswanth.displayingAssociatesDetails();*/

	//Creating Objects for sub class....
	PriviligedCustomer PC1 = new PriviligedCustomer();
	PC1.displayPriviligedCustomerDetails();
	}

} 