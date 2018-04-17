public class EmpDetails
{
int idno;
String name;
final int salary;

EmpDetails()
	{
	idno=101;
	name="Kalyani";
	salary=7000;
	}
public void display()
	{
	   private int idnumber = 95957;
	   System.out.println("EIDNO:"+idno);
	   System.out.println("ENAME:"+name);
	   System.out.println("BASIC:"+salary);
	}

	public static void main(String str[]) 
	{ 
		//private int ino;
		EmpDetails e1 =  new EmpDetails();
		EmpDetails e2 =  new EmpDetails();	
		e1.display();
		e2.display();	
	}		
}
