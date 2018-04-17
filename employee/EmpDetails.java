package employee;

public class EmpDetails
{
static int idno;
String name;
int salary;

EmpDetails()
	{
	idno=101;
	name="Kalyani";
	salary=7000;
	}
public void display()
	{
	   idno = 95957;
	   System.out.println("EIDNO:"+idno);
	   System.out.println("ENAME:"+name);
	   System.out.println("BASIC:"+salary);
	}

	public static void main(String str[]) 
	{ 
		EmpDetails e1 =  new EmpDetails();
		e1.display();	
	}		
}
