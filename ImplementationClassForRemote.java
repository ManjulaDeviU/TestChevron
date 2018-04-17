//Logical representation of Remote object....

class Remote implements commonMethods {

	//Properties/Variables...
	private int noOfButtons;
	private int noOfBatteries;

	//No Agrumenmt Constructor...
	public Remote() {
		noOfButtons = 10;
		noOfBatteries = 2;
	}

	//Overloaded Constructor....
	public Remote(int noOfButtons , int noOfBatteries) {
		this.noOfButtons = noOfButtons;
		this.noOfBatteries = noOfBatteries;
	}

	//Business Logic Function..
	public void operationalRange() {
	//This method will define the operational range of the remote.
	System.out.println("In OperationalRange()....");
	}

	//User defined Function...
	public void displayingRemoteSpecifications() {
	      System.out.println("Remote Buttons Count : " + noOfButtons);
	      System.out.println("Remote Batteries : " + noOfBatteries);
	}

	public void displayingSpecifications() {
	   System.out.println("Displays the Product specifications..");
	}

	public void displayingSpecifications(String inputValue) {

	}


}//End of main Class..



//Implementation Class...
public class ImplementationClassForRemote{

	public static void main(String args[]) throws NoSuchMethodException{

	//Creating instances for Bottle class....
	try {
	Remote projectorRemote = new Remote();
	projectorRemote.operationalRange();
	//projectorRemote.operationalsRange();  //Calling a non class method..
	projectorRemote.displayingSpecifications();
	}
	catch(NoSuchMethodException nsme) {
	     nsme.printStackTrace();
	     System.out.println("In Catch Block...");
	}
	finally 
	   {
	      System.out.println("In Catch Block...");
	   }
         }

}
