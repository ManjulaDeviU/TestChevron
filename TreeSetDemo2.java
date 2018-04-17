import java.util.*;
public class TreeSetDemo2
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        //Set ts = new TreeSet();
        //TreeSet<String> ts = new TreeSet<String>();

        ts.add("SN Rao");
        ts.add("Author");
        ts.add("Java Essentials");
        ts.add("surenagrao@yahoo.co.in");
        ts.add(new Integer(45));

        System.out.println("Number of Elements :" + ts.size());
        System.out.println(ts);

        Iterator it = ts.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }

}