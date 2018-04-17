//Banks Interface...

public interface BanksFacilities {
	public boolean processingHomeLoans();
}

interface POFacilities extends BanksFacilities {
	public boolean processingHomeLoans(String docs);
}

interface CommonFacilities extends BanksFacilities, POFacilities {
	public boolean processingHomeLoans(String docs, int customerAge);
}