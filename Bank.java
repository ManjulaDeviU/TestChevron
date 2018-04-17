//First Java Program...
import java.lang.*;  //Defaulty imported...

//Bank Names : MayBank, CIMB, CitiBank, HSBC...

public abstract class Bank {
         	//Common Attributes/properties/variables...State of a Class
	private double withdrawAmount;
	private double transferAmount;
	private String bankLocation;
	private String bankOwnerName;

	//Different functionalities/behaviours/methods....behaviour of a Class
	public void openingNewAccount() {
	    System.out.println("You are In The Process of Opening New A/C");
	}

	//Overloaded Method...
	public void openingNewAccount(double monthlyIncome) {
	    System.out.println("You are In The Process of Opening New A/C using Monthly Income..");
	}

	//Overloaded Method...
	public void openingNewAccount(double monthlyIncome, double yearlyIncome) {
	    System.out.println("You are In The Process of Opening New A/C using Monthly & 			     Yearly Income..");
	}

	public void transferingAmountFromAccountToAccount() {
	    System.out.println("You are In The Process of Tranferring Amount");
	}

	//Abstract Method....
	public abstract void applyingForHomeLoan();
	

	public static void main(String[] siti) {

	   //Creating Instances or Object for the Bank class....
	   Bank MayBank = new Bank(); //Calling the special function....constructor...
	   //Bank HSBC 	= new Bank();
	   //Bank CitiBank 	= new Bank();

	   //MayBank.openingNewAccount();
	   //HSBC.openingNewAccount();
	}

}//Closing the Class definition...