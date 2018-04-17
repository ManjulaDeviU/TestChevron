package bank;

//Implementation of Collection using Collections class...
import java.util.*;

public class CustomerCollections {

@SuppressWarnings("unchecked")
 public static void main(String[] args) throws Exception
    {
        //List <String>a = new ArrayList<String>();
        	 //ArrayList<Customer> a = new ArrayList<Customer>();
	 //LinkedList<Customer> a = new LinkedList<Customer>();

	 //Set<Customer> a = new TreeSet<Customer>();
	TreeSet a = new TreeSet();
	//HashSet a = new HashSet();
        	 /*a.add(new Customer("Saradhi"));
	 a.add(new Customer("Parinika"));
	 a.add(new Customer("Radhika"));
	 a.add(new Customer("Vassu"));*/

	 a.add("Saradhi");
	 a.add("Parinika");
	 a.add("Asha");
	 a.add("45");
 	 a.add("45");	

        	System.out.println("\nElements in Array List Collection Class:");

        	Iterator i=a.iterator();
        	while(i.hasNext()) { 
		//Customer c1 = (Customer)i.next();
		//Object c1 = (Object)i.next();
		//System.out.println(c1+" "); 
		System.out.println(i.next()+" ");
	}
            		//System.out.println(i.next()+" ");
    }

}
