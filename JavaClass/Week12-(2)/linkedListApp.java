//LinkedList Class
import java.util.*;

class linkedListApp
{
     public static void main(String[] args)
     {
          LinkedList<String> l1=new LinkedList<String>();
          
          l1.add("F");
          l1.add("B");
          l1.add("C");
          l1.add("A");
          l1.add("Z");
          System.out.println("Original contents of l1: "+l1);

          l1.remove("B");
          l1.remove(2);
          System.out.println("Contents of l1 after removing: "+l1);

          l1.removeFirst();
          l1.removeLast();
          System.out.println("Contents of l1 after removing first and last: "+l1);

          String val=l1.get(2);
          l1.set(2, val+"changed");
          System.out.println("Contents pf l1 after change: "+l1);
     }
}