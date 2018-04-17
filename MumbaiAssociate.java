public abstract class MumbaiAssociate {

	public void attendingTrainingSession(int empid) {
	    System.out.println("Business Logic for attending the training");
	    System.out.println("Attending the training -  WebEx");
	}
	
	//Overloaded Function....
	public void attendingTrainingSession(int empid, int roomoNo) {
	    System.out.println("Business Logic for attending the training");
	    System.out.println("Attending the training -  F2F");
	}

	
	public void attendingTrainingSession(String elearningURL) {
	    System.out.println("Business Logic for attending the training");
	    System.out.println("Attending the training -  eLearning");
	}

	public abstract void bookingTheTrainingRooms();

	public static void main(String args[]) {
		System.out.println("Its Time for Tea!!!");

	/*MumbaiAssociate Sailesh = new MumbaiAssociate();
	Sailesh.attendingTrainingSession(33);

	MumbaiAssociate Hardik = new MumbaiAssociate();
	Hardik.attendingTrainingSession(33,45);

	MumbaiAssociate Parinika = new MumbaiAssociate();
	Parinika.attendingTrainingSession("String elearningURL");*/
	}
}

class RelianceAssociate extends MumbaiAssociate {

	public void attendingTrainingSession(int empid, int roomoNo) {
	    System.out.println("Chaning Business Logic for attending the 			    training");
	    System.out.println("Attending the training -  F2F");
	}

	public void attendingTrainingSession(int empid, int roomoNo,String 					elearningURL) {
	    System.out.println("Chaning Business Logic for attending the 			    training");
	    System.out.println("Attending the training -  F2F");
	}

	public void bookingTheTrainingRooms() { } 
}