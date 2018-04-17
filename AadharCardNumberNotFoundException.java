//User Defined Exception Class...

public class AadharCardNumberNotFoundException extends RuntimeException {

	private String exceptionMessage;

	public AadharCardNumberNotFoundException() {
		super();
	}

	public AadharCardNumberNotFoundException(String exceptionMessage) 	{
		super();
		this.exceptionMessage = exceptionMessage;
	}

	public String toString() {
		return exceptionMessage;
	}
}