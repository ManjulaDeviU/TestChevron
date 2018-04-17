class Associate
{
  //Declare Some Variables...
  private int associateId = 295957;
  private String associateName = "Parinika";

  //Method Definition...
  public void displayAssociateDetails()
  {
     System.out.println("Associate Id : " + associateId);
     System.out.println("Associate Name : " + associateName);
  }
}//End of Class

//Implementation Class
public class ImplementationClass
{
  public static void main(String ar[])
  {
    //Creating Instances/Objects for th Associate Class
    Associate Sandeep = new Associate();
    Sandeep.displayAssociateDetails();
  }
}






