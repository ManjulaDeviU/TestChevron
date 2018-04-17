//Collections Framework...
import java.util.Iterator;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Set;

public class BanksCollections {

	public static void main(String ar[]) {

		//Creating Objects for Banks Class..
		Banks ICICI  = new Banks(95957,"ICICI Bank");
		Banks HDFC = new Banks(2959597,"HDFC Bank");
		Banks SBI	    = new Banks(95,"SBI Bank");
		Banks HSBC = new Banks(9333,"HSBC Bank");
	
		//Storing the Objects using the Java Collections Classess...
	     	ArrayList<Banks> newBanksCollection =  new 						ArrayList<Banks>();

		//Adding the Banks objects into the Collection class...
		newBanksCollection.add(ICICI);
		newBanksCollection.add(HDFC);
		newBanksCollection.add(SBI);
		newBanksCollection.add(HSBC);
		newBanksCollection.add(HSBC);
		//newBanksCollection.add("Parinika");
		//newBanksCollection.add(295957);

		//Iterating the objects stored in the Collection...
		Iterator<Banks> banksIterator = 
				newBanksCollection.iterator();

		//Retrieve the objects from the iterator...
		while(banksIterator.hasNext()) {
			Banks newBanks = (Banks)banksIterator.next();
			//Object newBanks = banksIterator.next();
			System.out.println(newBanks);
		}
	}

}