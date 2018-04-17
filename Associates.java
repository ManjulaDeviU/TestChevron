import java.util.Scanner;
import arthimeticFunctions.Calculations;

//Main Class..
public class Associates
{
	//Instance Variables....
	private int associateGid;
	private int associateAge;
	private int associateACN;
	String associateLastName = "Ravi";
	static String companyName = "TechM";

	//Default Constructor....
	Associates() {
		System.out.println("In Super Class default Constructor.....");
	}

	//User Defined Functions/behaviours....
	public void processingInAndOutTimeOfEachAssociate() {
		System.out.println("In ProcessingInAndOutTime method...");
		
		System.out.println("Please Enter the GID : ");
		Scanner gid = new Scanner(System.in);
		associateGid = gid.nextInt();
		System.out.println("The GID Provided : " + associateGid);

		System.out.println("Please Enter the Access Code : ");
		Scanner ACN = new Scanner(System.in);
		associateACN = ACN.nextInt();
		System.out.println("The ACN Provided : " + associateACN);

	}
	
	//Overloaded Function
	public void processingInAndOutTimeOfEachAssociate(
					int accessCodeNumber) {
		System.out.println("In ProcessingInAndOutTime 				 Overloaded method...");
	}

	public static void main(String a[]) {
	
	Associates Nikhil= new Associates();
	//a1.associateLastName = "Siri";
	//a1.companyName = "Apple";
	//System.out.println(a1.associateLastName);
	System.out.println(a1.companyName);

	Associates a2 = new Associates();
	a2.companyName = "Apple";
	System.out.println(a2.companyName);
	System.out.println(a1.companyName);

		}
}//End of the Class....

