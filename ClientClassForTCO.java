//Main Class...
class TelecommunicationOperator {

	//Properties/Variables..
	/*private String typeOfNetworks;
	private String typesOfDataPlan;
	private int internetDataPlanCharges;
	private String connectionTypes;*/

	//Used for sub class...
	protected String typeOfNetworks;
	protected String typesOfDataPlan;
	protected int internetDataPlanCharges;
	protected String connectionTypes;

	//No Argument Constructor...
	TelecommunicationOperator() {

		System.out.println(" In Default No Argument Constructor()...");
		typeOfNetworks = "BT" ;
		typesOfDataPlan = "2G" ;
		internetDataPlanCharges = 89;
		connectionTypes = "Wireless" ;
	}

	//Argumental Constructor...
	TelecommunicationOperator(String typeOfNetworks, String typesOfDataPlan, int internetDataPlanCharges, 			                String connectionTypes) {

		System.out.println(" In Argumental Constructor()...");
		this.typeOfNetworks = typeOfNetworks ;
		this.typesOfDataPlan = typesOfDataPlan ;
		this.internetDataPlanCharges = internetDataPlanCharges;
		this.connectionTypes = connectionTypes ;
	}

	//User defined Fuctions...
	public void newConnectionProcess() {
		//Business logic for Processing New Connection For BT goes here...

		System.out.println(" In newConnectionProcess()...");
		System.out.println(" Network Provider Name :" + typeOfNetworks);
		System.out.println(" Data Plan Selected :" + typesOfDataPlan);	
		System.out.println(" Internet Data Plan Charges Selected :" + internetDataPlanCharges);	
		System.out.println(" Connection Type Selected :" + connectionTypes);		
	}

	//Function Overloading...Static polymorphism...complile time polymorphism...
	public void newConnectionProcess(String connectionTypes) {
		//Business logic for Processing New Connection For Airtel goes here...

		System.out.println(" In newConnectionProcess()...");
		System.out.println(" Network Provider Name :" + typeOfNetworks);
		System.out.println(" Data Plan Selected :" + typesOfDataPlan);	
		System.out.println(" Internet Data Plan Charges Selected :" + internetDataPlanCharges);	
		System.out.println(" Connection Type Selected :" + connectionTypes);		
	}

}


//Derived..Extended..Sub...Inherited class
class EntertainmentMedia extends TelecommunicationOperator {

	//Additional properties of the sub class....
	private String validityOfPack;

	//No Argument Constructor...
	EntertainmentMedia() {

		System.out.println(" In Sub Class Default No Argument Constructor()...");
		super.connectionTypes = " Pre-paid" ;
		validityOfPack = "December" ;
	}

	//Overridng function of the parent class...
	public void newConnectionProcess() {
		//Business logic for Processing New Connection For Cable goes here...

		System.out.println(" In newConnectionProcess()...For Cable...");
		System.out.println(" Network Provider Name :" + typeOfNetworks);
		System.out.println(" Data Plan Selected :" + typesOfDataPlan);	
		System.out.println(" Internet Data Plan Charges Selected :" + internetDataPlanCharges);	
		System.out.println(" Connection Type Selected :" + connectionTypes);		
	}
}


//Implementation Class...
public class ClientClassForTCO {

	public static void  main(String a[]) {
	
		//Invoking the constructor to allocate memory....
		/*TelecommunicationOperator BT = new TelecommunicationOperator();
		BT.newConnectionProcess();

		TelecommunicationOperator Airtel = new TelecommunicationOperator("Airtel", " 4G", 200, 
										"Prepaid" );
		Airtel.newConnectionProcess("Wireless");*/

		//Creating Objects for Sub classes...
		EntertainmentMedia cableOperator =  new EntertainmentMedia();
		cableOperator.newConnectionProcess();
	}
}