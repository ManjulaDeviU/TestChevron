//Creating interface.....
interface CalculateEmployeeSalary
{
   void calculateNetSalary();
}

//AbstractEmployee.Java
//abstract class AbstractEmployee
class AbstractEmployee implements CalculateEmployeeSalary, 
{
    protected String firstName;
    protected String lastName;
    protected int basicSalary;

    public AbstractEmployee() { }  //Default Constructor
    //abstract void calculateNetSalary();  //Abstract Method

    //Overriding the Interface method....
     public void calculateNetSalary() {
	basicSalary = basicSalary + 2500;
      }
    void getEmployeeDetails()
    {
        firstName = "Kamesh";
        lastName = "Reddy";
        basicSalary = 45000;
    }
    void displayEmployeeDetails()
    {
        System.out.println("Employee First Name:" + firstName);
        System.out.println("Employee Last Name:" + lastName);
        System.out.println("Employee Basic Salary:" + basicSalary);
    }
}

class AbstractRegularEmployee extends AbstractEmployee implements CalculateEmployeeSalary
{
    private int regularEmployeeBasicSalary;
    private int netSalaryOfRegularEmployee;
    void getRegularEmployeeDetails(int regularEmployeeBasicSalary)
    {
        super.getEmployeeDetails();
        this.regularEmployeeBasicSalary = regularEmployeeBasicSalary;
    }
    public void calculateNetSalary() //Overriding Abstract Method
    {
        netSalaryOfRegularEmployee = regularEmployeeBasicSalary + 2500;
    }

    void displayRegularEmployeeDetails()
    {
        displayEmployeeDetails();
        System.out.println("Regular Employee Salary :" + 				netSalaryOfRegularEmployee);
    }
}

//EmployeeMain.java
public class EmployeeMain
{
    public static void main(String[] args)
    {
         //Abstract Employee Class
        AbstractEmployee ae = new AbstractEmployee();
        //ae.getEmployeeDetails("Hemanth","Reddy",0);
        ae.getEmployeeDetails();
        ae.calculateNetSalary();
        ae.displayEmployeeDetails();

        AbstractRegularEmployee hemanth = new AbstractRegularEmployee();
        hemanth.getRegularEmployeeDetails(45000);
        hemanth.calculateNetSalary();
        hemanth.displayRegularEmployeeDetails();
    }
}

