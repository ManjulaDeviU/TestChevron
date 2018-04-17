//Program for Abstract Concept
abstract class AccountHolder
{
  //Properties
   private String nameOfAccountHolder;
   private int accountNumber;
   private String accountType;

   //Default Constructor
   AccountHolder() { } 

  //Parameter Constructor
  AccountHolder(String nameOfAccountHolder, int accountNumber ) 
  {
    System.out.println("In Second Constructor.....");
    this.nameOfAccountHolder = nameOfAccountHolder;
    this.accountNumber = accountNumber;
  } 

  //Used Defined Functions....
   public void amountWithdrawal()
   {
     System.out.println(" Amount With drawing Function......");
   }

  //Abstract Method...
  public abstract void creatingAccountType();

}//super Class Closing



//Creating Sub class...
class AccountType extends AccountHolder
{
  public void creatingAccountType()
  {
   super.amountWithdrawal();
   System.out.println(" Overriding the Abstract Method......");
  }
  
}//Ending Sub class



//Impementation Class
public class ImplementationClassForAccountHolder
{ 
   public static void main(String a[])
   {
   	//Create Objects for Account Holder Class...
   	//AccountHolder Bhanu = new AccountHolder();
	//Bhanu.amountWithdrawal();

	AccountType currentAccount = new AccountType();
   	currentAccount.creatingAccountType();
   }
}

