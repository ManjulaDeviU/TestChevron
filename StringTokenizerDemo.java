import java.util.StringTokenizer;
public class StringTokenizerDemo
{
    public static void main(String[] args)
    {
        String str1 = "Hello Everybody;How,are you doing"
                      + "Are you all okay;Thank You";

        StringTokenizer st = new StringTokenizer(str1," ,;/");
        System.out.println("Number of Tokens :" + st.countTokens());

        while(st.hasMoreTokens())
                System.out.println(st.nextToken());
    }

}
