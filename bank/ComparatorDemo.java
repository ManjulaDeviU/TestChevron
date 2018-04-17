package bank;
import java.util.Comparator;
import java.lang.Comparable;
import java.util.*;

class MyComparator implements Comparator<String>
{
	public int compare(String str1,String str2)
	 {
	   String astr,bstr;
	   astr = str1;
	   bstr = str2;
	   System.out.println("In Comparator...");

	   return bstr.compareTo(astr);

/*The result is a negative integer if this String object lexicographically precedes the argument string. The result is a positive integer if this String object lexicographically follows the argument string. The result is zero if the strings are equal;*/
         }
}



public class ComparatorDemo
{
   public static void main(String[] args)
    {
        MyComparator mc = new MyComparator();
        TreeSet<String> ts1 = new TreeSet<String>();
        TreeSet<String> ts2 = new TreeSet<String>(mc);

        //Adds the elements to the tree set.
        ts1.add("Camel");
        ts1.add("Zebra");
        ts1.add("Rabbit");
        ts1.add("Allegator");
        ts1.add("Tortoise");

        ts2.add("Zebra");
        ts2.add("Camel");
        ts2.add("Rabbit");
        ts2.add("Allegator");
        ts2.add("Tortoise");
	
        System.out.println("Default Elements in Default/Ascending Order : ");
        System.out.println("\t" + ts1);

        System.out.println("Elements with Comparator : ");
        System.out.println("\t" + ts2);
	
    }

}
