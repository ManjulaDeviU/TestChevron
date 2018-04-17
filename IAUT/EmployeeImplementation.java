abstract class Employee {

	//Properties/variables/data part...
	private int employeeId;
	private String employeeName;
	private String employeeAddress; 
	private long employeeMobileNo;
	
	//Simple Constructor...
	public Employee() {
		System.out.println("Default Constructor...");
		employeeId = 1234;
		employeeName = "SS";
		employeeAddress = "Alwal"; 
		employeeMobileNo = 646464;
	}

	//User defined functionalities...
	public void loginIntoWebExSession() {
		System.out.println("Inside loginIntoWebExSession()...");
		System.out.println("Business logic for Loginging into WebEx goes here...");
	} //End of the method...

	//Overloaded Function....
	public void loginIntoWebExSession(int sessionId, String sessionPassword) {
		System.out.println("Inside loginIntoWebExSession() Using Session id and Password...");
		System.out.println("Session id is : " + sessionId + " and Password is : " + sessionPassword);
	} //End of the method...

	//Overloaded Function....
	public void loginIntoWebExSession(int sessionId) {
		System.out.println("Inside loginIntoWebExSession() Using Session id ...");
		System.out.println("Session id to Login is : " + sessionId);
	} //End of the method...

	//Abstract method..
	public abstract void loginIntoWebExSession(int sessionId, String sessionPassword, String EmployeeName) ;

} //End of the Class


//Subclass of Employee Class to override the abstract method()....
class ContractEmployee extends Employee {

	//Overridden Abstract method....
	public void loginIntoWebExSession(int sessionId, String sessionPassword, String EmployeeName)  {
		System.out.println("Inside loginIntoWebExSession() in Subclass...");
		System.out.println("Inside loginIntoWebExSession() Using Session id, sessionPassword...");
		System.out.println("Session id to Login is : " + sessionId);
	}

}//End of the class...

public class EmployeeImplementation {

	//Main starting method...
	public static void main(String args[]) {
		
		//Creating physical Objects for the Logical Employee class...
		/*Employee rajee = new Employee(); //Invoking constructor...
		rajee.loginIntoWebExSession();

		Employee nitin = new Employee(); //Invoking constructor...
		nitin.loginIntoWebExSession();

		Employee pankaj = new  Employee();
		pankaj.loginIntoWebExSession(11111,"1234");

		Employee suyat = new  Employee();
		suyat.loginIntoWebExSession(11111);*/

		ContractEmployee rajee = new ContractEmployee(); //Invoking constructor...
		rajee.loginIntoWebExSession(1122,"1234","Rajee");

	}//End of main method...

} //End of the Class