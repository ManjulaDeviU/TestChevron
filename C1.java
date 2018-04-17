public class C1
{
    int no1=10; //Default..
    private int no2=20;
   
    public void displayC1() {
	System.out.println("Number No1 Value "+no1);
	System.out.println("Number No2 Value "+no2);
    }

  public static void main(String s[]) {
	C1 c = new C1();
	c.displayC1();
     }
}