//Main class...
public class IdentityCards
{

	//Variables/attributes/properties...
	public String shapeOfTheIdCard = " Square ";
	private int dimensionOfIdCard = 25;
	private String rawMaterialUsedForPreparingIdCards;

	//Default Constructor...
	IdentityCards() {
		shapeOfTheIdCard = "Reactangle";
		dimensionOfIdCard = 10;
		rawMaterialUsedForPreparingIdCards = "plastic";
		System.out.println("In Constructor 1....");
	}

	//Overloaded Constructor...
	IdentityCards(String shapeOfTheIdCard, int dimensionOfIdCard) {
		this.shapeOfTheIdCard = shapeOfTheIdCard;
		this.dimensionOfIdCard = dimensionOfIdCard;
		System.out.println("In Parameterized Constructor...");
	}

	//Functions/methods/behaviours.....
	public void processingIdCardsForIdentifyingEmployees() {
		System.out.println("In Business Logic Method'...");
		System.out.println("Shape of ID card " + shapeOfTheIdCard);
		System.out.println("Dimension of ID card " + 				 dimensionOfIdCard);
	}
}