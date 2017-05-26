// Iterator
/*
import java.util.*;
public class AllIteratators
{
    public static void main(String args[])
    {
        //create a Hashset to store strings
        HashSet<String> hs = new HashSet<String>() ;
 
        // store some string elements
        hs.add("India");
        hs.add ("hello");
        hs.add("Japan");
 
        // Add an Iterator to hs.
        Iterator it = hs.iterator();
 
        // Display element by element using Iterator
        while (it.hasNext())
            System.out.println(it.next());
    }
}

*/

//  ListIterator
import java. util.* ;
 
class AllIteratators
{
    public static void main(String args[])
    {
        // take a vector to store Integer objects
        Vector<Integer> v = new Vector<Integer>();
 
        // Adding Elements to Vector
        v.add(0);
        v.add(20);
        v.add(30);
 
        // Creating a ListIterator
        ListIterator lit = v.listIterator();
        System.out.println("In Forward direction:");
 
        while (lit.hasNext())
            System.out.print(lit.next()+" ") ;
 
        System.out.print("\n\nIn backward direction:\n") ;
        while (lit.hasPrevious())
            System.out.print(lit.previous()+" ");
    }
}

/*
//Enumeration
import java.util.Vector;
import java.util.Enumeration;
public class AllIteratators
{
    public static void main(String args[])
    {
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
 
        // Creating enumeration 
        Enumeration days = dayNames.elements();
 
        // Retrieving elements of enumeration
        while (days.hasMoreElements())
            System.out.println(days.nextElement());
    }
}

*/