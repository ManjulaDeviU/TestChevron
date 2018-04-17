class Bank
{
   protected int bankCode;
   protected String bankName;
  
   //Default Constructor
   Bank() { }

   //Parameter Constructor
   Bank(int bankCode, String bankName)
  {
     this.bankCode = bankCode;
     this.bankName = bankName;
  }

   //Parameter Constructor
   Bank(String bankName)
  {
     this.bankName = bankName;
  }

  //Business Logic Method
  public void depostingMoneyInTheAccount() {
	System.out.println("ICICI bank In the Deposit Amount Method().....");
   }

  public void applyingForBankLoansInICICI() {
	System.out.println("Loan Process in ICICI will take 10 days.....");
   }

   //Method Overriding NOT possibl in same class....
   /*public void applyingForBankLoansInICICI() {
	System.out.println("Loan Process in ICICI will take 10 days.....");
   }*/

    public void calculatingBankEmployeeSalary() throws {
	System.out.println("Calculating Employee Salary for Reguler Emp.....");
   }

   public void calculatingBankEmployeeSalary(Empid, HRA, PF, ES, Bonus) 
	throws EmployeeIDNotFoundException, IOException, 
{
	System.out.println("Calculating Employee Salary for Reguler Emp.....");
   }

     public void calculatingBankEmployeeSalary(HRA, PF, Bonus) {
	System.out.println("Calculating Employee Salary for Reguler Emp.....");
   }
    
  public void getAndDisplayBankDetails()
  {
     bankCode = 0003;
     bankName = "SBH";

     System.out.println("Bank Code is :"+ bankCode);
     System.out.println("Bank Name is :"+ bankName);
  }
} //End of Bank class...


class PrivateBank extends Bank
{
   private String bankLocation;

  PrivateBank()
  { 
     bankLocation = "Hyderabad"; }

   //Overloading the Super class method
   public void getAndDisplayBankDetails(String BankLocation)
  {
     super.bankCode = 007;
     super.bankName = "Secbad";
     bankLocation = BankLocation;
     
     super.getAndDisplayBankDetails();
     System.out.println("Bank Code is :"+ bankCode);
     System.out.println("Bank Name is :"+ bankName);
     System.out.println("Bank Location is :"+ bankLocation);
  }

}

//Implementation Class
public class BankImplementationClass
{
   public static void main(String a[])
   {
       Bank SBH = new Bank(0004,"SBI");
       //SBH.getAndDisplayBankDetails();

      PrivateBank ICICI = new PrivateBank();
      ICICI.getAndDisplayBankDetails("Ameerpet");
    
   }
}