public class AccessSpecifiersDemo
{
  static protected int x = 10;

  static public void main(Integer a[])
   {
     AccessSpecifiersDemo a1 = new AccessSpecifiersDemo();
     System.out.println(x);

     AccessSpecifiersDemo2 a2 = new AccessSpecifiersDemo2();
     a2.AccessVariable();
   }
}

class AccessSpecifiersDemo2
{
   public void AccessVariable()
   {
     AccessSpecifiersDemo a1 = new AccessSpecifiersDemo();
     System.out.println(a1.x);
   }
}

  