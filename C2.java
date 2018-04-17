public class C2
{
    //protected int no1=10;
    private int no3=20;
   
    public void displayC2() {
	System.out.println("Number No3 Value "+no3);
    }

  public static void main(String s[]) {
	C2 c = new C2();
	c.displayC2();

	C1 c1 = new C1();
	c1.displayC1();
	c1.no1 = 25;
	System.out.println("Number 1 = " + c1.no1);
     }
}