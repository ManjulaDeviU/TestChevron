package arthimeticFunctions;

//Public class with Function for Calculating numbers....
public class Calculations {

  public int addingTwoNumbers(int numberOne, int numberTwo) {
	return numberOne + numberTwo;
  }

  public int addingThreeNumbers(int numberOne, int numberTwo, int 						numberThree) {
	return numberOne + numberTwo + numberThree;
  }

} 

//Public interface.....
interface MathCalculations {
	public void addingTwoNumbers(int numberOne, int numberTwo);

}
