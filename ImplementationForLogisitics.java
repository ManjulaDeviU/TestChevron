import arthimeticFunctions.Calculations;

//class Logisitics implements ProductDeliveryAndPayment
//class Logisitics implements OrderDispatching
class Logisitics implements OrderDelivery {

    //Instance variables..
    private String customerName;
    private int orderId;
    private int shippingId;

    //Instance methods...
     public void shipmentDetails() {
	System.out.println(" In shipmentDetails().... ");
    }

	public void shippingMode() {
	System.out.println(" In shippingMode().... ");
}
	
	public void trackingTheOrder(){
	System.out.println(" In trackingTheOrder().... ");
}

	public void paymentProcessingThroughGateway(){
	System.out.println(" In paymentProcessingThroughGateway().... ");
}

}


public class ImplementationForLogisitics {

public static void main(String a[]) {
	
	//Creating Objects/variables of class type to access the methods....
	Logisitics l1 = new Logisitics();
	l1.shipmentDetails();

	Calculations c1 = new Calculations();
	System.out.println(c1.addingTwoNumbers(45,55));
	}
}