//Polymorphism....2. Function overriding..

class Bank
{
  //Instance Variable/Object variables....
  private String bankName;  //object/instance variables..
  private int bankCode;
  private static String bankLocationName;  //static/class variables..

  //Default Constructor.....
  Bank() {
   bankName = "MasterCard";
   bankCode = 001;
   bankLocationName = "India";
   System.out.println("In Default Constructor...");
  }

  //Parameterized Constructor.....
  Bank(String name, int code, String locationName) {
   bankName = name;
   bankCode = code;
   bankLocationName = locationName;
   System.out.println("In Parameterized Constructor...");
  }

  //Method for Printing the default Bank values...
  public void printingBankValues() {
     System.out.println("The Bank Name is : "+ bankName);
     System.out.println("The Bank Code is : "+ bankCode);
   }
 
  //Method/Functionalities...
  public void retrievingAccountHolderBalance(int accountNumber) {
      //Logic for Retrieving Account Holder Balance...
      System.out.println("In retrievingAccountHolderBalance()...");
   }

  public void updatingAccountHolderBalance(int accountNumber, double     amountWithdrawnInLastTransaction, double currentAvialableBalance) {
	//Logic for Updating Account Holder Balance...
	System.out.println("In updatingAccountHolderBalance()...");
  }

  public void deletingAccounts(int accountNumber) {
	//Logic for Deleting Accounts ...
	System.out.println("Deleting The Account()...");
   }

  public void deletingAccounts(int accountNumber, String reasonsForDeleting) {
	//Logic for Deleting Accounts...
	System.out.println("Deleting The Account()...");
	//System.out.println("The with Reasons()..." + reasonsForDeleting );
   }

}//Closing the Main Class....


class InvestBank extends Bank {

public void deletingAccounts(int accountNumber, String reasonsForDeleting) {
	//Logic for Deleting Accounts...
	System.out.println("Deleting The Account()...");
	//System.out.println("The with Reasons()..." + reasonsForDeleting );
   }

}

//Main Implementation Class...
public class ImplementationClassForFunctionRiding
{
   public static void main(String a[]) {
  
    //Create Objects/variables of the class type....
   try {
    	Bank MasterCard = new Bank(); //Constructor of the Bank class...
    	MasterCard.deletingAccounts(5858);
   
   	InvestmentBank ib = new InvestmentBank();
   	ib.deletingAccounts(58545);
        }
  catch() { 

  }

  }
}//Closing the Implementation class..