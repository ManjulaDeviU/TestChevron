public class ImplementationClassForBanks {

public static void main(String [] bahubali) throws 				ArrayIndexOutOfBoundsException, AadharCardNumberNotFoundException{
	//try {
	//Creating Objects...
	/*Banks HDFC = new Banks(2424,"HDFC");
	HDFC.displayingSavingsBankAccountDetails();*/

	/*Banks ICICI =  new Banks("Hyderabad", 44545);
	ICICI.displayingSavingsBankAccountDetails();*/

	/*PostOffice HPO = new PostOffice("RD", 45000);
	HPO.displayingPostOfficeAccountDetails();*/

	/*Banks HDFC = new Banks(2424,"HDFC");
	int accNo = HDFC.openingSavingsBankAccount("Saradhi");
	System.out.println("Success Creation of " + accNo);*/

	/*Banks ICICI = new Banks(2424,"HDFC");
	int accNo = ICICI.openingSavingsBankAccount("Radhi", 25);
	System.out.println("Success Creation of " + accNo);*/

	/*PrivateBank maheshBank = new PrivateBank();
	int accNo = maheshBank.openingSavingsBankAccount(2656);
	System.out.println("Success Creation of " + accNo);*/

	/*Banks HDFC = new Banks(2424,"HDFC");
	System.out.println(HDFC);
	HDFC.calculatingSimpleInterest(); 
	}//Closing for try...
               catch(ArithmeticException ae) {
	     	System.out.println("Your are in Catch Block.....");
		}
	//System.out.println("In Between The Catch Block...");
             	catch(ArrayIndexOutOfBoundsException ie) { 
		System.out.println("Your are in IE Catch Block.....");
	} 
	finally { System.out.println("This Block will be Exceuted...."); } 
	}*/
	
	try {
	String firstName = "Saradhi"; 
	System.out.println("The Hash code : " + firstName.hashCode());

	firstName = firstName.concat("Seshagiri");
	System.out.println("The Hash code : " + firstName.hashCode());

	System.out.println("Your Full Name is : " + firstName);

	System.out.println("Comparing : " + firstName == firstName);

	PrivateBank maheshBank = new PrivateBank();
	int accNo = maheshBank.openingSavingsBankAccount(295957);

	
	}
	catch(AadharCardNumberNotFoundException aaa) {
		System.out.println(aaa.getMessage());
		//aaa.printStackTrace();
		System.out.println("Your are in ACNNFE Catch Block.....");
	}
	}
}