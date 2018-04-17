package bank;

public class TestCustomer {

	public static void main(String[] args) 
	{
		Result result = JUnitCore.runClasses(TestSample.class); 
		
		for (Failure failure : result.getFailures()) 
		{ 
			System.out.println(failure.toString()); 
		} 
		
		System.out.println(result.wasSuccessful());
	}
		

} // Class end...