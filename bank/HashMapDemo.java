package bank;

import java.util.*;

public class HashMapDemo
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //Employee e1 = new Employee();
        HashMap hm = new HashMap(5);
        hm.put("S1", "Saradhi");
        hm.put("Salary", new Double(5000.00));
        hm.put("Age", new Integer(35));
        //hm.put("id",e1);

        System.out.println("Salary Key Exits :" + hm.containsKey("Name"));
        System.out.println("Salary Key Value Exits :" + hm.containsValue("Saradhi"));

        System.out.println("Value of Name Key is :" + hm.get("Name"));
        System.out.println("No of Elements is :" + hm.size());

        System.out.println("Printing the Values Using Iterator");

        Set allkeys = hm.keySet();  //Returns a set of keys contained in hm.
        Iterator it = allkeys.iterator(); //Returns an object to Iterator.

        while(it.hasNext())
        {
            Object obj = it.next();
            System.out.println(obj + ":" + hm.get(obj)); //Return the value 				                   //associated with key object.
        }

    }

}
