//Describing the....

class Bottle {

	//Varaiables...
	private String shapeOfBottle;
	private int capacityOfBottle;
	//protected int capacityOfBottle;

	//Constructor...
	public Bottle() {
		shapeOfBottle = "Cylindrical";
		capacityOfBottle = 2;
	}

	//Constructor Overloading...
	public Bottle(String shapeOfBottle, int capacityOfBottle) {
		this.shapeOfBottle = shapeOfBottle;
		this.capacityOfBottle = capacityOfBottle;
	}

	//Constructor Overloading...
	public Bottle( int capacityOfBottle) {
		this.capacityOfBottle = capacityOfBottle;
	}

	//Constructor Overloading...
	public Bottle( String shapeOfBottle) {
		this.shapeOfBottle = shapeOfBottle;
	}

	//User defined Functions...
	public void storingOfPurifiedWater() {
		//This method will define the various types of liquid contents
		// to be stored...
		System.out.println("In storingOfLiquidContent() function...");
	}

	//Overloading Functions...
	public void storingOfPurifiedWater(int capacityOfBottle) {
		//This method will define the various types of liquid contents
		// to be stored...
		System.out.println("In storingOfLiquidContent() function...");
	}


	//User defined Functions...
	public void storingOfshampoo() {
		//This method will define the various types of liquid contents
		// to be stored...
		System.out.println("In storingOfshampoo()  function...");
	}

	//User defined Functions....
	public void displayingBottleSpecifications() {
		System.out.println("Bottle Shape : " + shapeOfBottle);
		System.out.println("Bottle Capacity : " + capacityOfBottle);
	}

	//User defined Functions....
	public void displayingSpecifications() {
		System.out.println("Displays the Product specifications..");
	}
} //End of Main Class...


//2nd Object/class...
class Cup extends Bottle {

	//Variables...
	private String typeOfMaterailUsedForManufacturing;
	
	//Constructor...
	public Cup() {
	     super("Cylinderical", 1);
	     typeOfMaterailUsedForManufacturing = "plastic";
	}

	//Overridden Function...
	public void storingOfPurifiedWater() {
		//This method will re-defined to store liquid contents...
		int capacityOfCup = super.capacityOfBottle;
		System.out.println("In storingOfPurifiedWater() function...");
	}
	
} //End of Sub Class...

//Implementation Class...
public class ImplementationClassForBottle {

	public static void main(String args[]) {

	//Creating instances for Bottle class....
	Bottle waterBottle = new Bottle("Oval", 3);
	waterBottle.storingOfPurifiedWater();
	waterBottle.displayingBottleSpecifications();

	Bottle shampooBottle = new Bottle("Conical", 1);
	shampooBottle.storingOfshampoo();
	shampooBottle.displayingBottleSpecifications();

	//Creating instances for Cup Sub class....
	Cup coffeCup = new Cup();
	coffeCup.storingOfPurifiedWater();
	coffeCup.displayingBottleSpecifications();
	}

}