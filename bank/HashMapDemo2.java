//Program for HashMap class.
package bank;

import java.util.*;

public class HashMapDemo2
{
  @SuppressWarnings("unchecked")
  public static void main(String arg[])
   {

	//HashMap<String, Double> hm = new HashMap<String, Double>();
	HashMap hm = new HashMap();
	
	//put the elements to the map.
	hm.put(null,new Double(3434.34));
	hm.put("Radhika", null);
	hm.put("Tanusree", new Double(1345.00));
	hm.put("Laxmi", new Double(-12.32));

	
	//get a set of the entries.
	 Set allkeys = hm.keySet();  //Returns a set of keys contained in hm.
        	Iterator it = allkeys.iterator(); //Returns an object to Iterator.

        	while(it.hasNext())
        	{
            		Object obj = it.next();
            		System.out.println(obj + ":" + hm.get(obj)); //Return the value 				                   //associated with key object.
        	}

    }

}//End of class.