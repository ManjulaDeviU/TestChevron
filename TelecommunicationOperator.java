//Main Class...
public class TelecommunicationOperator {

	//Properties/Variables..
	private String typeOfNetworks;
	private String typesOfDataPlan;
	private int internetDataPlanCharges;
	private String connectionTypes;

	//No Argument Constructor...
	TelecommunicationOperator() {

		System.out.println(" In Default No Argument Connsructor()...");
		typeOfNetworks = "BT" ;
		typesOfDataPlan = "2G" ;
		internetDataPlanCharges = 89;
		connectionTypes = "Wireless" ;
	}

	//User defined Fuctions...
	public void newConnectionProcess() {
		//Business logic for Processing New Connection goes here...

		System.out.println(" In newConnectionProcess()...");
		System.out.println(" Network Provider Name " + typeOfNetworks);
		System.out.println(" Data Plan Selected " + typesOfDataPlan);	
		System.out.println(" Internet Data Plan Charges Selected " + internetDataPlanCharges);	
		System.out.println(" Connection Type Selected " + connectionTypes);		
	}

}


//Implementation Class...
public class ClientClassForTCO {

	public static void  main(String a[]) {
	
		//Invoking the constructor to allocate memory....
		TelecommunicationOperator BT = new TelecommunicationOperator();
		BT.newConnectionProcess();
	}
}