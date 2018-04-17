class A {
	private void someMethod() { 
		System.out.println("A...");
	}
}

class B extends A{
	private void someMethod() { 
		System.out.println("B...");
	}
}

public class Main {

public static void main(String s[]) {
          A a = new A();
          a.someMethod();
	}
}