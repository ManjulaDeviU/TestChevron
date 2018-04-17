package bank;

public interface CalculatingCustomerEMIInterface {

//Abstract methods...
public void calculatingEMI( float totalLoan, float interestRate, String customerType);
//public void calculatingEMI( float totalLoan, String customerType);

}


public interface DepostingCashInterface extends CalculatingCustomerEMIInterface {

//Abstract methods...
public float depositCash(int accountNumber, double accountBalance);

}