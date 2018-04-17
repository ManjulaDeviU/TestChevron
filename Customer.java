public class Customer
{
   String serviceProvider = "Tata";   //Class Variable
   private int customerId;   //Instance Variables
   private String customerName;  //Instance Variables

   public Customer() { 
     //Default Constructor....
    
   }

   public void setCustomerdetails() {
      
      int customerAge;  //Local Variable
      customerId = 35353;
      customerName = "Saradhi";
    }

     public void displayCustomerDetails()
     { 
         serviceProvider = "Airtel";
         System.out.println("Cutomer Id : " + customerId);
     }
  
     public static void main(String a[])
     {
         Customer Saradhi  = new Customer();
         Saradhi.setCustomerdetails();
         Saradhi.displayCustomerDetails();
         System.out.println("Before Service Provider: " + Saradhi.serviceProvider); 

       Customer Radhi  = new Customer();
       Radhi.serviceProvider = "Reliance";
       System.out.println("After Service Provider: " + Radhi.serviceProvider);
     }
}

class RegularCustomer extends Customer
{
  private String customerId;

}
