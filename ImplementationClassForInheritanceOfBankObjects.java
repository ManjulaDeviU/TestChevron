//Inheritance : Extension of an existing class/object...

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
      //int accountNumber = 0;
      accountNumber = accountNumber;
               System.out.println("Account Number = " + accountNumber);
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

//Extended Class...
class InvestmentBank extends Bank {

   //InvestmentBank properties....
   private int investmentAmount;

    //Default Constructor....
    InvestmentBank() {
        System.out.println("In InvestmentBank Constructor....");
    }


   //Functionalities...
   public void dispayingInvestmentAmountInvested() {
    //Logic for displaying Account Holder Invested Amount...

    super.printingBankValues();    //super..used to access immediate parent class
    System.out.println("Invested Amount...in InvestmentBank....");
}


}//Closing the extended class...



//Main Implementation Class...
public class ImplementationClassForInheritanceOfBankObjects
{
   public static void main(String a[]) {
  
    //Create Objects/variables of the class type....
    Bank MasterCard = new Bank(); //Constructor of the Bank class...
     MasterCard.retrievingAccountHolderBalance(4545);
   
   InvestmentBank ib = new InvestmentBank();
   ib.dispayingInvestmentAmountInvested();

  }
}//Closing the Implementation class..