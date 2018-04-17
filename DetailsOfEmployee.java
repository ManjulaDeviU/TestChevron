class Employee
{
	private int employeeCode;
	String employeeName;
	double basicPayOfEmployee;
	double hraOfEmployee;
	double pfOfEmployee;
	double licOfEmployee;
	//double grossPay;
	
	
	Employee()
	{
		employeeCode=5123765;
		employeeName="abc";
		basicPayOfEmployee=80000;
		hraOfEmployee=10000;
		pfOfEmployee=5000;
		licOfEmployee=6000;
		
	}
	public void grossPayOfEmployee()
	{
		double grossPay=(basicPayOfEmployee+hraOfEmployee-pfOfEmployee);
		System.out.println("the Gross Pay of Employee is:" +grossPay);
	}
	public void deductionsInPay()
	{
		double deductions=pfOfEmployee+licOfEmployee;
		
		System.out.println("the Deductions in pay of employee's salary is:" +deductions);
	}
	public void paySlipOfEmployee()
	{
		System.out.println("the name of the employee is:" +employeeName);
 		System.out.println("the employee code of the employee is:" +employeeCode);
	
		System.out.println("the basic pay of the employee is:" +basicPayOfEmployee);
		System.out.println("the hra of the employee is:" +hraOfEmployee);
		System.out.println("the pf of the employee is:" +pfOfEmployee);
		System.out.println("the lic of the employee is:" +licOfEmployee);
		System.out.println("the Gross pay of the employee is:" +grossPay);
	}
}

public class DetailsOfEmployee
{
	public static void main(String args[])
	{
		Employee details=new Employee();
		
		details.grossPayOfEmployee();
		details.deductionsInPay();
		details.paySlipOfEmployee();
	}
}	