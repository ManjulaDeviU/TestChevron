//Access specifiers at class : public, protected, default.
//Access modifers at class : final, abstract. 

import java.util.Date;

public class Consumer {

	//Properties/attributes/variables...
	//Access specifiers at variables : private, public, protected, default.
	//Access modifers at variables : static, final, abstract. 
	private long ConsumerId;
	private String ConsumerName;
	private String ConsumerAddress;
	private Date ConsumerDOB;

	//Functions/Methods...
	//Access specifiers at method : private, public, protected, default.
	//Access modifers at method : static, final, abstract. 
	public float calculatingMonthlyBillingAmountOfConsumer() {
		System.out.println("Business logic for calculating montly billing goes here!!!!");	
		return 0;	
	}

	//main megthod...
	public static void main(String arg[]) {

		//Creating Objects for the Consumer...
		Consumer satish = new Consumer();
		satish.calculatingMonthlyBillingAmountOfConsumer();
	}

} //End of main class....