
 import java.util.*;

public class ListSearchOperations
{
   public static void main(String[] args)
   {
       // type safe array list, stores only string
       List<String> l = new ArrayList<String>(5);
       l.add("Write");
       l.add("Once");
       l.add("Run");
       l.add("AnyWhere");

       // Using indexOf() and lastIndexOf()
       System.out.println("first index of Java:" +
                                 l.indexOf("Once"));
       System.out.println("last index of Java :" +
                              l.lastIndexOf("AnyWhere"));
       System.out.println("Index of element not present : " +
                               l.indexOf("Anywhere"));//Case sensitive
   }
}
