class Employee
{
  public int employeeId;
  public String employeeName;
  public int employeeAge;

  public Employee()
  {
    System.out.println(" 1st Constructor......");
    employeeId = 295957;
    employeeName = "Parinika";
  }

  //Overloaded Constructor
  public Employee(int x, String name)
  {
    System.out.println(" 2nd Constrctior......");
    employeeId = x;
    employeeName = name;
  }

  //Overloaded Constructor
  public Employee(int age, int id)
  {
    System.out.println(" 3rd Constrctior......");
    employeeAge = age;
    employeeId = id;
  }

 //Overloaded Constructor
  /*public Employee(int Age, int eid)
  {
    System.out.println(" 4th Constrctior......");
    employeeAge = Age;
    employeeId = eid;
  }*/

   public void displayEmployeeDetails()
   {
     System.out.println("Employee Id : " + employeeId );
     System.out.println("Employee Name : " + employeeName );
     System.out.println("Employee Age : " + employeeAge );
   }

}//End of Class

//Implementation Class
public class EmployeeImplementationClass
{
  public static void main(String a[])
  {
  Employee Parinika = new Employee();
  Parinika.employeeId = 565656;
  //Parinika.employeeName = "SSSS";
  Parinika.displayEmployeeDetails();

  Employee Radhika = new Employee(34343,"Radhika");
  Radhika.displayEmployeeDetails();

  Employee Venu = new Employee(5, 34);
  Venu.displayEmployeeDetails(); 

  Employee Saket = new Employee(3, 3454);
  Venu.displayEmployeeDetails(); 
}
}
