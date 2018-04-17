//Scenario 2 : The main class and implementation class having the main method                         within the same class...in the same .java file.

//Main class
public class Bag1 {

	//Some properties/variables declaration goes here...
	private String colourOfTheBag ;  
	private int costOfTheBag;

	//Some function definitions goes here...
	public void storingOfGoods() {
	//Some codes goes here...
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

	Bag1 laptopBag =  new Bag1();
	laptopBag.storingOfGoods();

      	}
}//Implementation Class ending...

