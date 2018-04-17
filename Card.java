public class Card {

	//Declare Variables...
	private int cardNumber;
	private String cardName;
	private int expiryDate;
	private String cardType;
	private String accountType;
	private int pinNumber;
	private int withdrawlAmount;
	
	Card() {
		//super();
		System.out.println("In Default Constructor()...");
	}
	
	//Parameterized Contructor..
	Card(int cardNumber, String cardName, int expiryDate) {
		System.out.println("In Parameterized Constructor()");
		this.cardNumber = cardNumber;
		this.cardName = cardName;
		this.expiryDate = expiryDate;
	}

	//Overloaded Parameterized Contructor..
	Card(int cardNumber, int pinNumber, int expiryDate) {
		System.out.println("In Overloaded Parameterized 		Constructor()");
		this.cardNumber = cardNumber;
		this.pinNumber = pinNumber;
		this.expiryDate = expiryDate;
	}

	//Overloaded Parameterized Contructor..
	Card(int cardNumber, String cardName) {
		System.out.println("In Overloaded Parameterized 		Constructor()");
		this.cardNumber = cardNumber;
		this.cardName = cardName;
	}

	//Functions...
	public void storingCriticalCustomerInformation() {
	      //Defining the business logic for storing customer Critical..
	       System.out.println("In storingCriticalCustomerInformation()...");
	}

	public int withdraw(String accountType, int pinNumber, 
				int withdrawlAmount) {
	       //Defining the business logic for withdraw..
	       System.out.println("In withdraw()...");
	        return 0;
	}

	//User Defined Function...
	public void onlineShopping(int cardNumber, int cvvNumber, int 			            expiryDate, int OTP) {
	
	//Defining the business logic for online Shopping process..
	       System.out.println("In onlineShopping()...");
	}

	//Overloading the onlineShopping()....
	public void onlineShopping(int cardNumber, int cvvNumber, int 			            expiryDate, int OTP, int transactionPwd) {
	
	//Defining the business logic for online Shopping process..
	       System.out.println("In Overloaded onlineShopping()...");
	}

public static void main(String arg[]) {

	Card debitCard = new Card();

	//Invokig the User Defined Functions...
	debitCard.storingCriticalCustomerInformation();

	Card creditCard =  new Card(2424, 4646, 12122019);
	creditCard.onlineShopping(35,45,23,23,4);

	Card aadharCard = newCard(34343, "Aadhar");
	
	}
} //Class Closing




class CreditCard extends Card {

	private int creditLimit;

	public void changingTheCreditLimit(CCNo, CardLimit, ReqLimit) {
	
	// 5 Steps

	}

}

class MoneyBackCreditCards extends CreditCard {

	public void changingTheCreditLimit(CCNo, CardLimit, ReqLimit) {
	
	// 5 Steps

	}

	public void changingTheCreditLimit(CardLimit, ReqLimit) {
	
	// 5 Steps

	}
 }

class RewardCreditCards extends CreditCard {

 }












