// Program to demonstrate Objects as Parameters to Methods

class Test
 {
   int x;
   void increment(Test t)
    {
      t.x=x*10;
    }
 }

 
public class Demo1
 {
   public static void main(String args[])
    {
      Test t = new Test();
      t.x=10;
      Test t1 = new Test();
      t1.x=20;

      System.out.println("t.x=" + t.x);
      System.out.println("t1.x=" + t1.x);
      t1.increment(t);
      System.out.println("After calling increment() t1.x=" + t.x);
    }
 }      


/*Output:

t.x=10
t1.x=20
After calling increment() t1.x=100*/
