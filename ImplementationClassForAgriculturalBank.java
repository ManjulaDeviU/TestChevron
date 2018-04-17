//Another related Bank class....
//Implementation of Inheritance concept...

/*
Bank ---> Private Bank, Corporate Bank, Commerical Bank, World Bank...
Inhertiance : 2 Types : 1. Class inheritance.[ Multiple Inheritance is NOT supported in Java...]
			- Is-A relationship.
			- Single, Multi-level, Hierarchial, hybrid....
			- Single[There is only ONE/SINGLE super class which is extended...]
			- Multi-level[A--->B--->C.....]
			- Hierarchial[A---->B and C ---> D]
			- extends - Class inheritance in Java...
		      2. Interface inheritance.

Bank--->AgriculturalBank */

class AgriculturalBank extends Bank {

	//Common Attributes/properties/variables...inherited from Bank class...
	/*private double withdrawAmount;
	private double transferAmount;
	private String bankLocation;
	private String bankOwnerName;*/

	//Extended class specific properties...
	private double sanctionaedFramerLoanAmount;
	private String framerName;

	//Default Constructors....
	public AgriculturalBank() {
		System.out.println("In Default Constructor....");
	}

	//Parameterized Constructors....
	//Function Overloading....
	//Constructor Overloading....
	public AgriculturalBank(double sanctionaedFramerLoanAmount, String framerName) {
		this.sanctionaedFramerLoanAmount = sanctionaedFramerLoanAmount;
		this.framerName = framerName;
		System.out.println("In Parameterized Constructor....");
	}

	//Different functionalities/behaviours/methods...
	public void agriculturalLoanProcessing() {
	    System.out.println("You are In The Process of Approving Agricultural Loan...");
	}

	//Function overloading/overriding the function of super class...Bank
	public void openingNewAccount(double monthlyIncome) {
	    super.openingNewAccount(); //Invoke the immediate parent class method()...
	    System.out.println("You are In The Process of Opening New A/C for Agri..Bank Object");
	}

	//Function Overriding the Super class function...
	public void openingNewAccount(double monthlyIncome, double yearlyIncome) {
	    //Redefine the complete processing of the Account Opening.
	}

	//Overriding...abstract method of super class.... 
	public void applyingForHomeLoan() {
	    System.out.println("You are Redfining the abstract method()....");
	}

} //Closing the Class....


//Implementation Class for creating Objects and invoking the appropriate methods....
public class ImplementationClassForAgriculturalBank {
	
	public static void main(String[] a1) {
		//Creating Objects by using the constructors...
		AgriculturalBank NABARD = new AgriculturalBank();
		NABARD.agriculturalLoanProcessing();

		AgriculturalBank Pertanina = new AgriculturalBank(45000,"XYZ");
		Pertanina.agriculturalLoanProcessing();
		Pertanina.openingNewAccount(25000);
		}

}//Closing the Class....
