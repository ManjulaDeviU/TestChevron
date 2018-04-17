package bank;

public class Accountant implements DepostingCashInterface {
	
	//Function Overiding...
	public float depositCash(int accountNumber, double accountBalance) {

	System.out.println("Implementation method()....");

	}

	public static void main(String b[]) {

	//Creating Objects for the Customer class...
	Accountant popuriYaswanth = new Accountant();
	popuriYaswanth.depositCash(5757,44.77);

	}

}