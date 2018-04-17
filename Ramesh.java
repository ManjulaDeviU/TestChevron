class User {

	private int userId;
	private String userName = "Ramesh";
	private int chequeNumber;

	public int onlineChequeDeposit(int chequeNumber) {
		System.out.println("In onlineChequeDeposit()...");
		return 0;
	}

	public static void main(String a[]) {
		User ramesh = new User();
		ramesh.onlineChequeDeposit(67566);
	}
}