public class Bottle {

	private String brandName = "Bisleri";

	public Bottle() {
	   super();
	    System.out.println("In Constrctor...");
	}

	public void storageCapacityOfBottle() {
	   System.out.println("Business logic Goes Here.....");
	}

	public static void main(String []bhabulai2) {
	     Bottle waterBottle = new Bottle();
	     waterBottle.storageCapacityOfBottle();
	}
}