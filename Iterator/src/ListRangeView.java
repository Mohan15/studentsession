 import java.util.*;
public class ListRangeView
{
    public static void main (String[] args)
    {
        // Type safe array list, stores only string
        List<String> l = new ArrayList<String>(5);
 
        l.add("Core Java");
        l.add("JS");
        l.add("Servlet");
        l.add("JSP");
        l.add("Ajax");
LinkedList lo=new LinkedList();
        List<String> range = new ArrayList<String>();
 
        // return List between 2nd(including)
        // and 4th element(excluding)
        range = l.subList(2, 4);
 
        System.out.println(range);  // [GeeksQuiz, IDE]
    }
}
