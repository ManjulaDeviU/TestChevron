public class Logisitics implements ProductDeliveryAndPayment{

    //Instance variables..
    private String customerName;
    private int orderId;
    private int shippingId;

    //Instance methods...
     public void shipmentDetails() {
	System.out.println(" In shipmentDetails().... ");
    }

}


public class ImplementationForLogisitics {

public static void main(String a[]) {
	
	//Creating Objects/variables of class type to access the methods....
	Logisitics l1 = new Logisitics();
	l1.shipmentDetails();
	}
}