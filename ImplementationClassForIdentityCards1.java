//import employee.EmpDetails;
//Implementation class....
public class ImplementationClassForIdentityCards1
{
	public static void main(String a[]) 
		{
			//Creating Objects....
			IdentityCards AadharCard = new IdentityCards();
			//AadharCard.shapeOfTheIdCard = "Circle";
	                  AadharCard.processingIdCardsForIdentifyingEmployees();

			//IdentityCards AadharCard = new 			processingIdCardsForIdentifyingEmployees();

			IdentityCards VoterCard = new IdentityCards							                            ("XYZ",45);

			//VoterCard.shapeOfTheIdCard = "Cube";
                                    VoterCard.processingIdCardsForIdentifyingEmployees();
			

			IdentityCards PANCard = new IdentityCards							                      ("XYZ",45,"ABC");
			//EmpDetails e1 =  new EmpDetails();
			//e1.idno = 969;
			//Invoking the methods....
			//e1.display();	

		}

}