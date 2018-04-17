public class Employee
{
  public static void Main(String a)
   {
      System.out.println("Hello Welcome to All......");
      System.out.println(a);
   }
 
   public static void main(String ar[])
   {
      Employee e= new Employee();
      Employee e1= new Employee();
      Employee.Main("From The Main....");
      e.Main();
   }

    public static void Main()
   {
       int static no1=10;
      Employee e1= new Employee();
      e1.Main("hELO");
   }

  
}