//ArrayList Class
package JavaClass.Week12;

import java.util.*;

class arrayListDemo{
     public static void main(String[] args)
     {
          ArrayList<String> a1=new ArrayList<String>();
          //ArrayList is a built-in class name
          //a1 is object name
          System.out.println("The size of 'a1' initially: "+a1.size());
          a1.add("B");
          a1.add("D");
          a1.add("C");
          a1.add("F");
          a1.add("E");
          a1.add("F");

          System.out.println();
          System.out.println("Size of 'a1' ater addition: "+a1.size());
          System.out.println("Elemenrs of 'a1' after addition: "+a1);

          a1.remove("E");
          a1.remove(2);

          System.out.println();
          System.out.println("Elements of 'a1' after deletion: "+a1);
     }
}