//ImplementaionClassForCreatingBankObjects.java
//Case 2 : Two seperate classes. 1st class will be the main class ; 2nd class will                     be the implementation class for main class; but within the same java                   file. Encapsulation Concept...

class Bank
{
  //Variable/state/data....
  //private String bankName;
  //public String bankName;
  String bankName;      //default Access specifier...Package level accessibilty..
  private int bankCode;
  private String bankLocationName;

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

  public void deletingAccountHolderBalance(int accountNumber) {
	//Logic for Deleting Account Holder Balance...
	System.out.println("deletingAccountHolderBalance()...");
   }

}//Closing the Main Class....


//Main Implementation Class...
public class ImplementaionClassForCreatingBankObjects
{
   public static void main(String a[]) {
  
    //Create Objects/variables of the class type....
    Bank MasterCard = new Bank(); //Constructor of the Bank class...
    MasterCard.retrievingAccountHolderBalance(95957);
    //MasterCard.updatingAccountHolderBalance(95957, 4500.5,45000.5);
   MasterCard.printingBankValues();

    Bank Citi = new Bank("CitiBank", 002, "Singapore");
    Citi.retrievingAccountHolderBalance(9534);
    //Citi.updatingAccountHolderBalance(9534, 1500.5,25000.5);
    Citi.printingBankValues();

    Bank SBI = new Bank("SB", 005, "India");
    SBI.bankName = "State Bank of India";
    SBI.printingBankValues();

  }
}//Closing the Implementation class..

/*Benefits:
--------------
1. Reusability.
2. Adding fuctionalities without modifying the main class..
   int employeeId=4545;
   Bank Citi = new Bank(); //Constructor method is called                                        //implicitly/automatically by the JVM.
 */