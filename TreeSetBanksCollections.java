//Collections Framework...
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;

public class TreeSetBanksCollections {

	public static void main(String ar[]) {	

		//Creating Objects for Banks Class..
		Banks ICICI  = new Banks(95957,"ICICI Bank");
		Banks HDFC = new Banks(2959597,"HDFC Bank");
		Banks SBI	    = new Banks(95,"SBI Bank");
		Banks HSBC = new Banks(9333,"HSBC Bank");

		//TreeSet newBanksCollection =  new TreeSet();
		//HashSet newBanksCollection =  new HashSet();

		TreeSet<Banks> newBanksCollection =  
					new TreeSet<Banks>();

		//Adding the Banks objects into the Collection class...
		/*newBanksCollection.add("ICICI");
		newBanksCollection.add("HDFC");
		newBanksCollection.add("SBI");
		newBanksCollection.add("HSBC");
		newBanksCollection.add("48484");
		newBanksCollection.add("48484");*/
		//newBanksCollection.add("HSBC");

		newBanksCollection.add(ICICI);
		newBanksCollection.add(HDFC);
		newBanksCollection.add(SBI);
		newBanksCollection.add(HSBC);

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
