import java.util.*;
public class HashSetDemo
{
    public static void main(String[] args)
    {
        HashSet hts = new HashSet();
        //Set hts = new HashSet();
        //HashSet<String> hts = new HashSet<String>();
        String name = new String("batch1007");
        hts.add("SN Rao");
        hts.add("Author");
        hts.add("Java Essentials");
        hts.add("surenagrao@yahoo.co.in");
        hts.add(name);
        hts.add(name);

        System.out.println("Number of Elements :" + hts.size());
        System.out.println("Number of Elements :" + name.hashCode());
        System.out.println(hts);

        Iterator it = hts.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }

}