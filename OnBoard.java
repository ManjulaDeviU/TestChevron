//Implementing the RR domain using OOPS...
public class OnBoard {

	//Variables...
	public String typeOfTrain;
	private int noOfLocomotive;

	public OnBoard() {
		typeOfTrain = "Passenger";
		noOfLocomotive = 3;
	}

	//Constructor Overloading...
	public OnBoard(String typeOfTrain, int noOfLocomotive) {
		this.typeOfTrain = typeOfTrain;
		this.noOfLocomotive = noOfLocomotive;
	}


	//User defined methods...
	public String changeOfTrainType() {
		System.out.println("Business Logic for Changing Train Type Goes 							Here!!!");
		return "Something";
	}//Closing for method...

	public void displayTrainTypeDetails() {
		System.out.println("Train Type is : " + typeOfTrain);
		System.out.println("No. of Locomotive: " + noOfLocomotive);
	}//Closing for method...

	//Main Method...
	public static void main(String ar[]) {

		//Object Creation...
		OnBoard WebTech = new OnBoard();
		WebTech.changeOfTrainType();
		WebTech.displayTrainTypeDetails();

		OnBoard Arinc = new OnBoard("Fright", 2);
		Arinc.displayTrainTypeDetails();
	}
}//Closing of the Class...