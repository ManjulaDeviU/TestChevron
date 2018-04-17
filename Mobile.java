public class Mobile {

	//Properties/variables/attributes..
	private int mobileNumber;
	private int mobileIMEINumber;

	public String browsingNews(String typeOfNews) {
		System.out.println("In browsingNews()..");
		System.out.println(" Business Logic for Browsing news goes here..");

		return "Sport News";
	}//End of Method...

	//Overloaded Method...
	public String browsingNews(int aadharNumber, String typeOfNews) {
		System.out.println("In browsingNews() using Aadhar No and 			                   typeOfNews..");
		System.out.println(" Business Logic for Browsing news goes here..");

		return "Movie News";
	}//End of Method...

	public String browsingNews(int aadharNumber, String typeOfNews) {
		System.out.println("In browsingNews() using Aadhar No and 			                   typeOfNews..");
		System.out.println(" Business Logic for Browsing news goes here..");

		return "Movie News";
	}//End of Method...


	//Main method/starting point...
	public static void main(String []ags) {
		
	//Creating Objects..
	Mobile nokiaMobile = new Mobile();
	String returnValue = nokiaMobile.browsingNews("Sports");
	System.out.println("The news is about ..." + returnValue);

	Mobile htcMobile = new Mobile();
	String returnValue2 = htcMobile.browsingNews(33333, "Movies");
	System.out.println("The news is about ..." + returnValue2);
	}

}//End of the main class.