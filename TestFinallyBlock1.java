public class TestFinallyBlock1{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(" In Main" );  
   System.out.println(data);  
  }  
  catch(ArithmeticException e){System.out.println(e);}  
  finally{
        try{
	System.out.println("finally block is always executed");
	int data=25/0;  
   	System.out.println(data);  }
           catch(ArithmeticException e) {System.out.println("Nested finally block is always executed"); }
}  
  System.out.println("rest of the code...");  
  }  
}  