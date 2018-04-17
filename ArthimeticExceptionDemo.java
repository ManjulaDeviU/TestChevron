public class ArthimeticExceptionDemo
 {
  public static void main(String[] args)
    {
      int firstNumber=0;
      int secondNumber=30;
       try
       {
         System.out.println("Number1=" + firstNumber +" Number2=" 
						+ secondNumber);
         secondNumber = secondNumber/firstNumber;   //Exception is thrown...
         System.out.println("Output : " + secondNumber);
         System.out.println("This will not be executed");
       }
       catch(ArithmeticException e)
       {
         System.out.println("Exception raised "+ e);
         firstNumber=5;
         secondNumber = secondNumber/firstNumber;
         System.out.println("Output is:" + secondNumber);
         System.out.println("This will be executed");
       }
    catch(Exception e)
       {
         System.out.println("Exception raised "+ e);
       }
       finally {   System.out.println("This also will be executed at any cost");   }
     }
 }    


/*Output:
a=0 d=30
Exception raised java.lang.ArithmeticException: / by zero
This will be executed
This also will be executed*/
