public class TechMahindraAssociates
{
  //Variables..State...properties
  private int globalIdentificationNumber;
  private String associateName;
  
  //Default Constructor
  TechMahindraAssociates()
  {
     globalIdentificationNumber = 252525;
     associateName = "Saradhi";
  }

 //Function...behaviour....methods
  public void displayingAssociatesDetails()
  {
    System.out.println("Associate Name : " + associateName);
    System.out.println("Associate GID : " + globalIdentificationNumber);
  }

  public static void main(String s[])
  {
    //Allocationg Memory and giving some name..
    TechMahindraAssociates Vikarm = new TechMahindraAssociates();
     Vikarm.displayingAssociatesDetails();

    TechMahindraAssociates Vamshi = new TechMahindraAssociates();
     Vamshi.displayingAssociatesDetails();

    TechMahindraAssociates Parinika = new TechMahindraAssociates();
     Parinika.displayingAssociatesDetails();
  }
}//Class Ending
