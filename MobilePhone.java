//Social Media Domain...
/* OOPS :
	1. Step 1 : Identify the physical objects.
			Ex : Mobile Phone, Laptop, Tablets, Desktop...
	2. Step 2 : Logical representation of the the physical objects identified - Java Class.
			Ex : Mobile Phone..Samsung 
	Array : int age[2] ; int age = new int[6];*/

public class MobilePhone {

	//Declaring the Variables...
	private int mobileCost;
	private String mobileBrandName;
	int mobileMakeNumber; //default access specifier...
	
	//Default Constructor...
	/* 1. Constructor should have the same as the class name.
	    2. Constructor CANNOT have any return type.
	    3. Constructor are used ONLY and ONLY to initialize the properties of the class...
	    4. These is the method which is invoked before any other user defined method is invoked...
	*/
	public MobilePhone() {
		super();
		System.out.println("In Default Constructor...");
	}

	public MobilePhone(int mobileCost, String mobileBrandName, int mobileMakeNo) {
		System.out.println("In Argumental Constructor...");
		this.mobileCost = mobileCost;
		this.mobileBrandName = mobileBrandName;
		mobileMakeNumber = mobileMakeNo;
	}

	//User defined Method...
	public void dialingTheContactNumber() {
		System.out.println("Logic for Dialing the Contact Number");
	}

	public void displayingTheMobileDetails() {
		System.out.println("Mobile Brand Name is : " + mobileBrandName);
		System.out.println("Mobile Make Number is : " + mobileMakeNumber);
		System.out.println("Mobile Cost is : " + mobileCost);
	}

	public static void main(String arg[]) {
		
		//Allocating Memory - Creating Objects...
		MobilePhone iPhone = new MobilePhone();  //Invoking th Constructor...
		MobilePhone samsung = new MobilePhone(250, "Nokia", 4545);  
						      //Invoking the Parameterized Constructor...

		//iPhone.dialingTheContactNumber();
		//iPhone.displayingTheMobileDetails();

		samsung.displayingTheMobileDetails();

		/*System.out.println("Hi...All....It is Early Morning....Or Late Night..");
		System.out.println("First Java Program.."); */
	}

} // Class Closing...
 
