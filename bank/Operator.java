package bank;

public class Operator{
	public int queryId;
	public float time;
	public String queryDescription;

	//Constructor
	
	public Operator(int queryId, String queryDescription){
	
	this.queryId = queryId;
	this.queryDescription =queryDescription;
	}
	
	//methods
	
	public void checkForuncertainity(int queryId){
	System.out.println("Check for uncertainity in query");
	}
	
	public void forwardToDepartment(int queryId, String queryDescription){
	System.out.println("Forward query to concerned department");
	}
	
	public boolean CheckStatusOfQuery(int queryId){
	System.out.println("Check status of query if not resolved with in 24hrs escalate to higher authorities");
	return false;
	}
	
	public void someMethod() {
	System.out.println("Some.....");
	}

	public static void main(String a[]) {
	Operator sumi = new Operator(99,"FFF"); 
	sumi.someMethod();
	}

	//sumi.someMethod();

	//Operator sumi = new Operator(99,"FFF");

	//Student studentQuery = new Student();
	//studentQuery.studentPostQuery();
	//this.queryId = studentQuery.queryId;
	//this.queryDescription = studentQuery.studentQuery;
	//Faculty sumi = new Faculty(789, "Ramurthy", "Computer Science", 1245);
	
}