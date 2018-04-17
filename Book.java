//First Program to Display Text.
import java.util.Scanner;
public class Book
{
   public void displayingEvenOddNumber() {
	//System.out.println(" The Book Name is : Core Java....");
	
	int numberToCheck = 0;
           System.out.println("Enter a number to check whether it is odd or Even");
	
	Scanner in=new Scanner (System.in);
	numberToCheck=in.nextInt();

	if(numberToCheck%2==0)
	      System.out.println("The number you entered is an even number");
                              else
	      System.out.println("The number you  entered  is an odd number");
   }

   public static void main(String arg[])
	{
		Book textBook =  new Book();   //Creating object/variable 					   		  //of Book type.
		Book DrawingBook =  new Book(); 

		textBook.displayingEvenOddNumber();

		int numberOne=78;
		System.out.println("Hello....All..This is My First Java Prg.");
		System.out.println("Java Prg.");
		System.out.println("The Value of Number : " + numberOne);
	}
}//Closing the class.