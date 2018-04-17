import java.util.Scanner;
class HelpDesk
{
  /*public String Query();
  public String FacultyClub();
  public String Dorms();
  public String Labs();*/
  public class A
{ 
    public void Query()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER YOUR QUERY");
    String q1=s.next();
    System.out.println("QUERY:" +q1);
    s.close();
  }
    public void FacultyClub()
    {
      System.out.println("Related query ans");
    }
     public void Labs()
    {
     System.out.println("Related query ans");
    }
    public void Dorms()
   {
    System.out.println("Related query ans");
   }
}
    public static void main(String[]a)
   {
   String query,facultyclub,labs,dorms;
          A a1= new A();
       	if( q1==facultyclub)
                {
                   a1.FacultyClub();
                }
               else if(q1==labs)
               {
                 a1.Labs();
               }
              else if(q1==dorms)
              {
               a1.Dorms();
              } 
             else
             {
             System.out.println("Unrelated query");
            }
    }
 }