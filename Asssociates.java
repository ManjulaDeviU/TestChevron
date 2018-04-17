//Program to display Associates Details....
import java.io.*;

public class Asssociates
{
   //Variables of Class type....
   private String associateName;
   private int associateAge;
   private int associateIdentificationNumber;

   //Default Constructor..
   Asssociates() throws IOException
   {
     //Sample Values for the properties..
     System.out.println("You are in Default Constructor....");
     associateName = "Saradhi";
     associateAge = 39;
     associateIdentificationNumber = 295957;
   }

   //Parameter Constructor..
   Asssociates(String associateName, int associateAge, int 								associateIdentificationNumber)
   {
     //Sample Values for the properties..
     System.out.println("You are in Overloaded Constructor....");
     this.associateName = associateName;
     this.associateAge = associateAge;
     this.associateIdentificationNumber = associateIdentificationNumber;
   }

   //Functions to mainpulate the class variables...
   public void functionForDisplayingAssociateDetails()
   {
    //Definition for the method...
    System.out.println("The Associate Name is:" + associateName);
    System.out.println("The Associate Age is:" + associateAge);
    System.out.println("The Associate Id is:" + associateIdentificationNumber);
   }

   //Main method for execution....
    public static void main(String a[]) throws IOException
    {
       //Create Variables of class type....
       Asssociates Rajiv = new Asssociates();
       Asssociates Neha = new Asssociates("Neha",45, 44554);

      //Calling the method for displaying details of specific object....
      Neha.functionForDisplayingAssociateDetails();  
      Rajiv.functionForDisplayingAssociateDetails();  

     System.out.println(Rajiv);
    }

}
