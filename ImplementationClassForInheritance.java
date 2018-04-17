class A
{
  int x = 10;

  void someFunctionA() { 
     System.out.println("In Super Class");
  }

}//Super Class...


class B extends A
{
  int xB = 10;

  void someFunctionB() { 
     System.out.println("In Sub Class...B");
  }

}//Sub Class...

class C extends A
{
  int xC = 10;

  void someFunctionC() { 
     System.out.println("In Sub Class...C");
  }

}//Sub Class...

class D extends B , C
{
  int xD = 10;

  void someFunctionD() { 
     System.out.println("In Sub Class...D");
  }

}//Sub Class...


public class ImplementationClassForInheritance {

	public static void main(String args[]) {
		A a = new A();
		a.someFunctionA();
	}
}


class A { ....} 
class B extends A { }
class C extends A { }
class D extends A , C { }








