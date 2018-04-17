/* Step 1 : Identifying the Object.
    Step 2 : Identify the appropriate attributes/behaviors.
    Step 3 : Define the behaviors using the attributes.
    Step 4 : Implementing using the Java language. */

//Main class...
class IdentityCards
{
	//Variables/attributes/properties...
	//<AS> <AM> <DT> <VN>;
	private String shapeOfTheIdCard;
	private int dimensionOfIdCard;
	private String rawMaterialUsedForPreparingIdCards;
	
	//Functions/methods/behaviours.....
	//<AS> <AM> <RT> <MN>(P1,P2....);
	public void processingIdCardsForIdentifyingEmployees() {
		System.out.println("In Method....");
	}
}

//Implementation class....
public class ImplementationClassForIdentityCards
{
	public static void main(String a[]) 
		{
			//Creating Objects....
			IdentityCards AadharCard = new IdentityCards();
			IdentityCards VoterCard = new IdentityCards();

			//Invoking the methods....
		     AadharCard.processingIdCardsForIdentifyingEmployees();
		     VoterCard.processingIdCardsForIdentifyingEmployees();	
		}

}