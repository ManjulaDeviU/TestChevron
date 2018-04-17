//Program to demonstrate static method.
class StaticDemo
 {
   static int x;
   int y;
   static
    {
      x=4;
      System.out.println("x=" + x);
    }

   void display()
    {
      x = x*2;
      StaticDemo d = new StaticDemo();
      d.y = 10;     
      System.out.println("y=" + d.y);
    }
 }

public class Demo4
 {
   public static void main(String[] args)
    {
      StaticDemo d1 = new StaticDemo();
      d1.y = 10;
      System.out.println("d1.y=" + d1.y);
      System.out.println("x=" + x);
      StaticDemo.display();
    }
 }    
   

/*Output:

x=4
d1.y=10
x=4
y=10*/
