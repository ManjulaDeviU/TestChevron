public interface ProductDeliveryAndPayment{

	//Abstract Method...
	public void paymentProcessingThroughGateway();
}

interface OrderDispatching extends ProductDeliveryAndPayment{

	//Abstract Method...
	public void trackingTheOrder();
}

interface OrderDelivery extends OrderDispatching, ProductDeliveryAndPayment{

	//Abstract Method...
	public void shippingMode();
}
	
	
	