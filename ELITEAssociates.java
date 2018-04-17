//Extended Class...
public class ELITEAssociates extends Associates
{
   	//Sub Class specific variables...
	int eliteBatchNumber;
	int ELITEassociateACN;

	//Default Constructor...
	ELITEAssociates() {
		System.out.println("In Sub Class default Constructor.....");
		eliteBatchNumber = 1676;
	}

	//Defining functionalities....
	//Overriding the Super class method....
	public void processingInAndOutTimeOfEachAssociate() {

		super.processingInAndOutTimeOfEachAssociate();
		ELITEassociateACN = associateACN;

		System.out.println("In ProcessingInAndOutTime method 				                               within the derived class...");
		System.out.println("The ELITE associate ACN : " + 								ELITEassociateACN);
	}

	//Overloaded Function
	public void processingInAndOutTimeOfEachAssociate(
					int accessCodeNumber) {
		System.out.println("In ProcessingInAndOutTime 				 Overloaded method...");
	}

}//End of class...









