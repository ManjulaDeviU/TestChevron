//Scenario 2 : The main class and implementation class having the main method                         within the same class...in the same .java file.

//Main class
class Bag1 {

	//Some properties/variables declaration goes here...
	//private final String colourOfTheBag = "Blue";  
	private final String colourOfTheBag = "Blue";  
	private int costOfTheBag = 4500;

	//Default constructor...
	public Bag1() {
		colourOfTheBag = "Blue";
		costOfTheBag = 4500;
		System.out.println("In Constructor....");
	}

	//Parameter constructor...Overloaded constuctor...
	public Bag1(String colourOfTheBag , int costOfTheBag) {
		System.out.println("In Overloaded Constructor....");
		this.colourOfTheBag = colourOfTheBag;
		this.costOfTheBag = costOfTheBag;
		//System.out.println("In Overloaded Constructor....");
	}

	//Some function definitions goes here...
	public void storingOfGoods() {
	//Some codes goes here...
	colourOfTheBag = "Red";
	System.out.println("We are in Bags Functions....");
	System.out.println("The Color of the Bag is : " + colourOfTheBag);
	System.out.println("The Cost of the Bag is : " + costOfTheBag);
	}

}//Main Class ending...

//Implementation Class...
public class BagImplementationClass {

	public static void main(String[] a) {
	
	Bag1 travelBag =  new Bag1();
	travelBag.storingOfGoods();

	Bag1 laptopBag =  new Bag1("Green", 3500);
	laptopBag.storingOfGoods();

      	}
}//Implementation Class ending...

